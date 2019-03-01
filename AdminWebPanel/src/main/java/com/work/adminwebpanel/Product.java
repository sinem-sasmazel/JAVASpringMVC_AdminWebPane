package com.work.adminwebpanel;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;

	private String pdesc1;

	private String pdesc2;

	private String pprice;

	public Product() {
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPdesc1() {
		return this.pdesc1;
	}

	public void setPdesc1(String pdesc1) {
		this.pdesc1 = pdesc1;
	}

	public String getPdesc2() {
		return this.pdesc2;
	}

	public void setPdesc2(String pdesc2) {
		this.pdesc2 = pdesc2;
	}

	public String getPprice() {
		return this.pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

}