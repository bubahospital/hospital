package com.buba.hospital.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName: PayHoPatVO
 * @Author: JiangZe
 * @Description: 单号、姓名、时间、缴费名、金额
 * @Version: 1.0
 * @Date: 2019/12/14 15:15
 */

public class PayHoPatVO {
    /*
    根据就诊人查未支付的订单信息
    #his_order 订单表
    #sec_payment 门诊缴费表
    #sec_patient 就诊人表
    #his_payment 缴费订单表
     */
    private Integer id;

    private Boolean disabled;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    private String orderName;

    private String orderNum;

    private Integer orderPlacer;

    private String status;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payStartTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date refundStartTime;

    private Double payMoney;

    private String payWay;

    private String orderId;

    private String orderDetailName;

    private Integer patientId;

    private String patientMedicalcardnumber;

    private String fileAddr;

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
        this.orderName = orderName;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
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
        this.status = status;
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
        this.payWay = payWay;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDetailName() {
        return orderDetailName;
    }

    public void setOrderDetailName(String orderDetailName) {
        this.orderDetailName = orderDetailName;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientMedicalcardnumber() {
        return patientMedicalcardnumber;
    }

    public void setPatientMedicalcardnumber(String patientMedicalcardnumber) {
        this.patientMedicalcardnumber = patientMedicalcardnumber;
    }

    public String getFileAddr() {
        return fileAddr;
    }

    public void setFileAddr(String fileAddr) {
        this.fileAddr = fileAddr;
    }

    @Override
    public String toString() {
        return "PayHoPatVO{" +
                "id=" + id +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", orderName='" + orderName + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", orderPlacer=" + orderPlacer +
                ", status='" + status + '\'' +
                ", payStartTime=" + payStartTime +
                ", refundStartTime=" + refundStartTime +
                ", payMoney=" + payMoney +
                ", payWay='" + payWay + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderDetailName='" + orderDetailName + '\'' +
                ", patientId=" + patientId +
                ", patientMedicalcardnumber='" + patientMedicalcardnumber + '\'' +
                ", fileAddr='" + fileAddr + '\'' +
                '}';
    }
}







