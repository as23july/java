import java.util.*;
public class Array {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        
        int arr[] = {1,5,6,8,12,35,97,15,78,25,98,24};
        
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();    
        // }

        System.out.println("enter element to find");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x ) {
                
                System.out.println("found at index : " + i);
            }
        }
    }
}
