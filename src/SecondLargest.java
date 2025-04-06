import java.util.Scanner;

public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }

        if (secLargest == Integer.MIN_VALUE) {
            secLargest = -1;
        }

        return secLargest;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of the n: ");
        int n=scanner.nextInt();

        int[]arr=new int[n];
        System.out.println("Enter Array Elements: ");

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("Second largest number : "+getSecondLargest(arr));

    }
}

