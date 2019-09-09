import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long[] arr = new long[10];
        int count=0;
        for (int i=0;i<10;i++){
            arr[i]=scan.nextLong();
        }
        System.out.println("Find :");
        long find = scan.nextLong();
        for (long num : arr) {
            if(num == find){
                count++;
            }
        }
        if(count==0){
            System.out.println("No Instance Found");
        }
        else{
            System.out.printf("%d Occurences Found",count);
        }
    }
}