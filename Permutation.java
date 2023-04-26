import java.util.*;
public class Permutation {
    public static void printpemu(String str, String newstring) {
        if(str.length() ==0)
        {
            System.out.println(newstring);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i+1);
            printpemu(newstr,newstring+currchar);
        }
    }
    public static void main(String[] args) {
        String abc = "abc";
        printpemu(abc, ""); 
    }
}
