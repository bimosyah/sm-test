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
public class FarmerResponse {
    private String id;
    private String name;
    private Date bod;
    private String phone;
    private String address;
    private String postalCode;
    private String ktpNumber;
    private String ktpImgUrl;
    private String selfieImgUrl;
    private String status;
    private String approvalDocUrl;
}
