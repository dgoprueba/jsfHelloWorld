package com.diego.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Hello {
 
    private String name;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}
