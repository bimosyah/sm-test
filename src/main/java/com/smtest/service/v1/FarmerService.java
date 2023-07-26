package com.smtest.service.v1;

import com.smtest.request.FarmerRequest;
import com.smtest.response.FarmerResponse;

import java.util.List;


public interface FarmerService {

    String registeredFarmer(FarmerRequest farmerRequest);

    List<FarmerResponse> getFarmerList();

    String updateFarmer(String farmerId, FarmerRequest farmerRequest);

    String deleteFarmer(String farmerId);
}
