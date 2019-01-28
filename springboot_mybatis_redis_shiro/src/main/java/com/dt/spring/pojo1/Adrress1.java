package com.dt.spring.pojo1;

import java.io.Serializable;
import java.util.Date;

public class Adrress1 implements Serializable {
    private Long id;

    private String dangAreaId;

    private String dangAreaName;

    private String dangCityId;

    private String dangCityName;

    private String dangProvinceId;

    private String dangProvinceName;

    private Date creationDate;

    private Date lastModifiedDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDangAreaId() {
        return dangAreaId;
    }

    public void setDangAreaId(String dangAreaId) {
        this.dangAreaId = dangAreaId == null ? null : dangAreaId.trim();
    }

    public String getDangAreaName() {
        return dangAreaName;
    }

    public void setDangAreaName(String dangAreaName) {
        this.dangAreaName = dangAreaName == null ? null : dangAreaName.trim();
    }

    public String getDangCityId() {
        return dangCityId;
    }

    public void setDangCityId(String dangCityId) {
        this.dangCityId = dangCityId == null ? null : dangCityId.trim();
    }

    public String getDangCityName() {
        return dangCityName;
    }

    public void setDangCityName(String dangCityName) {
        this.dangCityName = dangCityName == null ? null : dangCityName.trim();
    }

    public String getDangProvinceId() {
        return dangProvinceId;
    }

    public void setDangProvinceId(String dangProvinceId) {
        this.dangProvinceId = dangProvinceId == null ? null : dangProvinceId.trim();
    }

    public String getDangProvinceName() {
        return dangProvinceName;
    }

    public void setDangProvinceName(String dangProvinceName) {
        this.dangProvinceName = dangProvinceName == null ? null : dangProvinceName.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}