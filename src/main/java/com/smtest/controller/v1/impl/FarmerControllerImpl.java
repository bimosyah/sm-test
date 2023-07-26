package com.smtest.controller.v1.impl;

import com.smtest.controller.v1.FarmerController;
import com.smtest.request.FarmerRequest;
import com.smtest.response.BaseResponse;
import com.smtest.service.v1.FarmerService;
import com.smtest.utils.ResponseHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
public class FarmerControllerImpl implements FarmerController {

    private final FarmerService farmerService;

    @Override
    public ResponseEntity<BaseResponse> registerFarmer(FarmerRequest farmerRequest) {
        return ResponseHelper.buildOkResponse(farmerService.registeredFarmer(farmerRequest));
    }

    @Override
    public ResponseEntity<BaseResponse> getFarmerList() {
        return ResponseHelper.buildOkResponse(farmerService.getFarmerList());
    }

    @Override
    public ResponseEntity<BaseResponse> updateFarmer(String farmerId, FarmerRequest farmerRequest) {
        return ResponseHelper.buildOkResponse(farmerService.updateFarmer(farmerId, farmerRequest));
    }

    @Override
    public ResponseEntity<BaseResponse> deleteFarmer(String farmerId) {
        return ResponseHelper.buildOkResponse(farmerService.deleteFarmer(farmerId));
    }
}
