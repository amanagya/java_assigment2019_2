import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Matrix :");
        int n = scan.nextInt();
        int[][] mat=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=scan.nextInt();
            }
        }
        System.out.println("90deg (1) | 180 deg(2)");
        int sel=scan.nextInt();
        if(sel==1){
        rotate(mat,n);
        System.out.println(mat);
        }
        else{
            rotate(mat,n);
            rotate(mat,n);
            System.out.println(mat);
        }
    }
    static void rotate(int[][]a,int N){
        for (int i = 0; i < N / 2; i++) 
    { 
        for (int j = i; j < N - i - 1; j++) 
        { 
            int temp = a[i][j];
            a[i][j] = a[N - 1 - j][i]; 
            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
            a[j][N - 1 - i] = temp; 
        } 
    }
    }
}