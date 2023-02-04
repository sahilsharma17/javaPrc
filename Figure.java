import java.util.Scanner;

public class Figure{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("To find the areas of following figures press the respective keys");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("Enter your Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: System.out.println("Enter radius of circle");
                    float r = sc.nextFloat();
                    float area = 3.14f*r*r;
                    System.out.println("Area "+area);
                break;
            case 2: System.out.println("Enter side of square");
                    int s = sc.nextInt();
                    int are = s*s;
                    System.out.println("Area: "+are);           
                break;
            case 3: System.out.println("Enter length and breadth of rectangle");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    int ar = l*b;
                    System.out.println("Area "+ar);
                break;
        
            default: System.out.println("Invalid Input");
                break;
        }
        sc.close();  
    }
}