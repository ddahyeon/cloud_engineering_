import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.EmpDTO;

public class EmpMain {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		//저장할 데이터 생성
		List<EmpDTO> list = Arrays.asList(new EmpDTO(9001, "홍길동1", "SALESMAN", 7698, "2026-04-23", 750, 0, 30),
				new EmpDTO(9002, "홍길동2", "SALESMAN", 7698,"2026-04-23", 750, 0, 30),
				new EmpDTO(9003, "홍길동3", "SALESMAN", 7698, "2026-04-23", 750, 0, 30)
				             );
		
		//int n = session.insert("com.config.EmpMapper.insertMulti", list);
		//System.out.println(n+" 개가 저장됨.");
		//session.commit();
				
			//삭제할 데이터 생성
			List<Integer> list2 = Arrays.asList(9001,9002);
			int n2 = session.delete("com.config.EmpMapper.deleteMulti", list2);
			System.out.println(n2+" 개가 삭제됨.");
			session.commit();
			
			
		// 조회할 데이터 생성  
			List<String> list3 = Arrays.asList("TURNER", "SMITH", "JONES");
			List<EmpDTO> list4 = session.selectList("com.config.EmpMapper.selectMulti", list3);
			System.out.println(list4);
		
			//조건 하나인 경우
			 EmpDTO dto = new EmpDTO();
//			 dto.setJob("SALESMAN");
			
			 List<EmpDTO> list5 = session.selectList("com.config.EmpMapper.selectif", dto );
			 System.out.println(list5);
			 System.out.println(list5.size());
			
			 
		//조건 여러개 경우
		EmpDTO dto2 = new EmpDTO();
//		dto2.setJob("SALESMAN");
		dto2.setSal(800);
				
		 List<EmpDTO> list6 = session.selectList("com.config.EmpMapper.selectif2", dto2 );
		 System.out.println(list6);
		 System.out.println(list6.size());
		 
		// update + 조건
	    EmpDTO dto3 = new EmpDTO();
		dto3.setMgr(7902);
		dto3.setEname("이순신");
		dto3.setSal(800);
		dto3.setEmpno(9003);
		int n = session.update("com.config.EmpMapper.updateIf", dto3);
		System.out.println(n+"개가 수정됨");
		session.commit();
			 

		 //choose
		 EmpDTO dto4 = new EmpDTO();
		 //dto4.setJob("CLERK");
		 List<EmpDTO> list7 = session.selectList("com.config.EmpMapper.selectChoose", dto4 );
		 System.out.println(list7);
		 System.out.println(list7.size());
	
		//단일 컬럼
		int cnt = session.selectOne("com.config.EmpMapper.singleColumn");
		System.out.println("count:" + cnt );
				
		
		//페이징 처리 
		int curPage=1;  //현재 페이지 번호 
		int perPage=3;  // 페이지당 보여줄 갯수 
		int offset = (curPage-1)*perPage;  // 시작위치 
		List<EmpDTO> list8 = session.selectList("com.config.EmpMapper.paging", null, new RowBounds(offset, perPage));
		System.out.println(list8);

			
		session.close();
	}

}