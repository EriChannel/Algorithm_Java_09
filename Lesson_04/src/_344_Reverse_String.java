import java.util.Arrays;

public class _344_Reverse_String {
    public static void main(String[] args) {
        char[] arr= {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverseString(char[] s) {
        //reverseStringRecusion(s, 0);
        for(int i = 0; i < s.length/2; i++){
            char tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
    }

    public static void reverseStringRecusion(char[] s, int index) {
        if(index >= s.length/2){
            return;
        }
        char tmp = s[index];
        s[index] = s[s.length-1-index];
        s[s.length-1-index] = tmp;

        reverseStringRecusion(s, index+1);
    }
}
