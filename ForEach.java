public class ForEach {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        for(int ele : arr){
            System.out.print(ele+2 + " "); 
            //For each loop is only used to display the array. we can't make any changes to an array using for each loop.
        }
    }
}

