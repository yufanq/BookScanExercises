package com.bse.entity;

public class AdminRole {
    private Integer arId;

    private Integer aId;

    private Integer rId;

    public Integer getArId() {
        return arId;
    }

    public void setArId(Integer arId) {
        this.arId = arId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

	@Override
	public String toString() {
		return "AdminRole [arId=" + arId + ", aId=" + aId + ", rId=" + rId + "]";
	}
}