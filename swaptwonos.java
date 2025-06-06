//swap of two nos

import java.util.Scanner;
public class swaptwonos {
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("input first no");
    int a =sc.nextInt();
    System.out.println("input second no");
    int b=sc.nextInt();
    System.out.println("before swapping : a="+a+",b="+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("After swaping:a="+a+",b="+b);
    
    sc.close();
    }
    

}
