import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {25, 3, 40, 17, 20,19, 8};

        //quickSort(arr, 0, arr.length-1);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] nums, int iLeft, int iRight){
        //Điều kiện dừng

        if(iLeft >= iRight){
            return;
        }

        //Chọn khóa
        int iMid = (iLeft + iRight)/2;
        int key = nums[iMid];

        int pi = partition(nums, iLeft, iRight, key);
        System.out.println("Chốt: " + pi);

        //Công thứ đệ quy
        quickSort(nums, iLeft, pi-1);
        quickSort(nums, pi, iRight);


    }

    public static int partition(int[] nums, int iLeft, int iRight, int key){
        int L = iLeft;
        int R = iRight;

        while (L <= R){
            while (nums[L] < key){
                L++;
            }

            while (nums[R] > key){
                R--;
            }
            //Thay đổi vị trí
            if(L <= R){
                int tmp = nums[L];
                nums[L] = nums[R];
                nums[R] = tmp;
                L++;
                R--;
            }

            System.out.println(Arrays.toString(nums));
        }
        return L;
    }
}
