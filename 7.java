import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String palin = scan.next();
        String rev="";
        for(int i = palin.length()-1; i>-1; i--){
            rev = rev + palin.charAt(i);
        }
        if(palin.equalsIgnoreCase(rev)){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Isn't Palindrome");
        }
    }
}