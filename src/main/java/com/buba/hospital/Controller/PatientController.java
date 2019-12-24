package com.buba.hospital.Controller;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.PayHoPatVO;
import com.buba.hospital.Bean.PayMentPOJO;
import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Service.PatientService;
import com.buba.hospital.utils.poiReadExcelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("prient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    //selectPatient 查询就诊人
    @RequestMapping("/selectPatient")
    public List<SecPatient> selectPatient(Integer id){//用户id(获取session的id)
        List<SecPatient>  list =patientService.selectpatient(id);
        return list;
    }


    //UpdateMoren 修改默认人
    @RequestMapping("/UpdateMoren")
    public int UpdateMoren(Integer id){//patientid
        int i =patientService.UpdateMoren(id);
        return i;
    }


    //selectHuixiapatient 回显就诊人（就诊信息）
    @RequestMapping("/selectHuixiapatient")
    public SecPatient selectHuixiapatient(Integer id){
        SecPatient i =patientService.selectHuixiapatient(id);
        if(i==null){
            SecPatient i2 =patientService.selectUser(id);
            return i2;
        }else {
            return  i;
        }


    }
    //    JZ
    @RequestMapping("/findNameAndCard")
    @ResponseBody
    public SecPatient findNameAndCard(Integer patientId) {
        SecPatient patient = patientService.findNameAndCard(patientId);
//        System.out.println(patient);
        return patient;
    }
    @RequestMapping("/findOrderInfo")
    @ResponseBody
    public List<PayHoPatVO> findOrderInfo(Integer orderPlacer) {
        List<PayHoPatVO> orderInfo = patientService.findOrderInfo(orderPlacer);
//        System.out.println(orderInfo);
        return orderInfo;
    }
    /*报表excel表返回前端显示*/
    @RequestMapping("/payMentList")
    @ResponseBody
    public  List<PayMentPOJO>  payMentList(String url) {//用户id(获取session的id)
        List<PayMentPOJO> list = poiReadExcelInfo.Res("D:\\kaoshi\\test.xlsx");//传的前端获取对应的地址（活的最后再改）
//        System.out.println(list);
        return  list;
    }
    //门诊缴费==支付方式页面：单号，名称， 金额
    @RequestMapping("/findPayWays")
    @ResponseBody
    public HisOrder findPayWays(String orderNum) {
        HisOrder ways = patientService.findPayWays(orderNum);
        System.out.println(ways);
        return ways;
    }
}
