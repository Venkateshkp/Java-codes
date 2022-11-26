package OOPS.Inheritance;
public class Box {
    int l;
    int w;
    int h;
    Box(){
        this.l = 4;
        this.w = 5;
        this.h = 6;
    }
    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box(int l, int h, int w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
class BoxWeight extends Box{
    int BoxWeight;
    BoxWeight(){
        this.BoxWeight = 10;
    }
    BoxWeight(int l, int h, int w, int BoxWeight){
        super(l,h,w);  //call the parent class constructor
        this.BoxWeight = BoxWeight;
    }
}
class BoxHeight extends BoxWeight{
    int BoxHeight;
    // BoxHeight(){
    //     this.BoxHeight = 20;
    // }
}