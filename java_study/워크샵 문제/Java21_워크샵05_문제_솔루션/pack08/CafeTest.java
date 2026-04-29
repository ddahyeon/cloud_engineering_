package pack08;

public class CafeTest {
    public static void main(String[] args){
        
        Cafe cafe = new Cafe();
        
        Coffee americano = new Coffee("Americano", 4000);
        Coffee caffelatte = new Coffee("Caffelatte", 5000);
        Coffee macchiato= new Coffee("Macchiato", 6000);
        
        cafe.setCoffee(americano);
        cafe.setCoffee(caffelatte);
        cafe.setCoffee(macchiato);
        
        Coffee [] coffeeList = cafe.getCoffeeList();
        
        for(int i = 0; i < coffeeList.length; i++) {
            System.out.println(coffeeList[i].toString());
        }
        
        System.out.println();
        System.out.println("Coffee 가격의 합 : " + cafe.totalPrice() + "원");
    }
}
