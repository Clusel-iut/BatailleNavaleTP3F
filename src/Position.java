
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
	 * Create a position if abcissa and ordinate are between 0 and 9
	 * @param abscisse
	 * @param ordonnée
	 */
	// TODO finish writing javadoc comment
	public Position(int abscisse, int ordonnee) throws PasPossible
		{
			if ((abscisse<0) || (ordonnee<0) || (abscisse>9) || (ordonnee>9))
				throw new PasPossible();
			else
				{	
					this.abscissa=abscisse;
					this.ordinate=ordonnee;
				}
		}

	

}
