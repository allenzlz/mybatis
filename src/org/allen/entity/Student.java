package org.allen.entity;

import java.math.BigDecimal;

public class Student {
    private Short stuid;

    private String stuname;

    private Short stuage;

    private String graname;

    private String homeaddress;

    private String schooladdress;

    private BigDecimal classid;

    public Short getStuid() {
        return stuid;
    }

    public void setStuid(Short stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public Short getStuage() {
        return stuage;
    }

    public void setStuage(Short stuage) {
        this.stuage = stuage;
    }

    public String getGraname() {
        return graname;
    }

    public void setGraname(String graname) {
        System.out.println(12);
        this.graname = graname == null ? null : graname.trim();
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public String getSchooladdress() {
        return schooladdress;
    }

    public void setSchooladdress(String schooladdress) {
        this.schooladdress = schooladdress == null ? null : schooladdress.trim();
    }

    public BigDecimal getClassid() {
        return classid;
    }

    public void setClassid(BigDecimal classid) {
        this.classid = classid;
    }
}