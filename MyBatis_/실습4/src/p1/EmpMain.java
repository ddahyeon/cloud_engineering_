package p1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class EmpMain {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		List<EmpDTO> list = session.selectList("p1.EmpMapper.empdeptjoin");

		for(EmpDTO emp: list) {
			System.out.println(emp);
		}
		session.close();
	}

}