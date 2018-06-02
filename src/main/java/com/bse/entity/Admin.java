package com.bse.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Admin implements Serializable{
    private Integer aId;

    private String aAccount;

    private String aPassword;

    private String aPwdadd;

    private String aNickname;
    
    private Set<Role> roles =new HashSet<Role>(); 
    
    private Set<Jurisdiction> jurisdictions =new HashSet<Jurisdiction>();

    public Admin(Integer aId, String aAccount, String aPassword, String aPwdadd, String aNickname, Set<Role> roles) {
		super();
		this.aId = aId;
		this.aAccount = aAccount;
		this.aPassword = aPassword;
		this.aPwdadd = aPwdadd;
		this.aNickname = aNickname;
		this.roles = roles;
	}

	public Admin(Integer aId, String aAccount, String aPassword, String aPwdadd, String aNickname) {
		super();
		this.aId = aId;
		this.aAccount = aAccount;
		this.aPassword = aPassword;
		this.aPwdadd = aPwdadd;
		this.aNickname = aNickname;
	}

	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", aAccount=" + aAccount + ", aPassword=" + aPassword + ", aPwdadd=" + aPwdadd
				+ ", aNickname=" + aNickname + ", roles=" + roles + ", jurisdictions=" + jurisdictions + "]";
	}

	public Admin(Integer aId, String aAccount, String aPassword, String aPwdadd, String aNickname, Set<Role> roles,
			Set<Jurisdiction> jurisdictions) {
		super();
		this.aId = aId;
		this.aAccount = aAccount;
		this.aPassword = aPassword;
		this.aPwdadd = aPwdadd;
		this.aNickname = aNickname;
		this.roles = roles;
		this.jurisdictions = jurisdictions;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Jurisdiction> getJurisdictions() {
		return jurisdictions;
	}

	public void setJurisdictions(Set<Jurisdiction> jurisdictions) {
		this.jurisdictions = jurisdictions;
	}

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

    public String getaPwdadd() {
        return aPwdadd;
    }

    public void setaPwdadd(String aPwdadd) {
        this.aPwdadd = aPwdadd == null ? null : aPwdadd.trim();
    }

    public String getaNickname() {
        return aNickname;
    }

    public void setaNickname(String aNickname) {
        this.aNickname = aNickname == null ? null : aNickname.trim();
    }
    //
    public String getCredentialsSalt() {
        return aAccount + aPwdadd;
    }
}