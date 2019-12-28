package com.buba.hospital.Bean;

import java.util.Date;
import java.util.List;

public class SecFirstDepartment {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private Integer hospitalId;

    private String departmentName;

    private Integer sequence;

    private String departmentInfo;

    private List<SecSecondDepartment> secondList;

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

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getDepartmentInfo() {
        return departmentInfo;
    }

    public void setDepartmentInfo(String departmentInfo) {
        this.departmentInfo = departmentInfo == null ? null : departmentInfo.trim();
    }

    public List<SecSecondDepartment> getSecondList() {
        return secondList;
    }

    public void setSecondList(List<SecSecondDepartment> secondList) {
        this.secondList = secondList;
    }

    @Override
    public String toString() {
        return "SecFirstDepartment{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", hospitalId=" + hospitalId +
                ", departmentName='" + departmentName + '\'' +
                ", sequence=" + sequence +
                ", departmentInfo='" + departmentInfo + '\'' +
                ", secondList=" + secondList +
                '}';
    }
}