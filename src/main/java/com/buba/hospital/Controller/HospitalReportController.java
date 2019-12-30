package com.buba.hospital.Controller;


import com.buba.hospital.Bean.JiuzhenPersonVo;
import com.buba.hospital.Bean.ReportBaobiao;
import com.buba.hospital.Bean.SecReport;

import com.buba.hospital.Service.HospitalReportService;
import com.buba.hospital.utils.poiReadExcelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @program: ideahos
 * @description: 检查报告-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 11:56
 **/
@Controller
@RequestMapping("hospitalReport")
public class HospitalReportController {

    @Resource
    private HospitalReportService hospitalReport;

    /**
     * 检查报告（对应用户id查询）
     * @param patientId
     * @return
     */
    @RequestMapping("/seclectReport")
    @ResponseBody
    public List<SecReport> seclectReport(Integer patientId){//用户id
        List<SecReport> list =hospitalReport.seclectReport(patientId);
        return list;
    }

    /**
     * 检查报告详情（对应用户id查询）
     * @param reportId
     * @return
     */
    @RequestMapping("/Xingqing")
    @ResponseBody
    public JiuzhenPersonVo Xingqing(Integer reportId){//用户id(获取session的id)

        JiuzhenPersonVo user =hospitalReport.Xingqing(reportId);

        return user;
    }

    /**
     * 报表excel表返回前端显示
     * @param fileAddr
     * @return
     */
    @RequestMapping("/baobiao")
    @ResponseBody
    public  List<ReportBaobiao>  baobiao(@RequestParam("fileAddr") String fileAddr) throws IOException {//用户id(获取session的id)
        //判断文件是否存在  如果不存在则不读取返回前端
        File file = new File("D:\\weixin");
        List<ReportBaobiao> list = null;
        try {
            if (!file.exists()) { //文件夹不存在
              return  null;
            }else {//文件夹存在
                File file1 = new File("D:\\weixin\\reportFile");
                if (!file1.exists()) {
                    return  null;
                } else {
                    File file2 = new File("D:\\weixin\\reportFile\\" + fileAddr + ".xlsx");
                    if (!file2.exists()) {
                       return null;
                    } else {
                        String path = "D:\\weixin\\reportFile\\" + fileAddr + ".xlsx";
                        list = poiReadExcelInfo.Res(path);//传的前端获取对应的地址（活的最后再改）
                    }
                }
            }
        } catch (Exception exc) {//捕获异常
             exc.toString();
             return  null;
           }

        return list;
    }







}

