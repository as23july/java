public class PallendromString {
    public static void main(String args[]) {
        String n = "aabbbaa";
        String s = "aabbbha";
        int size = n.length()-1;
        if(n.equals(s))
        {
            System.out.println("pallendrom");
        }
        else{
            System.out.println("not pallendrom");
        }
    }
}
