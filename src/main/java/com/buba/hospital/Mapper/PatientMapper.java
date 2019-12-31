package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.PayHoPatVO;
import com.buba.hospital.Bean.SecPatient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientMapper {

    int UpdateMoren(Integer id);

    SecPatient selectHuixiapatient(Integer id);

    SecPatient selectUser(Integer id);
    //JZ
    //门诊缴费==就诊人姓名、卡号
    SecPatient findNameAndCard(Integer patientId);
    /*门诊缴费=根据就诊人查未支付的订单信息=单号、姓名、时间、缴费名、金额*/
    List<PayHoPatVO> findOrderInfo(Integer orderPlacer);
    //门诊缴费==支付方式页面：单号，名称， 金额
    HisOrder findPayWays(String orderNum);

    List<PayHoPatVO> payMentList(@Param("ids") String[] ids);

    boolean updateJiaofeiOrder(@Param("payWay") String payWay,@Param("ids")  String[] ids);
}
