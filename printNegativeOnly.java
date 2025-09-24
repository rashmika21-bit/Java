import java.util.Scanner;
public class printNegativeOnly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the value of arr: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The value is: ");
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]+ " ");
            }
            // else break;
        }

        sc.close();
    }
}
