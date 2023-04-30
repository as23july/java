public class ReverseString {
    public static void main(String args[]) {
        String n = "My name is Aditya Singh";
        String ans = "", word = "";
        int size = n.length()-1;
        // int k;
        for (int i = 0; i <= size; i++) {
            
            if(n.charAt(i) != ' '){
                char ch = n.charAt(i);
                word = ch+word;    

            }
            else{
                ans = ans + word +" ";
                word = "";
            }
        }
        System.out.println(ans);
    }
}
