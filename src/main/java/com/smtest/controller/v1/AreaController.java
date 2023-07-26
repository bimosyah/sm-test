package com.smtest.controller.v1;

import com.smtest.request.AreaRequest;
import com.smtest.request.FarmerRequest;
import com.smtest.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/area")
public interface AreaController {

    @PostMapping
    ResponseEntity<BaseResponse> registerArea(@RequestBody AreaRequest areaRequest);

    @GetMapping
    ResponseEntity<BaseResponse> getAreaList();

    @PutMapping("/{areaId}")
    ResponseEntity<BaseResponse> updateArea(@PathVariable String areaId,
                                              @RequestBody AreaRequest areaRequest);

    @DeleteMapping("/{areaId}")
    ResponseEntity<BaseResponse> deleteArea(@PathVariable String areaId);
}