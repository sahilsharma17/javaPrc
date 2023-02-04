class Testing {
    int a;
    public int b;
    private int c;

void setc(int i){
    c=i;
}
int getc (){
    return c;
}
}

public class Test1{
    public static void main(String args[]){
        Testing t = new Testing();
        t.a = 5;
        t.b = 4;
        //t.c = 4;
        t.setc(6);
        System.out.println(t.a+" "+t.b+" "+t.getc());
        //System.out.println(t.getc());
    }
}