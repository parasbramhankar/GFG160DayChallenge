import java.util.Scanner;

public class MoveAllZeroesToEnd {
    static void pushZerosToEnd(int[] arr) {
        // code here
        int left=0;
        int right=0;
        int n=arr.length;

        while(right<n){

            if(arr[right]!=0)
            {
                arr[left]=arr[right];
                left++;
            }

            right++;

        }

        while(left<n){
            arr[left]=0;
            left++;
        }

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

        pushZerosToEnd(arr);

        for(int num:arr){
            System.out.print(num+" ");
        }


    }
}
