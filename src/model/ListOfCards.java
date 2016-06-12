package model;

import model.Card;

public class ListOfCards{

	int size = 1;
	private Card cat[] = new Card[size];
	
	private void add(Card c){
		size++;
		cat[size] = c;
	}
	private void shuffle(int a[]){
		int x = a.length;
		for (int i = 0; i < x; i++) {
		    int random = i + (int) (Math.random() * (x - i));
		    int randomElement = a[random];
		    a[random] = a[i];
		    a[i] = randomElement;
		}
	}
	
}//ListOfCards
