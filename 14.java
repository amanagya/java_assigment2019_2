import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Rows and Columns ?");
        int r = scan.nextInt();
        int c = scan.nextInt();
        int max=0;
        int[][] mat=new int[r][c];
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=scan.nextInt();
            }
        }
        max = mat[0][0];
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(max < mat[i][j]){
                    max = mat[i][j];
                }
            }
        }
        System.out.printf("Maximun numer is %d",max);
        
    }
}