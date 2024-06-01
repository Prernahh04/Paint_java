public class BinarySearch{
    public static void main(String[] args){
    //array syntax
    int[] arr = { 2, 5, 6 , 11 , 12 , 14, 17 ,18 ,23 , 27, 39};
    int target = 16;
   System.out.println(Binarysearch(arr, target));
    }// return index for the target 
    static int Binarysearch(int[] arr , int target){
     int start = 0;
     int end = arr.length - 1; 

     while(start <= end){
        int mid = start + (end - start)/2 ;
        if(target < arr[mid]){
            end = mid -1 ;
        }else if (arr[mid]< target){
            start = mid +1; 

        }else {
            return mid;
        }


     }
     return -1; 


    }
}