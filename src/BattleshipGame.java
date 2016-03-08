/**
 * Represent a battleship game,  
 * @author cluselm
 * @author reyqu

 */

// TODO (done) rename this class (ask for advice)
public class BattleshipGame

{

	/**
	 * Creates a new battleship game, ready to be played (2 racks with randomly placed boats.)
	 */
	public BattleshipGame()
	{
		// TODO write code
		this.player1Rack = new Rack();
		this.player2Rack = new Rack();
				
	}
	
	// TODO (done) update comment (what is the main algorithm?)
	/**
	 * Plays the game (jeu tour par tour)
	 * This method returns
	 * While boats of one player aren't destroyed, the game continue.
	 * Else the name of the player who haven't all boats destroyed, is print on the screen with the total game time.
	 */
	public void play()
	{
		System.out.println("la partie est prête à être jouer !");
		// TODO write code		
		System.out.println("la partie est fini.");
	}
	
	

}
