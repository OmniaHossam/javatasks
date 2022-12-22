public class book extends product {

    book(float price){
        super(price);
    }
    @Override
    public float getPrice(){
        return price*5;
    }
}
