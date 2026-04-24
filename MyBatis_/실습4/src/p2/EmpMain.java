package p2;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class EmpMain {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		List<DeptDTO> list = session.selectList("p2.EmpMapper.empdeptjoin2");

		for(DeptDTO dept: list) {
			System.out.println(dept);
		}
		session.close();
	}

}