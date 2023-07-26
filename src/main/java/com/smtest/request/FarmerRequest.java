package com.smtest.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FarmerRequest {
    private String name;
    private Date bod;
    private String phone;
    private String address;
    private String postalCode;
    private String ktpNumber;
    private String ktpImgUrl;
    private String selfieImgUrl;
    private String approvalDocUrl;
}
