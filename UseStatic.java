public class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x){
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }
    static{
        System.out.println("Block initialized");
        // b = a * x;
    }
    public static void main(String[] args) {
        meth(42);
    }
}
