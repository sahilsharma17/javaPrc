class Test2{
    int a=5,b=6;
    void meth(int i, int j){
    a*=i;
    b*=j;
    System.out.println(a + " " + b);
}
}

public class CallByValue {
    public static void main(String[] args) {
        Test2 t = new Test2();
        int c = 3;
        int d = 10;
        System.out.println(c + " " + d);
        t.meth(c,d);
        System.out.println(c + " " + d);
    }    
}