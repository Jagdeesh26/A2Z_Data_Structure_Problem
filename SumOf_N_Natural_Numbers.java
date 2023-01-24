public class SumOf_N_Natural_Numbers {
    static void sumofquebeNumber(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=(i*i*i);
        }
        System.out.println("Sum Of "+n+" Cube Numbers Is : "+sum);
    }
    static void sumOfNumbers(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum Of "+n+" Natural Numbers Is : "+sum);
    }
    public static void main(String[] args) {
        int number=7;
       //  sumOfNumbers(number);
        sumofquebeNumber(number);
    }
}
