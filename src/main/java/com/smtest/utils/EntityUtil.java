package com.smtest.utils;

import com.smtest.entity.BaseEntity;

import java.util.Date;

public class EntityUtil {

    public static <T extends BaseEntity> T created(T entity, String userId) {
        entity.setCreatedBy(userId);
        entity.setCreatedDate(new Date());
        return entity;
    }

    public static  <T extends BaseEntity> T modifiedBy(T entity, String userId){
        entity.setModifiedBy(userId);
        entity.setModifiedDate(new Date());
        return entity;
    }

    public static <T extends BaseEntity> T deleted(T entity, String userId){
        entity.setActive(false);
        entity.setDeletedBy(userId);
        entity.setDeletedDate(new Date());
        return  entity;
    }
}
