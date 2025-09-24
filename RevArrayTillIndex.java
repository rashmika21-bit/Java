public class RevArrayTillIndex {
    //reverse an array till specific index from 2 to 5 index 
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,65,23,45,76};
        int i =2;
        int j = 5;
        while(i<j){
            swap(arr, i ,j);
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
    
}
