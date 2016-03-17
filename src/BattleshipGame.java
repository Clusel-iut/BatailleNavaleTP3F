/**
 * Represents a battleship game,
 * 
 * @author cluselm
 * @author reyqu
 * 
 */

public class BattleshipGame
{
	/**
	 * Creates a new battleship game, ready to be played (2 racks with randomly
	 * placed boats.)
	 */
	public BattleshipGame()
	{
		this.player1Rack = new Rack();
		this.player2Rack = new Rack();

	}

	// TODO detail the main algorithm (ask for advice)
	/**
	 * Plays the game This method returns While boats of one
	 * player aren't destroyed, the game continue. Else the name of the player
	 * who haven't all boats destroyed, is print on the screen with the total
	 * game time.
	 */
	public void play()
	{
		System.out.println("la partie est prête à être jouée !");
		System.out.println("la partie est finie.");
	}
}
