package com.smtest.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AreaResponse {
    private String id;
    private String code;
    private String farmerName;
    private Double landArea;
    private String status;
    private String videoDocUrl;
    private String areaDocUrl;
}
