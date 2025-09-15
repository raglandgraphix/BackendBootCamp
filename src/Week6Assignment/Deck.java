package Week6Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // Fields
    private List<Card> cards;

    // Constructor
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] rankNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        int[] rankValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit : suits) {
            for (int i = 0; i < rankNames.length; i++) {
            	//this creates a new card for each of the 52 possible cards
                Card card = new Card();
                card.setValue(rankValues[i]);
                card.setName(rankNames[i] + " of " + suit);
                cards.add(card);
            }
        }
    }
    
    // Methods
// This method shuffles the cards. I didn't create my own shuffler
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null; // Return null if the deck is empty
        }
        //This removes the top card from the cards list and returns its value.
        return cards.remove(0);
    }
}