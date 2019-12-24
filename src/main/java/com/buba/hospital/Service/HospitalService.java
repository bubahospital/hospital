package com.buba.hospital.Service;


import com.buba.hospital.Bean.*;

import java.util.List;

public interface HospitalService {

    List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId);

    SecHospital getHospital(Integer hospitalId);

    List<SecPic> getSwiper(Integer hospitalId);

    List<SecHospitalArticleVo> getArticleList(Integer hospitalId, Integer articleType);

    List<SecHospitalArticleInfoVo> getArticleInfo(Integer articleId);
    //添加数据库  咨询表\订单表
    Response addSecConsultation(SecDoctor doctor, int userid, String phone, String biaoti, String text, String fix, int paymentStatus, String orderNum, int state);
    //添加图片
    boolean addSecPicBySecConsultation(SecPic pic, int orderId);
    //根据咨询表id修改对应的支付状态 为已支付
    boolean updateConsultationState(int id);

    List<SecHospitalArticleInfoVo> getHospitalIntroduce(Integer hospitalId, Integer articleType);
}
