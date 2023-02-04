class Volume1{
    int length, breadth, height;
    Volume1(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    int ans(){
        return length*breadth*height;
    }
}

public class ThisVol {
    public static void main(String[] args) {
        Volume1 v = new Volume1(3, 5, 6);
        System.out.println("Volume: " + v.ans());
        
    }
}
