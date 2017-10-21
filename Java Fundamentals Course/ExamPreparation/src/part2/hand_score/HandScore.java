package part2.hand_score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HandScore {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> cardStrength = new HashMap<>();
        cardStrength.put("2", 2);
        cardStrength.put("3", 3);
        cardStrength.put("4", 4);
        cardStrength.put("5", 5);
        cardStrength.put("6", 6);
        cardStrength.put("7", 7);
        cardStrength.put("8", 8);
        cardStrength.put("9", 9);
        cardStrength.put("10", 10);
        cardStrength.put("j", 12);
        cardStrength.put("q", 13);
        cardStrength.put("k", 14);
        cardStrength.put("a", 15);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] hand = reader.readLine().split("\\s+");

        int previousCardPower = getCardPower(hand[0].substring(0, hand[0].length() - 1), cardStrength);
        String previousCardSuit = hand[0].substring(hand[0].length() - 1, hand[0].length());

        int totalScore = 0;
        int suitCounter = 1;
        int currentScore = previousCardPower;
        int currentCardPower = 0;
        int lastCardPower = 0;

        for (int i = 1; i < hand.length; i++) {

            currentCardPower = getCardPower(hand[i].substring(0, hand[i].length() - 1), cardStrength);
            String currentCardSuit = hand[i].substring(hand[i].length() - 1, hand[i].length());

            if(currentCardSuit.equals(previousCardSuit)) {
                currentScore += currentCardPower;
                suitCounter ++;
                lastCardPower = 0;
            }
            else {
                if (suitCounter > 1) {
                    totalScore += (currentScore * suitCounter);
                }
                else {
                    totalScore += previousCardPower;
                }

                suitCounter = 1;
                currentScore = previousCardPower;
                lastCardPower = currentCardPower;
            }
            previousCardPower = currentCardPower;
            previousCardSuit = currentCardSuit;
        }

        if (suitCounter > 1) {
            totalScore += (currentScore * suitCounter);
        }

        totalScore += lastCardPower;

        System.out.println(totalScore);
    }

    private static int getCardPower(String card, Map<String, Integer> cardStrength) {


        return cardStrength.get(card.toLowerCase());
    }
}
