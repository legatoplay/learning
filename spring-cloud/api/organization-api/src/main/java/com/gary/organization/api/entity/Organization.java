package com.gary.organization.api.entity;

import java.io.Serializable;

/**
 * Created by Gary on 2019-06-01.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-01
 * @since 0.0.1
 */
public class Organization implements Serializable {
    private static final long serialVersionUID = 6216189851032034596L;
    /**
     * ID
     */
    private long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 区域
     */
    private String area;

    public Organization() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
