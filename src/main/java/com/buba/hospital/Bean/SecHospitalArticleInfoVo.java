package com.buba.hospital.Bean;

/**
 * @ClassName Sec
 * @Description TODO
 * @Created by Administrator on 2019/12/19 18:49
 * @Version 1.0
 **/
public class SecHospitalArticleInfoVo implements Comparable<SecHospitalArticleInfoVo> {//文字内容VO表

    private Integer id;

    private String  articleTitle;

    private String type;

    private String info;

    private Integer sequence;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "SecHospitalArticleInfoVo{" +
                "id=" + id +
                ", articleTitle='" + articleTitle + '\'' +
                ", info='" + info + '\'' +
                ", sequence=" + sequence +
                '}';
    }

    @Override
    public int compareTo(SecHospitalArticleInfoVo o) {
        if(this.getSequence()>o.getSequence()) {
           return 1;
        }else if(this.getSequence()<o.getSequence()){
           return -1;
        }else {
           return 0;
        }
    }
}
