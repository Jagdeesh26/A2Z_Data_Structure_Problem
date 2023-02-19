public class reverse_array {
        static void swap(int [] arr){
        int n= arr.length;
        int i=0,j=n-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k=0;k<n;k++){
        System.out.print(arr[k]+" ");
        }
     }
    public static void main(String[] args) {
    int [] arr={1,3,4,5};
    swap(arr);
    }
}
