//add three nos
import java.util.Scanner;
public class add3nos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 no");
        int a=sc.nextInt();
        System.out.println("no 2");
        int b=sc.nextInt();
        System.out.println("3no");
        int c=sc.nextInt();
        int sum = a+b+c;
        System.out.println("sum of three nos"+sum);
    }
}
