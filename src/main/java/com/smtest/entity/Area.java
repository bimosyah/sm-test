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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "area")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Area extends BaseEntity {

    @Column(name = "code")
    private String code;

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;

    @Column(name = "land_area")
    private Double landArea;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum statusEnum;

    @Column(name = "land_video_url")
    private String landVideoUrl;

    @Column(name = "area_doc_url")
    private String areaDocUrl;

}
