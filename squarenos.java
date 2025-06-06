//Square of nos
import java.util.Scanner; //importing class
public class squarenos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("first no");
        int a = sc.nextInt();
        //second way of doing it is
        int square = a*a;
        //double square=Math.pow(a,2); //one way of doing it 
        System.out.println("square of nos"+square);

    }
}
