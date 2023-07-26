package com.smtest.service.v1.impl;

import com.smtest.entity.Area;
import com.smtest.entity.Farmer;
import com.smtest.enumeration.StatusEnum;
import com.smtest.repository.AreaRepository;
import com.smtest.repository.FarmerRepository;
import com.smtest.request.AreaRequest;
import com.smtest.response.AreaResponse;
import com.smtest.service.v1.AreaService;
import com.smtest.utils.EntityUtil;
import com.smtest.utils.exceptions.BadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class AreaServiceImpl implements AreaService {

    private final AreaRepository areaRepository;
    private final FarmerRepository farmerRepository;

    @Override
    public String registeredArea(AreaRequest areaRequest) {
        int totalArea = (int) areaRepository.count();

        String code = "AREA-" + (totalArea + 1);
        Farmer farmer = farmerRepository.findById(areaRequest.getFarmerId())
                .orElseThrow(() -> new BadRequestException("Farmer Not Found"));

        Area area = Area.builder()
                .code(code)
                .farmer(farmer)
                .areaDocUrl(areaRequest.getAreaDocUrl())
                .landArea(areaRequest.getLandArea())
                .statusEnum(StatusEnum.PENDING)
                .landVideoUrl(areaRequest.getVideoDocUrl())
                .build();
        EntityUtil.created(area, "SYSTEM");

        areaRepository.save(area);
        return "Area Created";
    }

    @Override
    public List<AreaResponse> getAreaList() {
        List<Area> areaList = areaRepository.findAllByActiveTrue();

        return areaList.stream()
                .map(area -> AreaResponse.builder()
                        .id(area.getId())
                        .status(area.getStatusEnum().name())
                        .landArea(area.getLandArea())
                        .areaDocUrl(area.getAreaDocUrl())
                        .videoDocUrl(area.getLandVideoUrl())
                        .farmerName(area.getFarmer().getName())
                        .code(area.getCode())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public String updateArea(String areaId, AreaRequest areaRequest) {
        Area area = areaRepository.findById(areaId)
                .orElseThrow(() -> new BadRequestException("Area Not Found"));

        Farmer farmer = farmerRepository.findById(areaRequest.getFarmerId())
                .orElseThrow(() -> new BadRequestException("Farmer Not Found"));

        area.setFarmer(farmer);
        area.setAreaDocUrl(areaRequest.getAreaDocUrl());
        area.setLandArea(areaRequest.getLandArea());
        area.setLandVideoUrl(areaRequest.getVideoDocUrl());

        return "Area Updated";
    }

    @Override
    public String deleteArea(String areaId) {
        Area area = areaRepository.findById(areaId)
                .orElseThrow(() -> new BadRequestException("Area Not Found"));

        EntityUtil.deleted(area, "SYSTEM");
        areaRepository.save(area);
        return "Area Deleted";
    }
}
