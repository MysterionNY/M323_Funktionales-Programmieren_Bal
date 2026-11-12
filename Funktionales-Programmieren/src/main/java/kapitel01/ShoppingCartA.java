package kapitel01;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartA {

    private final List<String> items = new ArrayList<>();
    private boolean hasBook = false;

    public void addItem(String item) {
        items.add(item);

        if (item.equals("Buch")) {
            hasBook = true;
        }
    }

    public void removeItem(String item) {
        boolean removed = items.remove(item);

        if (removed && item.equals("Buch")) {
            hasBook = items.contains("Buch");
        }
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public int getDiscount() {
        return hasBook ? 5 : 0;
    }
}
