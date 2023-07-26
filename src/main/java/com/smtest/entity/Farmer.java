package com.smtest.entity;

import com.smtest.enumeration.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "farmer")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Farmer extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "bod")
    private Date bod;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "ktp_number")
    private String ktpNumber;

    @Column(name = "ktp_img")
    private String ktpImg;

    @Column(name = "selfie_img")
    private String selfieImg;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(name = "approval_doc_url")
    private String approvalDocUrl;
}
