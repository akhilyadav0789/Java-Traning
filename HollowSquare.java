public class HollowSquare {
    public static void main(String[] args) {
        int n = 8; 
        for (int i = 0; i < n; i++) {          // row loop
            for (int j = 0; j < n; j++) {      // column loop
               
                if (i == 0 || i == n - 1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}
