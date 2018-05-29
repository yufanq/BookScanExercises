package com.bse.entity;

public class ProfessionBook {
    private Integer pbId;

    private Integer pId;

    private Integer bId;

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

	@Override
	public String toString() {
		return "ProfessionBook [pbId=" + pbId + ", pId=" + pId + ", bId=" + bId + "]";
	}
}