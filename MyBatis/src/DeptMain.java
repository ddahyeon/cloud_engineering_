import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class DeptMain {

	public static void main(String[] args) {

		SqlSession session = 
				MySqlSessionFactory.getSession();
	
		DeptDTO dto = session.selectOne("findByDeptno", 20);
		
		System.out.println(dto);
	}

}