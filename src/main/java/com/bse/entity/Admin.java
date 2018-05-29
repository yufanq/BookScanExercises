package com.bse.entity;

public class Admin {
	private Integer aId;

	private String aAccount;

	private String aPassword;

	private String aNickname;

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getaAccount() {
		return aAccount;
	}

	public void setaAccount(String aAccount) {
		this.aAccount = aAccount == null ? null : aAccount.trim();
	}

	public String getaPassword() {
		return aPassword;
	}

	public void setaPassword(String aPassword) {
		this.aPassword = aPassword == null ? null : aPassword.trim();
	}

	public String getaNickname() {
		return aNickname;
	}

	public void setaNickname(String aNickname) {
		this.aNickname = aNickname == null ? null : aNickname.trim();
	}

	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", aAccount=" + aAccount + ", aPassword=" + aPassword + ", aNickname=" + aNickname
				+ "]";
	}
}