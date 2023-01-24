
public class Print_Name_N_Times_withRecursion {
    static void namePrint(int n){
        if (n==0) return;
        System.out.println("Jagdeesh");
        namePrint(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        namePrint(n);
    }
}
