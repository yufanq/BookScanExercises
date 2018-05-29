package com.bse.entity;

public class KldpointQuestype {
    private Integer ptId;

    private Integer pId;

    private Integer tId;

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

	@Override
	public String toString() {
		return "KldpointQuestype [ptId=" + ptId + ", pId=" + pId + ", tId=" + tId + "]";
	}
}