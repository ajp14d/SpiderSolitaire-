//Abigail Perry, Andrew Frisch 

import java.io.*; 
import java.util.*; 
import java.awt.*; 


	public class Cards{
		
		final static int ace = 0; 
		final static int king = 12; 
		
		private static String names[] =  {"A", "2", "3", "4", "5", "6",
				   "7", "8", "9", "10", "J", "Q", "K"};
		private boolean faceUp; 
		private int rank; 
		
		Cards(int r)
		{
			rank = r; 
			faceUp = false; 
		}
		
		
