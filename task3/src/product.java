public abstract  class product {
    float price;
    product(){

}
    product(float price) {
         this.price = price;
     }

    public void setPrice(float price) {
        this.price = price;
    }

    public  abstract float getPrice();

}
