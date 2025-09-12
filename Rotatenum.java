public class Rotatenum {
    public static void main(String[] args) {
        int num = 12345;
        int rot = 3; //20
        int len = 5;

        int rightPart = num % (int)(Math.pow(10, rot));
        int leftPart = num / (int)(Math.pow(10, rot));
        int result = rightPart*(int)(Math.pow(10, len-rot))+ leftPart;
        System.out.println(result);
    }
}



