import chapter6.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int number = 1000;
        byte bNumber = (byte)number;

        int num = 10;
        int bNum = 0b1010;
        int oNum = 012;
        int xNum = 0xA;



        System.out.println(number);
        System.out.println(bNumber);

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);
        System.out.println("Hello World!");

        ArrayList<Subject> csharp = new ArrayList<Subject>();
        csharp.add(new Subject("csharp", 100));

        Student jinam = new Student(1, "jinam", csharp);
        jinam.showInfo();
    }
}
