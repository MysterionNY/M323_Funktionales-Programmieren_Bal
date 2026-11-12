package kapitel01;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartB {

    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public int getDiscount() {
        return items.contains("Buch") ? 5 : 0;
    }
}
