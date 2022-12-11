package inheritance;

public class cubic extends square{
    public cubic(float len) {
        super(len);//get length from square class
    }
    public float cubicArea(){
        return squareArea()*6;
    }
    public String setCuArea(){
        return "the area of cubic = "+cubicArea();
    }//display the area of cubic
}
