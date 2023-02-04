class Box{
    private  int l,b,h;
      Box(int l){
          this.l=this.b=this.h=l;
      }
      Box(){
  
      }
      Box(int l, int b, int h){
          this.l=l;
          this.b=b;
          this.h=h;
      }
      void showVol(){
        System.out.println(l*b*h);
      }
     

  }
  class BoxWeight extends Box{
    int w;
    BoxWeight(int l, int b, int h, int w){
        super(l,b,h);
    }  
  }
  
  public class playingWithSuper {
    public static void main(String[] args) {
        BoxWeight B = new BoxWeight(1, 2, 3, 4);
        B.showVol();
    }   
  }

  


// class Box{
//     private int length;
//     private int width; 
//     private int height;
//     Box(Box ob){
//         width =  ob.width;
//         length = ob.length;
//         height = ob.height;
//     }
// }

// class BoxWeight extends Box{
//     int weight;
//     BoxWeight(l)
//     BoxWeight(BoxWeight ob){
//         super(ob);
//         weight = ob.weight;
//     }
// }
// class Demo{
//     System.out.println
// }