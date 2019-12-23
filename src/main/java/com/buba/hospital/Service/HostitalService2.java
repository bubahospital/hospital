package com.buba.hospital.Service;

import com.buba.hospital.Bean.Response;
import com.buba.hospital.Bean.SecDoctor;
import com.buba.hospital.Bean.SecPic;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @title: HostitalService
 * @projectName guoda33333
 * @description: TODO
 * @date 2019/12/1514:42
 */
@Service
public interface HostitalService2 {

     //添加数据库  咨询表\订单表
     Response addSecConsultation(SecDoctor doctor, int userid, String phone, String biaoti, String text, String fix, int paymentStatus, String orderNum, int state);
     //添加图片
     boolean addSecPicBySecConsultation(SecPic pic, int orderId);
     //根据咨询表id修改对应的支付状态 为已支付
     boolean updateConsultationState(int id);
}
