package com.tns.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager extends Employee{

private static final long serialVersionUID = 1L;
	
	private String departmentname;

	public String getDepartmentName() {
		return departmentname;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentname = departmentName;
	}
}
