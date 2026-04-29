package pack02;

public class TestBook {
	public static void main(String[] args) {
		Book bookOne = new Book ("SQL Plus", 50000, 5);
		Book bookTwo = new Book ("Java 2.0", 40000, 3);
		Book bookThree = new Book ("JSP Servlet", 60000, 6);
		System.out.println(bookOne.getBookName()
		+"\t "+ bookOne.getBookPrice()
		+"원\t "+ bookOne.getBookDiscountRate()
		+"%\t "+ bookOne.getDiscountBookPrice()
		+"원");
		System.out.println(bookTwo.getBookName()
		+"\t "+ bookTwo.getBookPrice()
		+"원\t "+ bookTwo.getBookDiscountRate()
		+"%\t "+ bookTwo.getDiscountBookPrice()
		+"원");
		System.out.println(bookThree.getBookName()
		+"\t "+ bookThree.getBookPrice()
		+"원\t "+ bookThree.getBookDiscountRate()
		+"%\t "+ bookThree.getDiscountBookPrice()
		+"원");
		}

}
