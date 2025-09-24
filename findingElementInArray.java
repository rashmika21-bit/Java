import java.util.Scanner;

public class findingElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr ={1,45,78,43,78,97};
        boolean flag = false;
        int index = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag) System.out.println("Traget exists in array");
        else System.out.println("Target does not exist in array");

        if(flag) System.out.println(index);

    }
}
