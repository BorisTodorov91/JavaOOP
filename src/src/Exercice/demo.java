package Exercice;

import Exercice.P01workingWithAbstraction.CardRank.CardRank;
import Exercice.P01workingWithAbstraction.CardSuit.CardSuit;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());
        int result = cardRank.getPower() + cardSuit.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank,cardSuit,result);
    }
}
