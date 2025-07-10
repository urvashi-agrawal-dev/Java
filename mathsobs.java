import java.util.*;
class mathsobs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no");
        int n = sc.nextInt();
        
        Set<Integer>divisors=new HashSet<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                divisors.add(i);
                divisors.add(n/i);
                }
            }
            List<Integer>list = new ArrayList<>(divisors);
            Collections.sort(list);
            System.out.println(list);
    }
}