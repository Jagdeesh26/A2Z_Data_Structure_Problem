import java.util.Scanner;

public class Print_All_Divisors_1_to_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int Number= sc.nextInt();
        System.out.println("All Divisors Of "+ Number+" Are");
        for (int i=1;i<=Number;i++){
            if (Number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
