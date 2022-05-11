import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _349_Intersection_of_Two_Arrays {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
//        int[] result = intersection(nums1, nums2);
//        System.out.println(Arrays.toString(result));

        int[] rs = intersectionUsingHashMap(nums1, nums2);
        System.out.println(Arrays.toString(rs));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(Integer i : nums1){
            set1.add(i);
        }
        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<>();
        for(Integer i : nums2){
            set2.add(i);
        }

        System.out.println(set2);


        set1.retainAll(set2);

        int[]result = new int[set1.size()];
        int j = 0;
        for (Integer i: set1){
            result[j] = i;
            j++;
        }

        //System.out.println(set1);
        return result;
    }

    public static int[] intersectionUsingHashMap(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            hashMap.put(nums1[i], true);
        }

        System.out.println(hashMap);

        int count = 0;
        for(int i = 0; i < nums2.length; i++){
            if(hashMap.containsKey(nums2[i])){
                if(hashMap.get(nums2[i])){
                    hashMap.put(nums2[i], false);
                    count++;
                }

            }
        }

        System.out.println("Kích thước: "+count);


        System.out.println(hashMap);

        int[] rs = new int[count];
        int i = 0;
        for(Map.Entry<Integer, Boolean> entry : hashMap.entrySet()){
            if(!entry.getValue()){
                rs[i] = entry.getKey();
                i++;
            }
        }

        return rs;
    }
}
