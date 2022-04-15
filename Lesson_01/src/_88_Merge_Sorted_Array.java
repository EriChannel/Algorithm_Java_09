import java.util.Arrays;

public class _88_Merge_Sorted_Array {

    public static void main(String[] args) {
        int[] nums1= new int[] {1,2,3,0,0,0};
        int m=3;
        int[] nums2= new int[] {2,5,6};
        int n=3;
//        int k=m+n;
//        while(m>0 && n>0){
//            if(nums1[m-1]>nums2[n-1]) {
//                nums1[k-1]= nums1[m-1];
//                m=m-1;
//            } else {
//                nums1[k-1] = nums2[n-1];
//                n=n-1;
//            }
//            k=k-1;
//        }
//        System.out.println(Arrays.toString(nums1));

        int i = m -1;
        int j = n - 1;
        int k = (m+n)-1;

        while (k >= 0){
            if(j < 0){ //mảng nums2 không có phần tử
                nums1[k] = nums1[i];
                i--;
            }else if(i < 0) { //m = 0
                nums1[k] = nums2[j];
                j--;
            }else if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else { //nums1[i] <= nums2[j]
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        System.out.println(Arrays.toString(nums1));
    }
}
