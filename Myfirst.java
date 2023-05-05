import java.util.*;
import Folder.*;
class First{
    public void print(){
        System.out.println("first method called");
    }
}
class Second extends First{
    public void print(){
        System.out.println("second method called");
    }
}

public class Myfirst {
    
    public static void main(String[] args) {

        First me = new First();
        me.print();
        // Myclass myclass = new Myclass();
        
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // myclass.print(a, b);
        // int sum = aa+b; 
        // if(a == b)
        // {
        //     System.out.println("equal");
        // }
        // else if(a>b){
        //         System.out.println("a greater");

        //     }
        // else{
        //         System.out.println("b greater");
        //     }        
    }
}
 