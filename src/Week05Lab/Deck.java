package Week05Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	List<Card>shuffledCards = new ArrayList<Card>();
	List<Card> cards= new ArrayList<Card>();
	
	Deck(){
		String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
		String[] numbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		
		for(String suit:suits) {
			int count = 2;
			for(String number:numbers) {
				Card cards = new Card(number, suit, count);
				this.cards.add(cards);
				count++;
			}
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for(Card card : this.cards) {
			card.describe();
		}
	}
	//Fisher-Yates shuffle algorithm I am still shakey on understanding this
	public void shuffler() {
	    Random random = new Random();
	    for (int i = this.cards.size() - 1; i > 0; i--) {
	        int j = random.nextInt(i + 1);
	        Card temp = this.cards.get(i);
	        this.cards.set(i, this.cards.get(j));
	        this.cards.set(j, temp);
	    }
	}
	public Card deal() {
		return this.cards.get(0);
	}
	
	
	
}
