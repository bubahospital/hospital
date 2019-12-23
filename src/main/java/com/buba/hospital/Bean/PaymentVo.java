package com.buba.hospital.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author FJ
 * @title: PaymentVo
 * @projectName hospital
 * @date 2019/12/2010:48
 */
public class PaymentVo {
    private Integer id;
    private String orderNum;//订单号
    private Double payMoney;//支付金额
    private Integer status;//状态
    private String patientName;//就诊人
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payStartTime;//支付时间
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    private String payWay;//支付方式
    private String patientMedicalCardNumber;//就诊卡号
    private String medicalCardBalance;//就诊余额

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getPayStartTime() {
        return payStartTime;
    }

    public void setPayStartTime(Date payStartTime) {
        this.payStartTime = payStartTime;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPatientMedicalCardNumber() {
        return patientMedicalCardNumber;
    }

    public void setPatientMedicalCardNumber(String patientMedicalCardNumber) {
        this.patientMedicalCardNumber = patientMedicalCardNumber;
    }

    public String getMedicalCardBalance() {
        return medicalCardBalance;
    }

    public void setMedicalCardBalance(String medicalCardBalance) {
        this.medicalCardBalance = medicalCardBalance;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
/*SELECT
    o.id,
    o.order_num orderNum,
	o.pay_money payMoney,
	o.`status` status,
	o.pay_start_time payStartTime,
	o.pay_way payWay,
	p.patient_name patientName,
	p.patient_medicalCardNumber patientMedicalCardNumber,
	p.medicalCard_balance medicalCardBalance
FROM
	his_order o,
	sec_patient p
WHERE
	o.order_placer = p.id
AND o.order_name = '就诊卡充值'
AND p.user_id=1*/
}
