class Volume{
    int l, b, h;

    //constructor overloading
    Volume(){
        l = b = h = -1;
    }
    Volume(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    Volume(int len){
        l = b = h = len;
    }
    
    //method ovrloading
    int vol(){
        return -1;
    }
    int vol(int len){
        return len*len*len;
    }
    int vol(int l, int b, int h){
        return l*b*h;
    }
}

class Demo1{
    public static void main(String[] args) {
        Volume V = new Volume();
        System.out.println(V.vol());
        System.out.println(V.vol(6));
        System.out.println(V.vol(3, 4, 5));

        Volume V1 = new Volume();
        System.out.println(V1.l);
        Volume V2 = new Volume(9);
        System.out.println(V2.l);
        Volume V3 = new Volume(13, 14, 15);
        System.out.println(V3.l);
    }
}