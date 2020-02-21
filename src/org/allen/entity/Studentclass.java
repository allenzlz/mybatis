package org.allen.entity;

import java.math.BigDecimal;

public class Studentclass {
    private BigDecimal classid;

    private String classname;

    public BigDecimal getClassid() {
        return classid;
    }

    public void setClassid(BigDecimal classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }
}