import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Rows and Columns ?");
        int r = scan.nextInt();
        int c = scan.nextInt();
        int flag=0;
        int[][] mat=new int[r][c];
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                if(mat[i][j]!=0){
                    flag=1;
                }
            }
        }
        if(flag==0){
            System.out.println("It is What it is ! UTM");
        }
        else{
            System.out.println("Not an upper Triangular Matrix");
        }
    }
}