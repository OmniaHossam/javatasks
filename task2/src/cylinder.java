public class cylinder extends circle {
    private double height=1.0;
    cylinder(){

    }
    cylinder(double height){
       this.height=height;
    }
    cylinder(double height, double radius){
        super(radius);
        this.height=height;

    }
    cylinder(double height, double radius, String color){
        super(radius,color);
        this.height=height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return 2*super.getArea()*getHeight();
    }

    @Override
    public String toString() {
        return "cylinder{" +
                "height=" + height +", Volume = "+getVolume()+
                '}';
    }
}
