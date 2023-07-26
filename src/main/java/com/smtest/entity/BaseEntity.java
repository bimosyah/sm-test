package com.smtest.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Data
@DynamicUpdate
public class BaseEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "deleted_date")
    private Date deletedDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "deleted_by")
    private String deletedBy;

    @PrePersist
    public void prePersist() {
        this.id = UUID.randomUUID().toString();
        this.active = true;
        this.createdDate = new Date();
    }
}
