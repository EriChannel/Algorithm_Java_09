public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
//        int count = 0;
//        for(int  i : nums){
//            if(countDigit(i) % 2 == 0){
//                count++;
//            }
//        }
//        return count;

        int count = 0;
        for(int  i : nums){
            if(countDigitString(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));

    }

    public static int countDigit(int number){
        int count = 0;
        while(number != 0){
            number = number/10;
            count++;
        }

        return count;
    }

    public static int countDigitString(int num){
        String temp = String.valueOf(num);
        return temp.length();

    }

}
