package tamilnadu.madurai;
import tamilnadu.chennai.Office;
public class Employee2 extends Office {
    String name;
    public static void main(String[] args) {
        Employee2 emp=new Employee2();//when the package is different constructor should be public
        emp.name="Rishi";
        System.out.println(emp.name);
        emp.wfh();
        emp.recruit();
    }
    
}
