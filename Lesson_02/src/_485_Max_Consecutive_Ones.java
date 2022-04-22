public class _485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        int nums[] = {1, 0,1,1,1,1,0,1};
        int sum = findMaxConsecutiveOnes(nums);
        System.out.println(sum);
    }

//    public static int findMaxConsecutiveOnes(int[] nums) {
//        int max = 0;
//        int sum = 0;
//
//
//        for(int i : nums){
//            if(i == 1){
//                sum++;
//                if(sum > max){
//                    max = sum;
//                }
//            }else{ //i == 0
//                sum = 0;
//
//            }
//        }
//        return max;
//    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int i = 0;
        while (i < nums.length) {
            int conOnes = 0;
            while (i < nums.length && nums[i] == 1) {
                conOnes++;
                i++;
            }
            maximum = Math.max(maximum, conOnes);
            i++;
        }
        return maximum;
    }
}
