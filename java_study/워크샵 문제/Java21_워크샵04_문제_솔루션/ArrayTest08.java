public class ArrayTest08 {
	public static void main(String[] args) {

		int [] score= { 99,34,67,22,11,9};
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			
			if(score[i]>max) {
				max = score[i];
			}else if(score[i]<min) {
				min = score[i];
			}
		}//end for		
		System.out.println("최대값:" + max );
		System.out.println("최소값:" + min );
	}
}
