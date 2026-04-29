package pack01;

public class Student {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student(){}
	public Student(String name, int korean , 
			int english, int math ,int science ){
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	
	public double getAvg(){
		
		double sum = korean +  english + math + science;
		double avg = sum / 4;
		return avg;
	}
	public String getGrade(){
		/*평균 점수가 100이하~90이상 점이면 A학점, 90미만~70이상 이면 B학점, 70미만~50이상 이면
		C학점, 50미만~30이상 이면 D학점, 나머지는 F학점으로 화면에 출력 한다.*/
	    String result = "F 학점";
	    int avg = (int)getAvg();
	    
	    if( avg >= 90){
	    	result = "A 학점";
	    }else if( avg >= 70 ){
	    	result = "B 학점";
	    }else if( avg >= 50){
	    	result = "C 학점";
	    }else if( avg >= 30){
	    	result = "D 학점";
	    }
	    return result;
	}//end 
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}

}//end class
