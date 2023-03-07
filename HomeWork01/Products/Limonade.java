package Products;

import Products.Groups.Drink;

public class Limonade extends Drink {

    public Limonade(String name, Double price, Double quantity, String unit, Double volume) {
        super(name, price, quantity, unit, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Limonade: " + super.toString());
        return sb.toString();
    }
}
