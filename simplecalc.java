//simple calculator in java
import java.util.Scanner;
public class simplecalc {
    public static void main(String[] args) {
        char operator;
        Double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("+,-,*,/");
        operator = sc.next().charAt(0);
        
        System.out.println("1st no");
        double num1=sc.nextDouble();
        
        System.out.println("2nd no");
        double num2=sc.nextDouble();
        switch(operator){
            case '+':
            result=num1+num2;
            System.out.println(num1+"+"+num2+"="+result);
            break;

            case '-':
            result=num1-num2;
            System.out.println(num1+"-"+num2+"="+result);
            break;
            case '*':
            result=num1*num2;
            System.out.println(num1+"*"+num2+"="+result);
            break;
            case '/':
            result=num1/num2;
            System.out.println(num1+"/"+num2+"="+result);
            break;
            default:
            System.out.println("Invalid operator");
            break;
        }

    }
}
