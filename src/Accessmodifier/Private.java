package Accessmodifier;

public class Private {
    private static void mul(){
        int a=6;
        int b=7;
        int c=a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Private.mul();
    }
}
