public class Employee {
    private int empID =2;
    private int ph = 0;
    private String name;
    
    Employee(){

    }
    Employee(String empName, int phoneNo){
        ph = phoneNo;
        name = empName;
    }
    private void countSallary(){
        System.out.println("200000/m");
    }

    int getph()
    {
        return ph;
    }
    String getName()
    {
        return name;
    }

    void setPh(int phone){
        ph = phone;
    }
    void setName(String name){
        this.name = name;
    }
}
