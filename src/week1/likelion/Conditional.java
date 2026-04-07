package week1.likelion;

public class Conditional {
    public static void main(String[] args) {

        int a =1;
        int b = 100;

        if (a!=b) {

            System.out.println("a!=b");
        } else if(a <b ) {
            System.out.println("a < b");
        } else if (a <= b) {

            System.out.println("a<=b");
        }else {
            System.out.println("else block");
        }
        
        
        
        int z =10;
        
        switch (z+1) {
            case 11:
                System.out.println("z + 1 == 11");
                break;
            case 10:
                System.out.println("z+1 == 10");
                break;
            case 9:
                System.out.println("z+1 == 9");
                break;
            default:
                System.out.println("default");
        }
    }
}
