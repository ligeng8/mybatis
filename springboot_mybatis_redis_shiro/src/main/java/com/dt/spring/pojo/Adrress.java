package com.dt.spring.pojo;

import java.io.Serializable;
import java.util.Date;

public class Adrress implements Serializable {
    private Long id;

    private Integer dangProvinceId;

    private String dangProvinceName;

    private Integer dangCityId;

    private String dangCityName;

    private Integer dangAreaId;

    private String dangAreaName;

    private Integer dangStreetId;

    private String dangStreetName;

    private Integer status;

    private Date creationDate;

    private Date lastChangedDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDangProvinceId() {
        return dangProvinceId;
    }

    public void setDangProvinceId(Integer dangProvinceId) {
        this.dangProvinceId = dangProvinceId;
    }

    public String getDangProvinceName() {
        return dangProvinceName;
    }

    public void setDangProvinceName(String dangProvinceName) {
        this.dangProvinceName = dangProvinceName == null ? null : dangProvinceName.trim();
    }

    public Integer getDangCityId() {
        return dangCityId;
    }

    public void setDangCityId(Integer dangCityId) {
        this.dangCityId = dangCityId;
    }

    public String getDangCityName() {
        return dangCityName;
    }

    public void setDangCityName(String dangCityName) {
        this.dangCityName = dangCityName == null ? null : dangCityName.trim();
    }

    public Integer getDangAreaId() {
        return dangAreaId;
    }

    public void setDangAreaId(Integer dangAreaId) {
        this.dangAreaId = dangAreaId;
    }

    public String getDangAreaName() {
        return dangAreaName;
    }

    public void setDangAreaName(String dangAreaName) {
        this.dangAreaName = dangAreaName == null ? null : dangAreaName.trim();
    }

    public Integer getDangStreetId() {
        return dangStreetId;
    }

    public void setDangStreetId(Integer dangStreetId) {
        this.dangStreetId = dangStreetId;
    }

    public String getDangStreetName() {
        return dangStreetName;
    }

    public void setDangStreetName(String dangStreetName) {
        this.dangStreetName = dangStreetName == null ? null : dangStreetName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }
}