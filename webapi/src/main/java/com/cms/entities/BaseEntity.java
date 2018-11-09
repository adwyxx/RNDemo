package com.cms.entities;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 8641108338538325713L;
    //创建时间
    @Column(name="create_time")
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    //创建人
    @Column(name="creator")
    private String creator;

    @Override
    public String toString() {
        return this.toString();
    }
}