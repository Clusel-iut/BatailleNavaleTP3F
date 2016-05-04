
public enum BoatsType
{

	CROISEUR("Croiseur", 8, 4, 1, 7),
	MARIN("Sous-marin", 51, 3, 1, 8),	
	PORTEAVION("Porte-avion", 84, 5, 1, 6),
	TORPILLEUR("Torpilleur", 26, 2, 1, 9);		
		
	
	private char Identification;
	private int NumberInTheCase;
	private static final int LENGHT;
	private static final int WIDTH;
	private static final int LENGHT_RACK;
	
}
