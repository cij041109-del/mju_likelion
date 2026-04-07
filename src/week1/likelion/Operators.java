package week1.likelion;

public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        String c = "abc";

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        //비교 연산자

        int e = 5;
        int d = 8;

        System.out.println(e > d);
        System.out.println(e < d);
        System.out.println(e <= d);
        System.out.println(e >= d);
        System.out.println(e == d);
        System.out.println(e != d);

        //논리 연산자

        int x = 3;
        int y = 3;
        int z = 5;

        System.out.println(y > x && z > y);
        System.out.println(y > x || z > y);

        System.out.println(!true);
        System.out.println(!false);

        //대입연산자

        int aa =1;
        double price = 12.5;

        // 증감 연산자
        aa++; // aa = aa +1;
        aa--; // aa = aa -1;

        System.out.println(aa++);

    }
}
