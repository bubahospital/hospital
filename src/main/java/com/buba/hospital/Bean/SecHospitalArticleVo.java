package com.buba.hospital.Bean;

import java.util.List;

/**
 * @ClassName SecHospitalArticleVo
 * @Description TODO
 * @Created by Administrator on 2019/12/13 15:40
 * @Version 1.0
 **/
public class SecHospitalArticleVo {//文字VO表
    //主键
    private Integer id;
    //文章标题
    private String articleTitle;

    private List<SecPic> secPics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public List<SecPic> getSecPics() {
        return secPics;
    }

    public void setSecPics(List<SecPic> secPics) {
        this.secPics = secPics;
    }

    @Override
    public String toString() {
        return "SecHospitalArticleVo{" +
                "id=" + id +
                ", articleTitle='" + articleTitle + '\'' +
                ", secPics=" + secPics +
                '}';
    }
}
