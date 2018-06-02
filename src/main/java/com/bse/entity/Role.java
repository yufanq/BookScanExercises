package com.bse.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Role implements Serializable{
    private Integer rId;

    private String rName;
    
    private Set<Jurisdiction> jurisdictions =new HashSet<Jurisdiction>();


    @Override
	public String toString() {
		return "Role [rId=" + rId + ", rName=" + rName + ", jurisdictions=" + jurisdictions + "]";
	}

	public Role(Integer rId, String rName, Set<Jurisdiction> jurisdictions) {
		super();
		this.rId = rId;
		this.rName = rName;
		this.jurisdictions = jurisdictions;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Jurisdiction> getJurisdictions() {
		return jurisdictions;
	}

	public void setJurisdictions(Set<Jurisdiction> jurisdictions) {
		this.jurisdictions = jurisdictions;
	}

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
}