package com.bse.entity;

public class Role {
    private Integer rId;

    private String rName;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

	@Override
	public String toString() {
		return "Role [rId=" + rId + ", rName=" + rName + "]";
	}
}