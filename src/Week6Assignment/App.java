package Week6Assignment;

public class App {
	public static void main(String[] args) {
		
		Deck deck = new Deck();
        Player player1 = new Player("Player 1"); 
        Player player2 = new Player("Player 2");
        deck.shuffle();
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
            	//this is putting the card in player 1 hand
                player1.draw(deck);
            } else {
            	//this is putting the card in player 2 hand
                player2.draw(deck);
            }
        }
        player1.describe();
        player2.describe();
        for(int i=0; i<26;i++) {
        	Card card1 = player1.flip();
        	Card card2 = player2.flip();
        	System.out.println("Player 1 : " +card1.getName() +" | Player 2 : " + card2.getName());
        	if(card1.getValue() > card2.getValue()) {
        		player1.incrementScore();
        		System.out.println("Player 1 gets the point");
        	}else if (card2.getValue()>card1.getValue()) {
        		player2.incrementScore();
        		System.out.println("Player 2 Gets the point");
        	}else {
        		System.out.println("Tie: no points awarded");
        	}
        	
        }
        System.out.println("<<<<<<<<<<<Final Score!!!!>>>>>>>>>>>>");
        System.out.println("Player 1: " + player1.getScore() + " Points  | Player 2 :" + player2.getScore()+" Points");
        if(player1.getScore()>player2.getScore()) {
        	System.out.println("Player 1 Wins");
        }else {
        	System.out.println("Player 2 Wins");
        }
        
        
        
        
	}

}
