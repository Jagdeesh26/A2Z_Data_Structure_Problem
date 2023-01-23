import java.util.Scanner;

public class Number_Is_Prime {
    static boolean isPrime(int N){
        for(int i=2;i<N;i++){
            if (N%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Is Prime Or Non Prime");
        int N= sc.nextInt();
        boolean ans = isPrime(N);
        if (N!=1 && ans==true ) {
            System.out.println(N + " Is A Prime Number");
        }
        else {
            System.out.println(N + " Is A Non-Prime Number");
        }
    }
}
