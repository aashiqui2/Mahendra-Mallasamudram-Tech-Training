public class Test {
    String brand;
    int price,discount;
    Test(){
        System.out.println("No -args constructor");
    }
    Test(String brand,int price){
       this.brand=brand;
       this.price=price;
    }
    public static void main(String[] args) {
        Test ob1=new Test();
        // ob1.brand="samsung";
        // ob1.price=2000;
        // ob1.discount=10;
        Test ob2=new Test("Rice",20);
        System.out.println(ob2.brand);
        System.out.println(ob2.price);
    }
}
