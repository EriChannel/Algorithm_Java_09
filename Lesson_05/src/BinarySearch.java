public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10, 11,12,13,14,15,16,17,18,19};

//        for(int i = 0; i < numbers.length; i++){
//            if(numbers[i] == 5){
//                System.out.println(i);
//            }
//        }

        int index = binarySearch(numbers, 17);
        System.out.println(index);

        int i = binarySearchRecusion(numbers, 8, 0, numbers.length-1 );
        System.out.println(i);
    }


    public static int binarySearch(int[] numbers, int key){
        int n = numbers.length;
        int left = 0;
        int right = n-1;

        while (left<=right){
            int mid = (left+right)/2;
            System.out.println("left: " + left + ", right: " + right + ", mid: " + mid);

            //key == numbers[mid]
            if(key == numbers[mid]){
                return mid;
            }else if(key > numbers[mid]){
                left = mid+1;
            }else { //key < numbers[mid]
                right = mid - 1;
            }
        }

        //nếu phần tử cần tìm không có trong danh sách
        return  -1;
    }

    public static int binarySearchRecusion(int[] nums, int target, int left, int right){
        int n = nums.length;
//        left = 0;
//        right = n - 1;

        if(left <= right){
            int mid = (left+right)/2;

            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                return binarySearchRecusion(nums, target, mid+1, right);
            }else {
                return binarySearchRecusion(nums, target, left, mid - 1);
            }
        }

        return -1;
    }
}
