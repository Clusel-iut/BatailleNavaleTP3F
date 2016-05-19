
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
		public static final int DEFAULT_CASE = 0;
		public static final int CASE_TOUCHED = 1;
		public static final int CASE_OCCUPED = 2;
		public static final int DEFAULT_SIZE_LENGHT = 9;
		public static final int DEFAULT_SIZE_WIDTH = 9;
		public int[][] grille;
		
	// TODO (done) detail comment (how are the boat placed?)
	/**
	 *  create a new rack with boats placed randomly. 
	 */
	public Rack()
	{
		
		this.grille = new int[DEFAULT_SIZE_LENGHT][DEFAULT_SIZE_WIDTH];
		for (int x = 0; x<9; x++)
		{
			for (int y = 0; y<9; y++)
			{
				this.grille[x][y]= DEFAULT_CASE;
				
			}
		}
		Boat croiseur = new Boat((1,3), BoatsType.CROISEUR,1);
		for (int m=1; m<2; m++)
		{
			for (int q=3; q < (BoatsType.CROISEUR).getWidth(); q++)
			{
				this.grille[m][q] = CASE_OCCUPED;
			}
		}
		Boat marin = new Boat((2,3), BoatsType.MARIN,1);
		for (int m=2; m<3; m++)
		{
			for (int q=3; q < (BoatsType.MARIN).getWidth(); q++)
			{
				this.grille[m][q] = CASE_OCCUPED;
			}
		}
		Boat porteavion = new Boat((3,3), BoatsType.PORTEAVION,1);
		for (int m=3; m  <4; m++)
		{
			for (int q=3; q < (BoatsType.PORTEAVION).getWidth(); q++)
			{
				this.grille[m][q] = CASE_OCCUPED;
			}
		}
		Boat torpilleur = new Boat((4,3), BoatsType.TORPILLEUR,1);
		for (int m=4; m  < 5; m++)
		{
			for (int q=3; q < (BoatsType.TORPILLEUR).getWidth(); q++)
			{
				this.grille[m][q] = CASE_OCCUPED;
			}
		}
		
	}

		/**
	 * Check if a boat is touched whan shooting at a given position
	 * @return <tt>true</tt> if a boat has been touched, <tt>false</tt> if not 
	 */
	private boolean isBoatTouchedAt(Position position)
	{
		
		  if(position == DEFAULT_CASE)

		      System.out.println("No, there is nothing here Captain");
		  
		  return false;

		  if(position== CASE_TOUCHED)

		      System.out.println("You have already shoot here, choose an other case");
		    
		    if(position == CASE_OCCUPED)

			      System.out.println("You have touched a boat, Captain, well played");
		    return true;

		
	}
	
}
