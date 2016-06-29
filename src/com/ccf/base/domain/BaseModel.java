package com.ccf.base.domain;

/**
 * Created by dell on 2016/6/29.
 */
public class BaseModel {
    private String id;
    private String createtime;
    private String updatetime;
    private String ifuse;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getIfuse() {
        return ifuse;
    }

    public void setIfuse(String ifuse) {
        this.ifuse = ifuse;
    }
}
