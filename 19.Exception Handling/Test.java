import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Test t=new Test();
        System.out.println("Enter the numbers");
        int a=sc.nextInt();//2
        int b=sc.nextInt();//3
        t.divide(a, b);
    
    }
    void divide(int a,int b){
        try{//exception possible area
            System.out.println(a/b);
            System.out.println("The value of a is "+a);
            System.out.println("The value of b is "+b);
            int[] arr=new int[a-b]; //3
            for(int i=0;i<10;i++){
                System.out.println(arr[i]);
            }
        }
        catch(ArithmeticException ae){
            System.out.println("check the b value");
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("check array length");
        }
        catch(Exception e){//this will handle all exception
            System.out.println("Check the code");
        }
        finally{
            System.out.println("I am always get executed");
        }
    }
}