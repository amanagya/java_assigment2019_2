import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int positive=0,negative=0,ceven=0,codd=0;
        for (int i=0;i<10;i++){
            arr[i]=scan.nextInt();
        }
        for(int num: arr){
            if(num>0){
                positive++;
            if(num%2==0){
                ceven++;
            }
            else{
                codd++;
            }
            }
            else{
                negative++;
            }
        }
        System.out.printf("%d Positive \n%d Even %d Odd \n%d Negative\n",positive,ceven,codd,negative);
    }
}