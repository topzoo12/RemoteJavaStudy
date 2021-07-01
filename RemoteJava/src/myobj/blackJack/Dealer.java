package myobj.blackJack;

public class Dealer extends Player{
	
//	Dealer() {
//		tables = new Card[11];
//	}
	
	void add (Card card) {
		if (count == 0) {
			card.hidden = true;
		}
		
		if (card.rank == 0 ) {
			ace_count++;
		}
		
		
		
		tables[count++] = card;
	}
	
}













