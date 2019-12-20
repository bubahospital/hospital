package com.buba.hospital.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class HisOrder {
    private Integer id;

    private Boolean disabled;

    private Date createtime;

    private String orderName;

    private String orderNum;

    private Integer orderPlacer;

    private String status;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payStartTime;

    private Date refundStartTime;

    private Double payMoney;

    private String payWay;

    //就诊卡充值
    private String patientMedicalCardNumber;//就诊卡号
    private String patientName;//就诊人姓名
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime1;//创建时间

    //预约挂号
    private String hospitalName;//医院name
    private String name;//医生name

    private String timeframe;//预约时间段
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date appointmentTime;//预约时间

    //在线咨询
    private String questionTitle;//咨询标题
    private Integer patientId;//就诊人id

    //门诊缴费
    private String spOrderName;//缴费单名称
    private List<HisPayment> hisPayments;//缴费单详情

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Integer getOrderPlacer() {
        return orderPlacer;
    }

    public void setOrderPlacer(Integer orderPlacer) {
        this.orderPlacer = orderPlacer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getPayStartTime() {
        return payStartTime;
    }

    public void setPayStartTime(Date payStartTime) {
        this.payStartTime = payStartTime;
    }

    public Date getRefundStartTime() {
        return refundStartTime;
    }

    public void setRefundStartTime(Date refundStartTime) {
        this.refundStartTime = refundStartTime;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getPatientMedicalCardNumber() {
        return patientMedicalCardNumber;
    }

    public void setPatientMedicalCardNumber(String patientMedicalCardNumber) {
        this.patientMedicalCardNumber = patientMedicalCardNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getCreatetime1() {
        return createtime1;
    }

    public void setCreatetime1(Date createtime1) {
        this.createtime1 = createtime1;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getSpOrderName() {
        return spOrderName;
    }

    public void setSpOrderName(String spOrderName) {
        this.spOrderName = spOrderName;
    }

    public List<HisPayment> getHisPayments() {
        return hisPayments;
    }

    public void setHisPayments(List<HisPayment> hisPayments) {
        this.hisPayments = hisPayments;
    }
}