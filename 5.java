import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long sum=1,sum2=0,multi=1;
        for(int i=0;i<n;i++){
            multi=5*i;
            sum+=multi;
        }
        for(int j=1;j<=n;j++){
            sum2=sum2+j*j;
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}