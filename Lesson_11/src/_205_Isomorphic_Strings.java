import java.util.HashMap;

public class _205_Isomorphic_Strings {
    public static void main(String[] args) {
        String s = "foo", t = "bar";
        boolean flag = isIsomorphic(s, t);
        System.out.println(flag);
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            char y = t.charAt(i);

            System.out.println(x + " - " + y);
            if(hashMap.containsKey(x)){
                if(hashMap.get(x) != y){
                    return false;
                }
            }else{
                if(hashMap.containsValue(y)){
                    return false;
                }

                hashMap.put(x, y);
            }
        }

        return true;
    }
}
