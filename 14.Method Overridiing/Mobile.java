public class Mobile
{
int price,mp;

Mobile(int price, int mp)
{
this.price=price;
this.mp=mp;
}

public static void main(String[] args)
{
Mobile vivo=new Mobile(10,8);
Mobile apple=new Mobile(12,10);

Mobile mobile=apple.compare_clarity(vivo);//Passing Object as Arguments
System.out.println("Mega Pixels "+mobile.mp);

System.out.println(mobile);//clasname@ hexadecimal value of hashcode
//this refers to current object of same class
//int no1=10,no2=20;
//add(no1,no2); add(int n1,int n2)
}

Mobile compare_clarity(Mobile mobile2)
{
System.out.println("Apple ? "+this.price); 
System.out.println(mobile2.price);//Passing Object as argument

int pixels1=this.mp;
int pixels2=mobile2.mp;
if(pixels1>pixels2){
System.out.println("Apple is best");
return this;
}
else{
System.out.println("Vivo is best");
return mobile2;
}

}
}