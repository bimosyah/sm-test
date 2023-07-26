package com.smtest.controller.v1.impl;

import com.smtest.controller.v1.AreaController;
import com.smtest.request.AreaRequest;
import com.smtest.response.BaseResponse;
import com.smtest.service.v1.AreaService;
import com.smtest.utils.ResponseHelper;
import com.smtest.utils.exceptions.TooManyRequestException;
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AreaControllerImpl implements AreaController {

    @Autowired
    private AreaService areaService;

    private Bucket bucket;

    public AreaControllerImpl() {
        Bandwidth limit = Bandwidth.classic(2, Refill.greedy(2, Duration.ofMinutes(1)));
        this.bucket = Bucket4j.builder()
                .addLimit(limit)
                .build();
    }

    @Override
    public ResponseEntity<BaseResponse> registerArea(AreaRequest areaRequest) {
        return ResponseHelper.buildOkResponse(areaService.registeredArea(areaRequest));
    }

    @Override
    public ResponseEntity<BaseResponse> getAreaList() {
        if (bucket.tryConsume(1)) {
            return ResponseHelper.buildOkResponse(areaService.getAreaList());
        } else {
            throw new TooManyRequestException();
        }
    }

    @Override
    public ResponseEntity<BaseResponse> updateArea(String areaId, AreaRequest areaRequest) {
        return ResponseHelper.buildOkResponse(areaService.updateArea(areaId, areaRequest));
    }

    @Override
    public ResponseEntity<BaseResponse> deleteArea(String areaId) {
        return ResponseHelper.buildOkResponse(areaService.deleteArea(areaId));
    }
}
