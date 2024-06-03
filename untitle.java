public class untitle {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,4,5,6,7,8};
        for(int i = 0; i<arr.length/2 ;i++){
            System.out.print(arr[i] +" "+ arr[arr.length/2 + i]+ " ");
        }
    }
}
