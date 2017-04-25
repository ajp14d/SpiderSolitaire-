//Abigail Perry, Andrew Frisch 

import java.io.*; 
import java.util.*; 
import java.awt.*; 


	public class Cards{
		
		final static int ace = 0; 
		final static int king = 12; 
		final static int spade = 0; 
		final static int black = 1; 
		
		private static String names[] =  {"A", "2", "3", "4", "5", "6",
				   "7", "8", "9", "10", "J", "Q", "K"};
		private boolean faceUp; 
		private int rank; 
		private int suit; 
		
		Cards(int r)
		{
			rank = r; 
			faceUp = false; 
		}
		public int rank()
		{
			return rank; 
		}
		public int suit()
		{
			return suit; 
		}
		public boolean faceup()
		{
			retrun faceUp;
		}
		public void flip()
		{
			faceUp != faceUp; 
		}
		//if the card is 0 then it is the ace
		public boolean isAce()
		{
			return rank == ace; 
		}
		public boolean isKing()
		{
			return rank == king; 
		}
		public int color()
		{
			if(suit() == spade)
				return black; 
		}
		
		
		
		
