package com.buba.hospital.Controller;

import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Service.CardPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: CardPayController
 * @Author: JiangZe
 * @Description: 就诊卡充值
 * @Version: 1.0
 * @Date: 2019/12/19 15:01
 */
@Controller
@RequestMapping("/CardPay")
public class CardPayController {
    @Autowired
    private CardPayService cardPayService;

    //就诊人信息
    @RequestMapping("/findPatientInfo")
    @ResponseBody
    public SecPatient findPatientInfo(Integer patientId) {
        SecPatient info = cardPayService.findPatientInfo(patientId);
        System.out.println(info);
        return info;
    }
}
