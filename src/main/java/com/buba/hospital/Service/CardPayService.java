package com.buba.hospital.Service;

import com.buba.hospital.Bean.SecPatient;

/**
 * @ClassName: CardPayService
 * @Author: JiangZe
 * @Description: 就诊卡充值$
 * @Version: 1.0
 * @Date: 2019/12/19 15:00
 */
public interface CardPayService {
    //就诊人信息
    SecPatient findPatientInfo(Integer patientId);
}
