package Week6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//Fields
	//use private to encapsulate...
	private List<Card> hand;
	private int score;
	private String name;
	
	public int getScore() {
        return score;
    }

    public void setScore(int value) {
        this.score = score;
    }
	
	//I wouldn't have to use a constructor because my variable use defaults, but since i need to pass the name through a parameter i need a constructor.
	
	public Player(String name) {
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
	}
	
	//1 describe (prints out information about the player and calls the describe method for each card in the Hand List)
	
	public void describe() {
		//this refers to the field in this class
		System.out.println("Player: " + this.name );
        System.out.println("Hand:");
        //fall back should the hand be empty
        if (this.hand.isEmpty()) {
            System.out.println("  - Hand is empty.");
        } else {
        	//looping through the hand and then using the describe method that is in the Card class.
            for (Card card : hand) {
                card.describe();
            }
        }
        System.out.println("-------------------------------------");
		
	}

    //2.     flip (removes and returns the top card of the Hand)
	
	public Card flip() {
		//make sure there is a card in the deck
		if(this.hand.isEmpty()) {
			return null;
		}else {
			return this.hand.remove(0);
		}
		
		
	}

    //3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	
	// need to think about this
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
        if (drawnCard != null) {
            this.hand.add(drawnCard);
        }
	}

   //4.     incrementScore (adds 1 to the Player’s score field)
	
	public void incrementScore() {
		this.score++;
	}
	

}
