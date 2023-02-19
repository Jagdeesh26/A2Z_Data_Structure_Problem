public class Shorting_Algorithnm {
    static void printarray(int []arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void selctionsort(int [] a){
        int n= a.length;
        for (int i=0;i<n-1;i++){
        int min=i;
        for (int j=i+1;j<n;j++){
            if (a[j]<a[min]){
                min=j;
            }
        }
        int temp=a[min];
        a[min]=a[i];
        a[i]=temp;
        }
    }
    static void bubblesort(int[]a){
        int n= a.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={88,4,7,9,3,1,2};
        //selection sort
        System.out.println("Sorting With Using Selection Sort");
        selctionsort(arr);
        printarray(arr);
        // bubble sort
        System.out.println("\nSorting With Using Bubble Sort");
        bubblesort(arr);
        printarray(arr);
    }
}
