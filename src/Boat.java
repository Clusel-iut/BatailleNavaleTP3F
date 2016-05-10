import java.util.Random;


/**
 * @author cluselm/reyqu
 *
 */
public class Boat
{
	private static final int DEFAULT_LENGHT_TORPILLEUR = 2;
	private static final int DEFAULT_LENGHT_SOUSMARINCONTRETORPILLEUR = 3; 
	private static final int DEFAULT_LENGHT_CROISEUR = 4;
	private static final int DEFAULT_LENGHT_PORTEAVION = 5;
	private static final int DEFAULT_WIDTH_BOATS = 1;
	
	private static final int LONGUEUR_GRILLE_TORPILLEUR = 9;
	private static final int LONGUEUR_GRILLE_SOUSMARIN = 8;
	private static final int LONGUEUR_GRILLE_CROISEUR = 7;
	private static final int LONGUEUR_GRILLE_PORTEAVION = 6;
	
	private Position position;
	private boolean TouchedOrNo; 
	private boolean SankOrNo; 
	
	// TODO (fix it) there can be only a constructor for Boat, not a construstor for
	// each kind of boat
		
	/**
	 * Put randomly the porte-avion in the rack 
	 */
	public void BoatPorteAvion()
	{
			Random q = new Random();
			int i = q.nextInt(LONGUEUR_GRILLE_PORTEAVION);
			Random m = new Random();
			int l = m.nextInt(LARGEUR_GRILLE);			
			this.grille[i][l] = PORTEAVION;
			this.grille[i+1][l] = PORTEAVION;
			this.grille[i+1][l] = PORTEAVION;
			this.grille[i+1][l] = PORTEAVION;
			this.grille[i+1][l] = PORTEAVION;
		
		
	}
	
	/**
	 * Put randomly the croiseur in the rack 
	 */
	public void BoatCroiseur()
	{
		
			Random q = new Random();
			int i = q.nextInt(LONGUEUR_GRILLE_CROISEUR);
			Random m = new Random();
			int l = m.nextInt(LARGEUR_GRILLE);			
			this.grille[i][l] = CROISEUR;
			this.grille[i+1][l] = CROISEUR;
			this.grille[i+1][l] = CROISEUR;
			this.grille[i+1][l] = CROISEUR;
		
		
	}
	
	/**
	 * Put randomly the sous-marin in the rack 
	 */
	public void BoatSousMarin()
	{
			Random q = new Random();
			int i = q.nextInt(LONGUEUR_GRILLE_SOUSMARIN);
			Random m = new Random();
			int l = m.nextInt(LARGEUR_GRILLE);			
			this.grille[i][l] = MARIN;
			this.grille[i+1][l] = MARIN;
			this.grille[i+1][l] = MARIN;
		
		
	}
	
	/**
	 * Put randomly the torpilleur in the rack 
	 * 
	 * @param DEFAULT_LENGHT_TORPILLEUR
	 * @param DEFAULT_WIDTH_BOATS
	 * @return 
	 */
	public void BoatTorpilleur()
	{
			Random q = new Random();
			int i = q.nextInt(LONGUEUR_GRILLE_TORPILLEUR);
			Random m = new Random();
			int l = m.nextInt(LARGEUR_GRILLE);			
			this.grille[i][l] = TORPILLEUR;
			this.grille[i+1][l] = TORPILLEUR;
		
	}
	
	
}
