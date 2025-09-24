public class ReverseArray {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {6,8,1,2,4,9};
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
        // for(int k =0;k<arr.length;k++){
        //     System.err.print(arr[k] + " ");
        // }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

}
