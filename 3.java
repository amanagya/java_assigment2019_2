import java.util.*;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count=0;
        while(num!=1){
        if(num%2==0){
            num/=2;
            System.out.println(num);
        }
        else{
            num=(num*3)+1;
            System.out.println(num);
        }
        count++;
    }
    System.out.printf("No. of Operations: %d",count);
        
    }
}