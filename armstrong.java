import java.util.*;
class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no");
        int sum=0;
        int n = sc.nextInt();
        int dup = n;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;
            sum = sum+(lastdigit*lastdigit*lastdigit);

        }
        if(sum == dup){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}