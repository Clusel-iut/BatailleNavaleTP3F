// TODO add javadoc comment
public enum BoatsType
{

	CROISEUR("Croiseur", 8, 4, 1, 7),
	MARIN("Sous-marin", 51, 3, 1, 8),	
	PORTEAVION("Porte-avion", 84, 5, 1, 6),
	TORPILLEUR("Torpilleur", 26, 2, 1, 9);		
		
	// TODO add javadoc comment
	// TODO rename field (coding conventions)
	private char Identification;

	// TODO add javadoc comment
	// TODO rename field (coding conventions)
	private int NumberInTheCase;

	// TODO add javadoc comment
	// TODO rename field (coding conventions)
	// TODO field can not be static
	private static final int LENGHT;

	// TODO add javadoc comment
	// TODO rename field (coding conventions)
	// TODO field can not be static
	private static final int WIDTH;
	
	// TODO add javadoc comment
	// TODO rename field (coding conventions)
	// TODO field can not be static
	private static final int LENGHT_RACK;
	
}
