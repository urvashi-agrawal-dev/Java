//cube java
import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write no");
        int a =sc.nextInt();
        double cube = Math.pow(a,3);
        System.out.println("cube"+cube);
    }   
}
