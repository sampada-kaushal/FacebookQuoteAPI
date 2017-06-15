package com.fetch;

import java.util.Random;

public class Fetch {
	Random  random = new Random();
	
	public static String q;  
	
	public String fetchQuote(){
	
		final String  quotes[] = {
	            "Be yourself; everyone else is already taken.- Oscar Wilde",
	            "A room without books is like a body without a soul. - Marcus Tullius Cicero",
	            "Be the change that you wish to see in the world. - Mahatma Gandhi",
	            "If you tell the truth, you don't have to remember anything. - Mark Twain",
	            "If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.- J.K. Rowling",
	            "To live is the rarest thing in the world. Most people exist, that is all.- Oscar Wilde",
	            "Without music, life would be a mistake. - Friedrich Nietzsche",
	            "Always forgive your enemies, nothing annoys them so much. - Oscar Wilde",
	            "Life isn't about getting and having, it's about giving and being. -Kevin Kruse",
	            "Whatever the mind of man can conceive and believe, it can achieve. -Napoleon Hill",
	            "Strive not to be a success, but rather to be of value. -Albert Einstein", 
	            
	            "In the fight between you and the world, back the world.-Frank Zappa",
	            
	            "The only time to buy these is on a day with no 'y' in it. -Warren Buffett",
	            "Go after a man's weakness, and never, ever, threaten unless you're going to follow through, because if you don't, the next time you won't be taken seriously. -Roy M. Cohn", 
	            "When the eagles are silent, the parrots begin to jabber. -Sir Winston Churchill",
	            "Free advice is worth the price. -Robert Half",
	            "The brain is a wonderful organ. It starts working the moment you get up in the morning and does not stop until you get into the office. -Robert Frost"
	            
	            
	            };
		 q= quotes[random.nextInt(quotes.length)];
		System.out.println(q);
		return q;
	    
	} 

	//public String getQuote(){
		//System.out.println(Fetch().quotes[random.nextInt(Fetch().quotes.length)]);
		
	

	//} 
	
	
}

