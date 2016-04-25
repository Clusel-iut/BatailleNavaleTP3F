
public class Boat
{
	private static final int DEFAULT_LENGHT_TORPILLEUR = 2;
	
	private static final int DEFAULT_LENGHT_SOUSMARINCONTRETORPILLEUR = 3; 
	
	private static final int DEFAULT_LENGHT_CROISEUR = 4;
	
	private static final int DEFAULT_LENGHT_PORTEAVION = 5;
	
	private static final int DEFAULT_WIDTH_BOATS = 1;
	

	
	
	
	/**
	 * @param DEFAULT_LENGHT_TORPILLEUR
	 * @param DEFAULT_WIDTH_BOATS
	 */
	public Boat (int DEFAULT_LENGHT_TORPILLEUR, int DEFAULT_WIDTH_BOATS)
	{
		for (int x=0; x<DEFAULT_LENGHT_TORPILLEUR; x++)
		{
			Random r = new Random();
			r.nextInt(5) + 1;
		}
		
	}
}
