package inheritance;

public class cylindrical1 extends circle1 {
 float height;//height of cylindrical

    public cylindrical1(float radius,float height) {
        super(radius);//get radius from parent class circle1
        this.height=height;
    }


    public float  cylArea(){
        return (cirArea()*2)*height;
   }

    public String toStringCyl() {
        return "the area of cylindrical " +
                cylArea();
    } //return method for displaying the total area of cylindrical
}
