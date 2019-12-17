package com.buba.hospital.Bean;

import java.util.Date;

public class SecHospital {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private String hospitalSort;

    private String hospitalName;

    private String hospitalAddress;

    private Integer hospitalTel;

    private Double longitude;

    private Double latitude;

    public String getHospitalSort() {
        return hospitalSort;
    }

    public void setHospitalSort(String hospitalSort) {
        this.hospitalSort = hospitalSort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress == null ? null : hospitalAddress.trim();
    }

    public Integer getHospitalTel() {
        return hospitalTel;
    }

    public void setHospitalTel(Integer hospitalTel) {
        this.hospitalTel = hospitalTel;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "SecHospital{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", hospitalSort='" + hospitalSort + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", hospitalTel=" + hospitalTel +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}