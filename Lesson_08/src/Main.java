import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //long start = System.currentTimeMillis();

        int[] nums = {0,1,0,3,12};
        long start = System.currentTimeMillis();
        //moveZeroes(nums);

        moveZeroes1(nums);
        long end = System.currentTimeMillis();

        long rs = end- start;

        System.out.println(rs);

        //moveZeroes1(nums);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println("hello");
            }
        }

        for(int i = 0; i < 5; i++){

        }

    }

    public static void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                temp[j] = nums[i];
                j++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }


        //System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes1(int[] nums){

        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }

        //System.out.println(i);

        for(; i<nums.length; i++){
            nums[i] = 0;
        }

        //System.out.println(Arrays.toString(nums));

    }

    public static boolean isPrimeNuber(int n){ //O(n)
        for(int i = 2; i < n; i++){
            if(n%i==0){
                return false;
            }
        }

        return  n>1;
    }

    public static boolean isPrimeNumber(int n){ //O(sqrt(n))
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return n > 1;
    }

}
