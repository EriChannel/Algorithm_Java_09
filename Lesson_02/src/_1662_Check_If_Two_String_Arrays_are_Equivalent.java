public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[]word1 = {"ab", "c"};
        String []word2 = {"a", "cb"};

        boolean flag = arrayStringsAreEqual(word1, word2);
        System.out.println(flag);
    }

//    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//
//        for(String s : word1){
//            sb1.append(s);
//        }
//
//        for(String s : word2){
//            sb2.append(s);
//        }
//
//        return sb1.toString().equals(sb2.toString());
//    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String sb1 = new String();
        String sb2 = new String();

        for(String s : word1){
            sb1 += s;
        }

        for(String s : word2){
            sb2 += s;
        }

        return sb1.equals(sb2);
    }
}
