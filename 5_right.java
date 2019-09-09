import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long num1=scan.nextInt();
        long num2=scan.nextInt();
        char op = scan.next().charAt(0);
        System.out.println("IF (1)| Switch (2)");
        int sw = scan.nextInt();
        if(sw==1){
        if(op=='+'){
            System.out.println(num1+num2);
        }
        else if(op=='-'){
            System.out.println(num1-num2);
        }
        else if(op=='*'){
            System.out.println(num1*num2);
        }
        else if(op=='/'){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Not a Valid operation !");
        }
    }
    else{
        switch(op){
            case '+':
            System.out.println(num1+num2);
            break;
            case '-':
            System.out.println(num1-num2);
            break;
            case '*':
            System.out.println(num1*num2);
            break;
            case '/':
            System.out.println(num1/num2);
            break;
            default:
            System.out.println("Not a valid Operation");
        }
    }
    }
}
