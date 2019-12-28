package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Mapper.CardPayMapper;
import com.buba.hospital.Service.CardPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: CardPayServiceImpl
 * @Author: JiangZe
 * @Description: 就诊卡充值
 * @Version: 1.0
 * @Date: 2019/12/19 15:00
 */
@Service
public class CardPayServiceImpl implements CardPayService {
    @Resource
    private CardPayMapper cardPayMapper;

    //就诊人信息
    @Override
    public SecPatient findPatientInfo(Integer patientId) {
        SecPatient info = cardPayMapper.findPatientInfo(patientId);
        return info;
    }
}
