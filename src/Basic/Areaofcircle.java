package Basic;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        System.out.println("Calculate the Area of circle ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius is : ");
        int r = sc.nextInt();
        float pie = 3.14f;
        float Area = (pie)*(r)*(r);
        System.out.println("Area of cicle is : "+Area);
    }
}
