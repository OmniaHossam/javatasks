package interfac;

public class boo implements p {
    private float price;
    boo(){

    }
    boo(float price){
        this.price=price;
    }
    @Override
    public void setPrice(float price) {
       this.price=price;
    }

    @Override
    public float getPrice() {

        return price*5;
    }
}
