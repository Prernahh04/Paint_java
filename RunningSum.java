import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] peru = {1 ,1, 1 ,1 ,1 ,1 };
   int sum =0;
        for(int i =0 ; i<peru.length; i++){
    sum =sum+ peru[i];
    System.out.print(sum+ " ");
   }
    }
}
