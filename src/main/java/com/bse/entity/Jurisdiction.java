package com.bse.entity;

import java.io.Serializable;

public class Jurisdiction implements Serializable{
    
	private Integer jId;

	private String jName;

	public Jurisdiction() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Jurisdiction [jId=" + jId + ", jName=" + jName + "]";
	}
	public Jurisdiction(Integer jId, String jName) {
		super();
		this.jId = jId;
		this.jName = jName;
	}
    public Integer getjId() {
        return jId;
    }

    public void setjId(Integer jId) {
        this.jId = jId;
    }

    public String getjName() {
        return jName;
    }

    public void setjName(String jName) {
        this.jName = jName == null ? null : jName.trim();
    }
}