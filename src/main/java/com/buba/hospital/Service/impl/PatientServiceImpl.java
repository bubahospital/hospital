package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.PayHoPatVO;
import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Mapper.PatientMapper;
import com.buba.hospital.Service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Resource
    private PatientMapper patientMapper;



    @Override
    public int UpdateMoren(Integer id) {
        return patientMapper.UpdateMoren(id);
    }

    @Override
    public SecPatient selectHuixiapatient(Integer id) {
        return patientMapper.selectHuixiapatient(id);
    }

    @Override
    public SecPatient selectUser(Integer id) {
        return patientMapper.selectUser(id);
    }
    //    JZ
//门诊缴费==就诊人姓名、卡号
    @Override
    public SecPatient findNameAndCard(Integer patientId) {
        SecPatient patient = patientMapper.findNameAndCard(patientId);
        return patient;
    }
    /*门诊缴费=根据就诊人查未支付的订单信息=单号、姓名、时间、缴费名、金额*/
    @Override
    public List<PayHoPatVO> findOrderInfo(Integer orderPlacer) {
        List<PayHoPatVO> orderInfo = patientMapper.findOrderInfo(orderPlacer);
        return orderInfo;
    }
    //门诊缴费==支付方式页面：单号，名称， 金额
    @Override
    public HisOrder findPayWays(String orderNum) {
        HisOrder ways = patientMapper.findPayWays(orderNum);
        return ways;
    }

    @Override
    public List<PayHoPatVO> payMentList(String[] ids) {
        List<PayHoPatVO> orderInfo = patientMapper.payMentList(ids);
        return orderInfo;
    }

    @Override
    public boolean updateJiaofeiOrder(String payWay, String[] ids) {
        boolean b = patientMapper.updateJiaofeiOrder(payWay,ids);
        return b;
    }
}
