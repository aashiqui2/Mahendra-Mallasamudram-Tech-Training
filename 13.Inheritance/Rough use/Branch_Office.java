package tamilnadu.erode;
import tamilnadu.chennai.Office;
public class Branch_Office extends Office {
    int salary;
    public static void main(String[] args) {
        Branch_Office bb=new Branch_Office();
        bb.salary=3000; 
        System.out.println(bb.salary);
        bb.work();
        bb.celebrate_local_funct();
    }
    public void celebrate_local_funct(){
        System.out.println("celebrating local function in Branch_Office");
    }    
}
