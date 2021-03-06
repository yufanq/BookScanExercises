package com.bse.entity;

public class Profession {
    private Integer pId;

    private String pName;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

	@Override
	public String toString() {
		return "Profession [pId=" + pId + ", pName=" + pName + "]";
	}
}