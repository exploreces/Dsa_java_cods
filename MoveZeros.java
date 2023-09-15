import java.util.Arrays;

/**
 * MoveZeros
 * 
 * Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
public class MoveZeros {
    public static void move(int[]arr){
        int i =0;
        for(int num : arr){
            if (num!=0){
                arr[i]=num;
                i++;
            }
        }
        while(i<arr.length){
            arr[i]=0;
            i++;
        }
        
    }
    public static void main(String[]args){
        int[] arr = {1,2,0,4,5,0,3};
        move(arr);
        System.out.print(Arrays.toString(arr));
    }
}

        
   