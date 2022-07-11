package com.example.student.model;



public class Branch {
	
	int branchId;
	String branchName;
	int branchCode;
	public Branch() {
		super();
	}
	public Branch(String branchName, int branchId, int branchCode) {
		super();
		this.branchName = branchName;
		this.branchId = branchId;
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", branchId=" + branchId + ", branchCode=" + branchCode + "]";
	}
	

}
