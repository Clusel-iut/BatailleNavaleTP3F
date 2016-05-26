
// TODO detail comment (done)
/**
 * This class represents a rack with 2 dimensions (10x10),
 * where columns are called with letters(A-J) and lines with numbers(1-10).  
 * @author cluselm
 * 
 * 
 */


public class Rack
{
		/**
		 * represents the water on the rack
		 */
		public static final int DEFAULT_CASE = 0;
		/**
		 * represents a party of a boat touched
		 */
		public static final int CASE_TOUCHED = 1;
		/**
		 * represents a party of a boat
		 */
		public static final int CASE_OCCUPED = 2;
		/**
		 * represent the lenght of the rack
		 */
		public static final int DEFAULT_SIZE_LENGHT = 9;
		/**
		 * represent the width of the rack
		 */
		public static final int DEFAULT_SIZE_WIDTH = 9;
		/**
		 * represent all case where boats are placed
		 */
		public static int[][] grille;
		
	// TODO (done) detail comment (how are the boat placed?)
	/**
	 *  create a new rack with boats placed randomly. 
	 */
	public Rack()
	{
		
		grille = new int[DEFAULT_SIZE_LENGHT][DEFAULT_SIZE_WIDTH];
		for (int x = 0; x<9; x++)
		{
			for (int y = 0; y<9; y++)
			{
				grille[x][y]= DEFAULT_CASE;
				
			}
		}
		Position x = new Position(1,3);
		Boat croiseur = new Boat(x, BoatsType.CROISEUR,1);
		for (int m=1; m<2; m++)
		{
			for (int q=3; q < (BoatsType.CROISEUR).getWidth(); q++)
			{
				grille[m][q] = CASE_OCCUPED;
			}
		}
		Position y = new Position(2,3);
		Boat marin = new Boat(y, BoatsType.MARIN,1);
		for (int m=2; m<3; m++)
		{
			for (int q=3; q < (BoatsType.MARIN).getWidth(); q++)
			{
				grille[m][q] = CASE_OCCUPED;
			}
		}
		Position z = new Position(3,3);
		Boat porteavion = new Boat(z, BoatsType.PORTEAVION,1);
		for (int m=3; m  <4; m++)
		{
			for (int q=3; q < (BoatsType.PORTEAVION).getWidth(); q++)
			{
				grille[m][q] = CASE_OCCUPED;
			}
		}
		Position a = new Position(4,3);
		Boat torpilleur = new Boat(a, BoatsType.TORPILLEUR,1);
		for (int m=4; m  < 5; m++)
		{
			for (int q=3; q < (BoatsType.TORPILLEUR).getWidth(); q++)
			{
				grille[m][q] = CASE_OCCUPED;
			}
		}
		
	}

		/**
	 * Check if a boat is touched when shooting at a given position
	 * @param position 
	 * @return <tt>true</tt> if a boat has been touched, <tt>false</tt> if not 
	 */
	public static boolean isBoatTouchedAt(Position position)
	{
		
		  if(grille[position.getAbscissa()][position.getOrdinate()] == DEFAULT_CASE)

		      {
			  	System.out.println("No, there is nothing here Captain");
		        return false;
		       }

		  if(grille[position.getAbscissa()][position.getOrdinate()] == CASE_TOUCHED)

		      {
			  	System.out.println("You have already shoot here, choose an other case");
			  	return true;
			  
			  }
		    
		    if(grille[position.getAbscissa()][position.getOrdinate()] == CASE_OCCUPED)

			      {
		    			System.out.println("You have touched a boat, Captain, well played");
		    			return true;
			      }
		    return false;
		
	}
	
	public String toString()
	
	{
		StringBuffer sb = new StringBuffer();
		sb.append("-------------------------\n");
		
				
		for (int i=0; i<DEFAULT_SIZE_LENGHT; i++) 
		{
			for (int j=0; j<DEFAULT_SIZE_WIDTH; j++)
			{
				sb.append(grille[i][j]+" ");
					
			}
			sb.append("/n");
				
	   	}
		sb.append("-------------------------\n");
		return	 sb.toString();
	}	
	

}
