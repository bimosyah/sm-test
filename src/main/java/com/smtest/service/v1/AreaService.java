package com.smtest.service.v1;

import com.smtest.request.AreaRequest;
import com.smtest.request.FarmerRequest;
import com.smtest.response.AreaResponse;
import com.smtest.response.FarmerResponse;

import java.util.List;


public interface AreaService {

    String registeredArea(AreaRequest areaRequest);

    List<AreaResponse> getAreaList();

    String updateArea(String areaId, AreaRequest areaRequest);

    String deleteArea(String areaId);
}
