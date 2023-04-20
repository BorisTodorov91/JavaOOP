package Exercice.P01workingWithAbstraction.CardSuit;

public class main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for (CardSuit value : CardSuit.values()) {
            // Enum представлява константни обекти тоест самите обекти ние ги саздаваме в класа и след това ги използваме
            // вътрешно енум се пазят в масив  и затова имаме  ordinal което ни е фактически индекса на който се намира енума в масива
            // какво и наме което ни е името на енума
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(), value.name());
        }
    }
}
