package com.bse.entity;

public class Book {
    private Integer bId;

    private String bName;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + "]";
	}
}