package com.buba.hospital.Bean;

import java.util.Date;

public class SecDoctorAppointmenttimeTimeframe {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private Integer appointmenttimeId;

    private String timeframe;

    private Integer timeframePeoplenum;

    private String timeframeStatus;

    private Integer timeframePeoplenum1;

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

    public Integer getAppointmenttimeId() {
        return appointmenttimeId;
    }

    public void setAppointmenttimeId(Integer appointmenttimeId) {
        this.appointmenttimeId = appointmenttimeId;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe == null ? null : timeframe.trim();
    }

    public Integer getTimeframePeoplenum() {
        return timeframePeoplenum;
    }

    public void setTimeframePeoplenum(Integer timeframePeoplenum) {
        this.timeframePeoplenum = timeframePeoplenum;
    }

    public String getTimeframeStatus() {
        return timeframeStatus;
    }

    public void setTimeframeStatus(String timeframeStatus) {
        this.timeframeStatus = timeframeStatus == null ? null : timeframeStatus.trim();
    }

    public Integer getTimeframePeoplenum1() {
        return timeframePeoplenum1;
    }

    public void setTimeframePeoplenum1(Integer timeframePeoplenum1) {
        this.timeframePeoplenum1 = timeframePeoplenum1;
    }

    @Override
    public String toString() {
        return "SecDoctorAppointmenttimeTimeframe{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", appointmenttimeId=" + appointmenttimeId +
                ", timeframe='" + timeframe + '\'' +
                ", timeframePeoplenum=" + timeframePeoplenum +
                ", timeframeStatus='" + timeframeStatus + '\'' +
                ", timeframePeoplenum1=" + timeframePeoplenum1 +
                '}';
    }
}