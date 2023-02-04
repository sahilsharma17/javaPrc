import java.util.*;
class Find{
    int factorial1(int i){
        if(i==0 || i==1) return 1;
        else{
            return i*factorial1(i-1);
        }
    }
}
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int input = sc.nextInt();
        Find result = new Find();
        System.out.println(result.factorial1(input));
        sc.close();
    }
}
