import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Size :");
        int size=scan.nextInt();
        int k=0;
        double[] arr=new double[size];
        double[] rev = new double[size];
        for (int i=0;i<size;i++){
            arr[i]=scan.nextDouble();
        }
        for(int j=size-1;j>=0;j--){
            rev[k]=arr[j];
            k++;
        }
        System.out.println(rev);
    }
}