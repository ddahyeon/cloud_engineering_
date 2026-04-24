import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DeptDAO;
import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {

		// 메뉴보여주기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. 부서 목록보기");
			System.out.println("2. 부서 추가");
			System.out.println("3. 부서 삭제");
			System.out.println("4. 부서 수정");
			System.out.println("0. 종료");
			System.out.println("-------------------------");
			
			//번호 읽기
			String num = scan.next();
			if("1".equals(num)) {
				DeptService service = 
						new DeptServiceImpl();
				service.setDao(new DeptDAO());
				
				List<DeptDTO> list = service.findAll();
				for(DeptDTO dto: list) {
					System.out.println(dto);
				}
			}else if("2".equals(num)) {
				
				System.out.println("부서번호를 입력하시오");
				int deptno = scan.nextInt();
				System.out.println("부서명 입력하시오");
				String dname = scan.next();
				System.out.println("부서위치 입력하시오");
				String loc = scan.next();
				
				DeptService service = 
						new DeptServiceImpl();
				service.setDao(new DeptDAO());
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				int n = service.insert(dto);
				if(n>=1)System.out.println("저장성공");
				
			}else if("3".equals(num)) {
				System.out.println("삭제할 부서번호를 입력하시오");
				int deptno = scan.nextInt();
				
				DeptService service  = new DeptServiceImpl();
				service.setDao(new DeptDAO());
				int n = service.delete(deptno);
				if(n>=1)System.out.println("삭제 성공");
				
			}else if("4".equals(num)) {
				
			}else {
				// "0"
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}//end while
		
		
		
		
		
		
		
		/*
		SqlSession session = 
				MySqlSessionFactory.getSession();
		//다중행
		List<DeptDTO> list = 
				session.selectList("com.config.DeptMapper.findAll");
		System.out.println(list);
		
		
		
		
		
	    //단일행
		DeptDTO dto = session.selectOne("com.config.DeptMapper.findByDeptno", 20);
		System.out.println(dto);
		//----------------------------------
		DeptDTO data = new DeptDTO();
		data.setDeptno(10);
		data.setDname("ACCOUNTING");
		
		DeptDTO dto2 = session.selectOne("com.config.DeptMapper.findByDeptnoAndDname", data);
		System.out.println(dto2);
		//-------------------------------------------------------------
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("x", 10);
		map.put("y", "ACCOUNTING");
		
		DeptDTO dto3 = session.selectOne("com.config.DeptMapper.findByDeptnoAndDnameMap", map);
		System.out.println(dto3);
		
		
		
		DeptDTO data2 = new DeptDTO();
		data2.setDeptno(40);
		data2.setDname("인사과");
		List<DeptDTO> list2 = session.selectList("com.config.DeptMapper.findByDnameOrDeptno",data2);
		System.out.println(list2);

		//insert문
//		DeptDTO data3 = new DeptDTO(61, "개발", "서울");
//		int n = session.insert("insert",data3);
//		if(n>=1)System.out.println("저장 성공");
//		session.commit();
		
		//update문
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("deptno", 61);
		map2.put("dname", "IT개발");
		map2.put("loc", "서울시");
		int n2 = session.update("com.config.DeptMapper.update", map2);
		if(n2>=1)System.out.println("수정 성공");
		session.commit();
		
		//delete 문
		int n3 = session.delete("com.config.DeptMapper.delete", 61);
		if(n3>=1)System.out.println("삭제 성공");
		session.commit();
		
		// &lt; 실습
		List<DeptDTO> list3 = 
				session.selectList("com.config.DeptMapper.findByDeptnoLessThan", 40);
		System.out.println(list3);
		
		
		
		// DeptMapper2.xml 호출
		List<DeptDTO> list4 = 
				session.selectList("com.config.DeptMapper2.findByDeptno", 30);
		System.out.println(list4);
		
		
		
		//자원반납
		session.close();
		
		*/
	}

}