package Exercice.P01workingWithAbstraction.CardRank;

public class main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");


        for (CardRank value : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(), value.name());
        }
    }
}
