//gretaest of two or three nos
import java.util.Scanner;
public class greatestoftwonos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First no");
        int a=sc.nextInt();
        System.out.println("2nd no");
        int b=sc.nextInt();
        System.out.println("3rd no");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is greater"+a);
        }
        else if(b>=c && b>=a){
            System.out.println("B is greater"+b);
        }
        else {
            System.out.println("c is greater"+c);
        }
    }
}
