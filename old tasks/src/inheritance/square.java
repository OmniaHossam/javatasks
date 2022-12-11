package inheritance;

public class square {
    private float len;
    public square(float len){
        this.len=len;
    }
    public float squareArea(){
        return len*len;
    }
    public String setSqArea(){
        return "the area of square = "+squareArea();
    } //display the area of square
}
