package p2;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("DeptDTO")
public class DeptDTO {

	int deptno;
	String dname;
	String loc;
	
	//1:N
	List<EmpDTO> empList;
	
	public DeptDTO() {}

	public DeptDTO(int deptno, String dname, String loc, List<EmpDTO> empList) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.empList = empList;
	}

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

	public List<EmpDTO> getEmpList() {
		return empList;
	}

	public void setEmpList(List<EmpDTO> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", empList=" + empList + "]";
	}

	
	
}