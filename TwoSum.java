import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int[] arr = new int[4];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the array element: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The result is: ");
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] + arr[j]== target){
                   System.out.println("Index " + i + " + " + j + " = " + (arr[i] + arr[j])
                                       + " (" + arr[i] + " + " + arr[j] + ")");
                }
            }
        }

    }
}
