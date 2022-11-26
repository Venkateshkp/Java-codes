package Inheritance;

class Box {
    double w;
    double h;
    double l;

    Box(){
        this.w = -1;
        this.h = -1;
        this.l = -1;
    }
    Box(double side){
        this.w = side;
        this.h = side;
        this.l = side;
    }
    Box(double l, double w, double h){
        this.l = w;
        this.w = w;
        this.h = h;
    }  
}
