
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
		private int[][] grille; 
		
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
