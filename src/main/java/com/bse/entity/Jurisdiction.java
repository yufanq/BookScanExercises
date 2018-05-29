package com.bse.entity;

public class Jurisdiction {
    private Integer jId;

    private String jName;

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

	@Override
	public String toString() {
		return "Jurisdiction [jId=" + jId + ", jName=" + jName + "]";
	}
}