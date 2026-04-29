package pack08;

public class Cafe {
	private Coffee [] coffeeList = new Coffee[3];
    private int index = 0;
    
    public Cafe() {}
    
    public int totalPrice() {
        int total = 0;
        
        for(int i = 0; i < coffeeList.length; i++) {
            total += coffeeList[i].getPrice();
        }
        
        return total;
    }
    
    public void setCoffee(Coffee coffee) {
        if(index == coffeeList.length) {
            System.out.println("더이상 저장할 수 없습니다.");
        
        } else {
            coffeeList[index] = coffee;
            index++;
        }
    }
    
    public Coffee[] getCoffeeList() {
        return coffeeList;
    }
}

