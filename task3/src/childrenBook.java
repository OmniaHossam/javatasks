public class childrenBook extends book{

    childrenBook(float price){
        super(price);

    }
    @Override
    public float getPrice(){
        return price*10;
    }
}
