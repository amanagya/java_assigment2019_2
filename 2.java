import java.util.Scanner;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Month Number");
        int num = scan.nextInt();
        System.out.println("IF-ELSE - 0 | SWITCH - 1");
        int sw = scan.nextInt();
        if(sw==0){
        if(num == 1){
            System.out.println("January");
        }
        else if(num == 2){
            System.out.println("February");
        }
        else if(num == 3){
            System.out.println("March");
        }
        else if(num == 4){
            System.out.println("April");
        }
        else if(num == 5){
            System.out.println("May");
        }
        else if(num == 6){
            System.out.println("June");
        }
        else if(num == 7){
            System.out.println("July");
        }
        else if(num == 8){
            System.out.println("August");
        }
        else if(num == 9){
            System.out.println("September");
        }
        else if(num == 10){
            System.out.println("October");
        }
        else if(num == 11){
            System.out.println("November");
        }
        else if(num==12){
            System.out.println("December");
        }
        else{
            System.out.println("Are You on Earth ??");
        }}
        else{
            switch(num){
                case 1:
                System.out.println("January");
                break;
                case 2:
                System.out.println("February");
                break;
                case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("April");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                break;
                case 7:
                System.out.println("July");
                break;
                case 8:
                System.out.println("August");
                break;
                case 9:
                System.out.println("September");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("November");
                break;
                case 12:
                System.out.println("December");
                break;
                default:
                System.out.println("Are you on Earth ??");
            }
        }
    }
}