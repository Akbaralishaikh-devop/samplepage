package com.example.Sample.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

@NamedStoredProcedureQuery(
	      name = DepartmentModel.NamedQuery_DepartmentListStoreProcedure,
	      procedureName = "Usp_MstDepartment_Detail"
	      )
@Entity
@Table(name="tbl_Department")
public class DepartmentModel {
	
	public static final String NamedQuery_DepartmentNameStoreProcedure = "DepartmentStoreProcedure";
	public static final String NamedQuery_DepartmentStoreProcedure = "DepartmentAllStoreProcedure";
	public static final String NamedQuery_DepartmentInsertStoreProcedure = "DepartmentInsertStoreProcedure";
	public static final String NamedQuery_DepartmentListStoreProcedure = "DepartmentListStoreProcedure";
	public static final String NamedQuery_DepartmentDeleteStoreProcedure = "DepartmentDeleteStoreProcedure";
	public static final String NamedQuery_DepartmentEditStoreProcedure = "DepartmentEditStoreProcedure";
	public static final String NamedQuery_DepartmentUpdateStoreProcedure = "DepartmentUpdateStoreProcedure";
	public static final String NamedQuery_DepartmentExcelInsertStoreProcedure = "DepartmentExcelInsertStoreProcedure";

	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) 
	@Column(name = "DepartmentId")
	private int id;
	
	@Column(name = "DepartmentName")
	private String DepartmentName;
	
	public DepartmentModel(int id, String departmentName) {
		super();
		this.id = id;
		DepartmentName = departmentName;
		
	}

	public DepartmentModel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	
	@Override
	public String toString() {
		return "DepartmentModel [id=" + id + ", DepartmentName=" + DepartmentName +"]";
	}
	
	
	
}
