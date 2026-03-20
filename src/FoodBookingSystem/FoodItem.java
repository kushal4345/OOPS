package FoodBookingSystem;

public class FoodItem {
    private String foodName;
    private String type;
    private int quantity;
    private int price;

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
}






}
