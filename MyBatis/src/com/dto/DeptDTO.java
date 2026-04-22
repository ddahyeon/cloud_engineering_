package com.dto;

//dept테이블릐 컬럼 저장( 레코드 저장) 
public class DeptDTO {
	//컬럼명으로 변수명을 사용	
	int deptno;
	String dname;
	String loc;
	
	//필수  
	public DeptDTO() {}
	public DeptDTO(int deptno, String Dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	//getter/setter 필수 
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
