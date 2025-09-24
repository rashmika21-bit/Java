import java.util.Scanner;
public class rotateArray {
    public static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        //roate from right by k steps
        int k = sc.nextInt();
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
