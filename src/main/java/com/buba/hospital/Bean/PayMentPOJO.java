package com.buba.hospital.Bean;

/**
 * @ClassName: PayMentPOJO
 * @Author: JiangZe
 * @Description: 门诊缴费==项目清单
 * @Version: 1.0
 * @Date: 2019/12/16 13:22
 */
public class PayMentPOJO {
    private String xiangMu;
    private String danJia;
    private String shuLiang;
    private double jinE;

    public String getXiangMu() {
        return xiangMu;
    }

    public void setXiangMu(String xiangMu) {
        this.xiangMu = xiangMu;
    }

    public String getDanJia() {
        return danJia;
    }

    public void setDanJia(String danJia) {
        this.danJia = danJia;
    }

    public String getShuLiang() {
        return shuLiang;
    }

    public void setShuLiang(String shuLiang) {
        this.shuLiang = shuLiang;
    }

    public double getJinE() {
        return jinE;
    }

    public void setJinE(double jinE) {
        this.jinE = jinE;
    }

    @Override
    public String toString() {
        return "PayMentPOJO{" +
                "xiangMu='" + xiangMu + '\'' +
                ", danJia='" + danJia + '\'' +
                ", shuLiang='" + shuLiang + '\'' +
                ", jinE='" + jinE + '\'' +
                '}';
    }
}
