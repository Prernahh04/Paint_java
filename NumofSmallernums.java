 

public class NumofSmallernums {
    public static void main(String[] args){
        int[] arr = {8, 1, 2, 2, 3}; 
        
 for(int i:SmalleNums(arr) ){
    System.out.print(i+" ");
 }
    }
    static int[] SmalleNums(int[] arr){
        //we have build up an array that will be filled  in given loop by counting 
    int[] counting =  new int[arr.length]; 
 
   for(int i = 0; i < arr.length; i++){     
   int count= 0;  
    for(int j=0; j < arr.length; j++){
        if(arr[i] > arr[j]){
            count++; 
        }
     }
     counting[i]= count;

   }
return counting;  
    }
}
