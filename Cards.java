//Abigail Perry, Andrew Frisch 

import java.io.*; 
import java.util.*; 
import java.awt.*; 


	public class Cards{
		// dimensions of cards
		final static int width = 50;
    		final static int height = 70;
		
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
		
	    	// draw the card
	    	public void draw ( Graphics g, int x, int y)
	    	{
		    // draw border
		    g.clearRect( x, y, width, height );
		    g.setColor(Color.BLACK);
		    g.drawRect(x, y, width, height);

		    // draw body of card
		    if ( faceUp() )
		    {
			g.drawString(names[rank()], x+3, y+15);
			//draw lines of Spade card
		    	g.drawLine(x+25, y+20, x+40, y+50);
	    		g.drawLine(x+40, y+50, x+10, y+50);
	    		g.drawLine(x+10, y+50, x+25, y+20);
	    		g.drawLine(x+23, y+45, x+20, y+60);
	    		g.drawLine(x+20, y+60, x+30, y+60);
	    		g.drawLine(x+30, y+60, x+27, y+45);
			
		    }
			else // face down
			{
				g.setColor(Color.yellow);
				g.drawLine(x+15, y+5, x+15, y+65);
				g.drawLine(x+35, y+5, x+35, y+65);
				g.drawLine(x+5, y+20, x+45, y+20);
				g.drawLine(x+5, y+35, x+45, y+35);
				g.drawLine(x+5, y+50, x+45, y+50);		
			}
	    	}
		
		
		
		
		
		
		
