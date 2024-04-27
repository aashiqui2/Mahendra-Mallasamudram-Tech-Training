package tamilnadu.chennai;
public class Office{
   int salary=25000;//fields,global variable,non-static vvariable,instance variable
    public Office(){
        System.out.println("No -argument Constructor from Office");
    }
    public static void main(String[] args)
    {
    Office obj1=new Office();
    obj1.work();
    System.out.println(obj1.salary);
    obj1.salary=30000;
    System.out.println(obj1.salary);
    }
    public void work(){
        System.out.println("Working in Office");
    }
    public void wfh(){
        System.out.println("Working in Home for Office");
    }
    protected void recruit(){
        System.out.println("Recruiting for Office");
    }
    public void travel_Allovance(){
        System.out.println("Getting travel allovance from Office");
    }
    public void do_Business_Plan(){
        System.out.println("Planning in Office");
    }
}