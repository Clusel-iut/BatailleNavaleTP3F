// TODO add javadoc comment(done)
/**
 * @author cluselm
 * This class represents all types of boats with their specifications
 */
public enum BoatsType
{

	/**
	 * represent a croiseur with the name, the number in the rack, the length, 
	 * the width and the maximum length of the rack for not overtake the rack
	 */
	CROISEUR("Croiseur", 8, 4, 1, 7),
	/**
	 * represent a marin with the name, the number in the rack, the length, 
	 * the width and the maximum length of the rack for not overtake the rack
	 */
	MARIN("Sous-marin", 51, 3, 1, 8),	
	/**
	 * represent a porteavion with the name, the number in the rack, the length, 
	 * the width and the maximum length of the rack for not overtake the rack
	 */
	PORTEAVION("Porte-avion", 84, 5, 1, 6),
	/**
	 * represent a torpilleur with the name, the number in the rack, the length, 
	 * the width and the maximum length of the rack for not overtake the rack
	 */
	TORPILLEUR("Torpilleur", 26, 2, 1, 9), 	
		
	
	
	
	
	// TODO add javadoc comment(done)
	// TODO rename field (coding conventions)(done)
	/**
	 * represents the name of the boat
	 */
	private String identification;

	// TODO add javadoc comment (done)
	// TODO rename field (coding conventions) (done)
	/**
	 * represents the number in the case where the boat is present 
	 * the number is different of 0 and single
	 */
	private int numberIdentification;

	
	// TODO add javadoc comment (done)
	// TODO rename field (coding conventions)(done)
	// TODO field can not be static (done)
	/**
	 * represents the length of the boat.
	 * represents the number of cases needs for the length of the boat 
	 */
	private final int length;

	// TODO add javadoc comment(done)
	// TODO rename field (coding conventions)(done)
	// TODO field can not be static(done)
	/**
	 * represents the width of the boat.
	 * represents the number of cases needs for the width of the boat 
	 */
	private final int width;
	
	// TODO add javadoc comment (done)
	// TODO rename field (coding conventions) (done)
	// TODO field can not be static (done)
	/**
	 * Represents the maximum number of the beginning of the boat for not exceed of the rack
	 */
	private final int length_rack;
	
	
	
	/**
	 * @param identification
	 * @param numberIdentification
	 * @param length
	 * @param width
	 * @param length_rack
	 */
	private BoatsType(String identification, int numberIdentification, int length, int width, int length_rack)
	{
		this.identification=identification;
		this.numberIdentification=numberIdentification;
		this.length=length;
		this.width=width;
		this.length_rack=length_rack;
	}



	/**
	 * @return the length of the boat
	 */
	public int getLength()
	{
		return this.length;
	}


	/**
	 * @return the name of the boat
	 */
	public String getIdentification()
	{
		return this.identification;
	}


	/**
	 * @return the number present in the case 
	 */
	public int getNumberIdentification()
	{
		return this.numberIdentification;
	}


	/**
	 * @return the width of the boat  
	 */
	public int getWidth()
	{
		return this.width;
	}


	/**
	 * @return the maximum number of the beginning of the boat for not exceed of the rack
	 */
	public int getLenght_rack()
	{
		return this.length_rack;
	}
	
}
