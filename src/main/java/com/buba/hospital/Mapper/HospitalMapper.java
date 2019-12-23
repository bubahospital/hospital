package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalMapper {
    List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId);

    SecHospital getHospital(Integer hospitalId);

    List<SecPic> getSwiper(Integer hospitalId);

    List<SecHospitalArticleInfoVo> getArticleImgList(Integer articleId);

    List<SecHospitalArticleInfoVo> getArticleInfoList(Integer articleId);

    List<SecHospitalArticleVo> getArticleList(@Param("hospitalId") Integer hospitalId, @Param("articleType") Integer articleType);

    //添加咨询表
    boolean addSecConsultation(@Param("doctor") SecDoctor doctor, @Param("userid") int userid, @Param("phone") String phone, @Param("biaoti") String biaoti, @Param("text") String text, @Param("fix") String fix, @Param("paymentStatus") int paymentStatus, @Param("orderId") int orderId);
    //添加订单表
    boolean addHisOrder(@Param("hisOrder") HisOrder hisOrder);
    //添加图片
    boolean addSecPicBySecConsultation(@Param("pic") SecPic pic);
    //根据咨询表id修改对应的支付状态为已支付
    boolean updateConsultationState(int id);
}
