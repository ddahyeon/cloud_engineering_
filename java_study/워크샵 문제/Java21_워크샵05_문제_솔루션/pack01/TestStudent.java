package pack01;

public class TestStudent {

	public static void main(String[] args) {
		
	/*	Kim 100 90 95 89
		Lee 60 70 99 98
		Park 68 86 60 40*/
		
		Student stu01 = new Student("Kim", 100, 90, 95, 89);
		Student stu02 = new Student("Lee", 60, 70, 99 ,98);
		Student stu03 = new Student("Park", 68, 86 ,60 ,40);
		
		Student [ ]stu = new Student[3];
		stu[0] = stu01;
		
/*		Kim 평균: 93.5 학점: A학점
		Lee 평균: 81.75 학점: B학점
		Park 평균: 63.5 학점: C학점*/
		System.out.println(stu01.getName()+" 평균: " 
		 + stu01.getAvg() + " 학점: " + stu01.getGrade());
		
		System.out.printf("%s  평균:%.2f  학점: %s", 
	stu02.getName(), stu02.getAvg() , stu02.getGrade() +"\n");
		
		System.out.printf("%s  평균:%.2f  학점: %s", 
		stu03.getName(), stu03.getAvg() , stu03.getGrade());
	}

}
