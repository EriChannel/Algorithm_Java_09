import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr= {25, 30, 40, 17, 20,19, 8};
        int[] result = mergeSort(arr, 0, arr.length-1);

//        int[] arr1 = {5,2,8};
//        int[] arr2 = {1, 3,4};
//
//        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));

    }

    public static int[] mergeSort(int[] nums, int iLeft, int iRight){

        //Điều kiện dừng
        if(iLeft == iRight){
            int[] singleElement = {nums[iLeft]};
            return singleElement;
        }

        //Chia mảng
        int iMid = (iLeft+iRight)/2;
        //System.out.println(iLeft + " - " + iMid + " - " + iRight);
        int []arrLeft = mergeSort(nums, iLeft, iMid);
        int []arrRight = mergeSort(nums, iMid+1, iRight);

        //Gộp mảng

        int[] result = merge(arrLeft, arrRight);
        return result;
    }

    public static int[] merge(int[] nums1, int[] nums2){
        int n = nums1.length+nums2.length;
        int[] result = new int[n];

        int i = 0;
        int i1 = 0;//Duyệt nums1
        int i2 = 0;//Duyệt nums2

        while (i < n){
            if(i1 < nums1.length && i2 < nums2.length){ //cả hai mảng nums1 và nums2 không rỗng
                if(nums1[i1] <= nums2[i2]){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else { //nums1[i1] > nums2[i2]
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }else {
                if(i1 < nums1.length){ //nums1 không rỗng, nums2 rỗng
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else{ //nums1 rỗng, nums2 không rỗng
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }

            }
        }

        return result;
    }
}
