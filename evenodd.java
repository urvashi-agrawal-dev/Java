//check if a no is even or odd
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);
    System.out.println("number 1");
    int a = sc.nextInt();
    
    if (a%2==0)
    {
        System.out.println("print even"+a);
    }
    else {
        System.out.println("print odd"+a);
    }
    
    }
}
