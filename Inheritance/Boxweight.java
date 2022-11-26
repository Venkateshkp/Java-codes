package Inheritance;

public class Boxweight extends Box{
    double weight;
    Boxweight(){
        this.weight = -1;
    } 
    Boxweight(double l, double w, double h){
        // this.l = l;
        // this.w = w;
        // this.h = h;
        super(l,w,h);
        System.out.println("check");
    }
}
