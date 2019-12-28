package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPatient;

/**
 * @ClassName: CardPayMapper
 * @Author: JiangZe
 * @Description: 就诊卡充值$
 * @Version: 1.0
 * @Date: 2019/12/19 14:58
 */
public interface CardPayMapper {
    //就诊人信息
    SecPatient findPatientInfo(Integer patientId);
    //就诊卡支付按钮


}
