import java.util.Scanner;
public class SecondMaxElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for(int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        int smax = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]> smax && arr[i]< max){
                smax = arr[i];
            }
        }
        System.out.println("The second max number is: " + smax);


    }
    
}
