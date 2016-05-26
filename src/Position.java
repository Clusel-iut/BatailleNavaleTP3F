
/**
 * @author cluselm
 * represent a case, it's a position (couple of abscissa and ordinate) on a rack 
 */
// TODO add javadoc comment (done)
public class Position extends Exception
{
	
	// TODO add javadoc comment (done)
	// TODO rename field (done)
	// TODO (think about it) field can not be static (done)
	/**
	 * represent the abscissa of a case (between 0 and 9)
	 */
	private int abscissa;

	// TODO add javadoc comment (done)
	// TODO rename field (done)
	// TODO (think about it) field can not be static (done)
	/**
	 * represent the ordinate of a case (between 0 and 9)
	 */
	private int ordinate; 
	
	
	/**
	 * Create a position with parameters gave.
	 * @param abscisse
	 * @param ordonnee 
	 */
	// TODO finish writing javadoc comment
	public Position(int abscisse, int ordonnee) 
		{
			if ((abscisse<0) || (ordonnee<0)  || (abscisse>9) || (ordonnee>9))
				{	
					this.setAbscissa(abscisse);
					this.setOrdinate(ordonnee);
				}
		}
	
	/**
	 * Create a position randomly
	 * @param abscisse
	 * @param ordonnée
	 */
	public Position()
	{
		this.setAbscissa((int) (Math.random()*9+1));
		this.setOrdinate((int) (Math.random()*9+1));
	}

	/**
	 * @return the ordinate of the position
	 */
	public int getOrdinate()
	{
		return this.ordinate;
	}

	/**
	 * @param ordinate
	 */
	public void setOrdinate(int ordinate)
	{
		this.ordinate = ordinate;
	}

	/**
	 * @return the abscissa of the position
	 */
	public int getAbscissa()
	{
		return this.abscissa;
	}

	/**
	 * @param abscissa
	 */
	public void setAbscissa(int abscissa)
	{
		this.abscissa = abscissa;
	}
	

}
