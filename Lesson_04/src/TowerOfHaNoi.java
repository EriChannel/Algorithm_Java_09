public class TowerOfHaNoi {
    public static void main(String[] args) {
        int soDia = 3;
        towerOfHaNoi(soDia, 'A', 'B', 'C');
    }

    public static void towerOfHaNoi(int n, char col1, char col2, char col3){
        if(n == 1){//chỉ có 1 đĩa
            System.out.println("Chuyển đĩa 1 từ cột " +col1 +" sang cột "+col3);
            return;
        }else{
            towerOfHaNoi(n-1,col1, col3, col2);
            System.out.println("Chuyển đĩa " + n + " từ cột " +col1+ " sang cột "+col3 );

            towerOfHaNoi(n-1, col2, col1, col3);
        }


    }
}
