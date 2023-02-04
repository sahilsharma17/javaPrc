class Test{
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    void meth(Test O){
        O.a *= 2;
        O.b *= 2;
    }
}

class CallByReference{
    public static void main(String[] args) {
        Test t = new Test(3, 4);
        System.out.println(t.a + ", " + t.b);
        t.meth(t);
        System.out.println(t.a + ", " + t.b);
    }
}
