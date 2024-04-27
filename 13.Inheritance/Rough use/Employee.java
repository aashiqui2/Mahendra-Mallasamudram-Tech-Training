package tamilnadu.chennai;

public class Employee extends Office {
    String name;
    Employee(){
        //super
        System.out.println("No -argument Constrictor from Employee");
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.work();
        emp.name="Santhosh";
        System.out.println(emp.name);
        // Employee emp1 =new Employee();//the super and sub class constructor is called whenever we create a object
        
    }
}
