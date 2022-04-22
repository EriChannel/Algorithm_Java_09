import java.util.Arrays;

public class SortArray {

    public static void bubbleSort(int[] arr){
        int n = arr.length;

        boolean flag = false;
        for(int i = 0; i < n; i++){
            flag = false;
            for(int j = 0; j < n - i - 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }

//            System.out.println("Lần lặp " + i);
//            show(arr);
        }


    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            //lấy index của phần tử nhỏ nhất
            int minIdx = i;
            for(int j = i+1; j<n; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }

            //Thay đổi vị trí
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void show(int[] arr){
        for(int i : arr){
            System.out.print(i + " \t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {5,1,3,8,2};

        System.out.println("Mảng ban đầu");
        show(nums);
        long start = System.nanoTime();
        //bubbleSort(nums);

        //insertionSort(nums);

       // selectionSort(nums);

        Arrays.sort(nums);

        long end = System.nanoTime();

        System.out.println(end - start);
        System.out.println("mảng sau khi sắp xếp: ");

        show(nums);
    }
}
