package inheritance;

public class circle1 {
     float radius;

    public circle1(float radius) {
        this.radius = radius;
    }


    public  float  cirArea(){
        return (float)Math.PI*radius * radius;
    }


    public String toStringCir() {
        return "the area of tasks.circle = "+cirArea();
    }
}
