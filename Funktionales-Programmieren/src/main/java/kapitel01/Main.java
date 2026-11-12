package kapitel01;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Aufgabe 1
        System.out.println("=== Aufgabe 1 ===");

        System.out.println(Aufgabe1.calculateScore("imperative"));
        System.out.println(Aufgabe1.calculateScore("no"));
        System.out.println(Aufgabe1.wordScore("declarative"));
        System.out.println(Aufgabe1.wordScore("yes"));

        // Aufgabe 2
        System.out.println("\n=== Aufgabe 2 ===");

        List<String> friends = List.of(
                "Fritz", "Franz", "Hugo", "Erwin",
                "Markus", "Martin", "Heiri"
        );

        System.out.println("Personen: " + friends.size());
        System.out.println("Trinkgeld: "
                + TipCalculator.getTipPercentage(friends) + "%");

        System.out.println("Trinkgeld bei 100 CHF: "
                + TipCalculator.calculateTip(friends, 100) + " CHF");

        // Aufgabe 3A
        System.out.println("\n=== ShoppingCart A ===");

        ShoppingCartA cartA = new ShoppingCartA();
        cartA.addItem("Buch");
        cartA.addItem("Buch");
        cartA.addItem("Stift");

        cartA.removeItem("Buch");

        System.out.println(cartA.getItems());
        System.out.println("Rabatt: " + cartA.getDiscount() + "%");

        // Aufgabe 3B
        System.out.println("\n=== ShoppingCart B ===");

        ShoppingCartB cartB = new ShoppingCartB();
        cartB.addItem("Buch");
        cartB.addItem("Stift");

        System.out.println(cartB.getItems());
        System.out.println("Rabatt: " + cartB.getDiscount() + "%");

        cartB.removeItem("Buch");

        System.out.println("Rabatt nach Entfernen: "
                + cartB.getDiscount() + "%");

        // Aufgabe 3C
        System.out.println("\n=== ShoppingCart C ===");

        ShoppingCartC cartC1 = new ShoppingCartC();
        ShoppingCartC cartC2 = cartC1.addItem("Buch");
        ShoppingCartC cartC3 = cartC2.addItem("Stift");

        System.out.println("Original: " + cartC1.getItems());
        System.out.println("Warenkorb 2: " + cartC2.getItems());
        System.out.println("Warenkorb 3: " + cartC3.getItems());
        System.out.println("Rabatt: " + cartC3.getDiscount() + "%");
    }
}
