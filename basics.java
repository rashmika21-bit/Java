import java.util.Scanner;
public class basics {
    public static void main(String[] args){
        // int[] x = {6,19,17,45,65,98};
        // System.out.println(x[0]);

        // int[] arr = {21,34,56,-221,45,222};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");

        // }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value: ");
            arr[i] = sc.nextInt();

        }

        System.out.print("The values of an array is: ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
 }
