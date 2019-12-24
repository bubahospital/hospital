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
    private String patientName;//就诊人姓名
    private String orderNum;//订单号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date priceTime;//支付时间
    private double price;//支付金额
    private String orderName;//订单名称
    private String name;

    @Override
    public String toString() {
        return "PayHoPatVO{" +
                "patientName='" + patientName + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", priceTime=" + priceTime +
                ", price=" + price +
                ", orderName='" + orderName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(Date priceTime) {
        this.priceTime = priceTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
