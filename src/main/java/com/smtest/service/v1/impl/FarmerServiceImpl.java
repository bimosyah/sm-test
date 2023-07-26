package com.smtest.service.v1.impl;

import com.smtest.entity.Farmer;
import com.smtest.enumeration.StatusEnum;
import com.smtest.repository.FarmerRepository;
import com.smtest.request.FarmerRequest;
import com.smtest.response.FarmerResponse;
import com.smtest.service.v1.FarmerService;
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
public class FarmerServiceImpl implements FarmerService {

    private final FarmerRepository farmerRepository;

    @Override
    public String registeredFarmer(FarmerRequest farmerRequest) {
        Farmer farmer = Farmer.builder()
                .name(farmerRequest.getName())
                .bod(farmerRequest.getBod())
                .phone(farmerRequest.getPhone())
                .address(farmerRequest.getAddress())
                .postalCode(farmerRequest.getPostalCode())
                .ktpNumber(farmerRequest.getKtpNumber())
                .ktpImg(farmerRequest.getKtpImgUrl())
                .selfieImg(farmerRequest.getSelfieImgUrl())
                .status(StatusEnum.PENDING)
                .approvalDocUrl(farmerRequest.getApprovalDocUrl())
                .build();
        EntityUtil.created(farmer, "SYSTEM");
        farmerRepository.save(farmer);

        return "Farmer Created";
    }

    @Override
    public List<FarmerResponse> getFarmerList() {
        List<Farmer> farmerList = farmerRepository.findAllByActiveTrue();
        return farmerList.stream()
                .map(farmer -> FarmerResponse.builder()
                        .id(farmer.getId())
                        .name(farmer.getName())
                        .bod(farmer.getBod())
                        .phone(farmer.getPhone())
                        .address(farmer.getAddress())
                        .postalCode(farmer.getPostalCode())
                        .ktpNumber(farmer.getKtpNumber())
                        .ktpImgUrl(farmer.getKtpImg())
                        .selfieImgUrl(farmer.getSelfieImg())
                        .status(StatusEnum.PENDING.name())
                        .approvalDocUrl(farmer.getApprovalDocUrl())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public String updateFarmer(String farmerId, FarmerRequest farmerRequest) {
        Farmer farmer = farmerRepository.findById(farmerId)
                .orElseThrow(() -> new BadRequestException("Farmer Id Not Found"));

        farmer.setName(farmerRequest.getName());
        farmer.setBod(farmerRequest.getBod());
        farmer.setPhone(farmerRequest.getPhone());
        farmer.setAddress(farmerRequest.getAddress());
        farmer.setPostalCode(farmerRequest.getPostalCode());
        farmer.setKtpNumber(farmerRequest.getKtpNumber());
        farmer.setKtpImg(farmerRequest.getKtpImgUrl());
        farmer.setSelfieImg(farmerRequest.getSelfieImgUrl());
        farmer.setApprovalDocUrl(farmerRequest.getApprovalDocUrl());
        EntityUtil.modifiedBy(farmer, "SYSTEM");

        farmerRepository.save(farmer);
        return "Farmer Updated";
    }

    @Override
    public String deleteFarmer(String farmerId) {
        Farmer farmer = farmerRepository.findById(farmerId)
                .orElseThrow(() -> new BadRequestException("Farmer Id Not Found"));

        EntityUtil.deleted(farmer, "SYSTEM");
        farmerRepository.save(farmer);
        return "Farmer Deleted";
    }
}
