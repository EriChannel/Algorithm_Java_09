public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println("Chuỗi ban đầu: " + sb);
        //Nối chuỗi

        sb.append("world");
        System.out.println("Chuỗi sau khi nối: " + sb);

        //chèn
        sb.insert(2, "abc");
        System.out.println("Chuỗi sau khi chèn: " + sb);

        //Thay thế
        sb.replace(0, 5, "xyz");
        System.out.println("Chuỗi sau khi thay thế: "+sb);

        //Xóa
        sb.delete(0, 3);
        System.out.println("Chuỗi sau khi xóa: " + sb);

        //Đảo ngược chuỗi
        sb.reverse();
        System.out.println("Chuỗi sau khi đảo ngược: " + sb);


    }
}
