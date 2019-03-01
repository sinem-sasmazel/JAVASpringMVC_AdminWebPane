package com.work.adminwebpanel;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rid;

	private String role;

	private int usid;

	public Role() {
	}

	public int getRid() {
		return this.rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getUsid() {
		return this.usid;
	}

	public void setUsid(int usid) {
		this.usid = usid;
	}

}