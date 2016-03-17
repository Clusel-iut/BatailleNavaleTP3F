/**
 * Represents a battleship game,
 * 
 * @author cluselm
 * @author reyqu
 * 
 */

public class BattleshipGame
{
	private Rack player1Rack;
	private Rack player2Rack;
	private Player player1;
	private Player player2;

	/**
	 * Creates a new battleship game, ready to be played (2 racks with randomly
	 * placed boats and 2 players ready to play.)
	 */
	public BattleshipGame()
	{
		this.player1Rack = new Rack();
		this.player2Rack = new Rack();
		this.player1 = new Player();
		this.player2 = new Player();

	}

	// TODO detail the main algorithm (ask for advice)
	/**
	 * Plays the game.
	 * current player is player 1
	 * while <game not finished>
	 * 	<ask current player where to shoot>
	 *  <evaluate shot result>
	 *  if <touched>
	 *    <evaluate game result>
	 *  else current player changes
	 */
	public void play()
	                                                                                                                                                                                
	{
		System.out.println("la partie est prête à être jouée !");
		Player currentPlayer = this.player1;
		while (this.notFinished());
		{	
			askShoot(currentPlayer);
			evaluateShoot();
			if (this.evaluateShoot()) 
				{
				evaluateGame();
				}	
			else 
				{
				 currentPlayer = this.player2;
				}
		}
		System.out.println("la partie est finie.");
	}

	/**
	 * This method watches if all boats of one player are destroyed
	 * If it's true, this method stops the game
	 * Else, it does nothing 
	 * @return true or false
	 */
	private boolean evaluateGame()
	{
		return false;
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method asks to the currentPlayer where he wants to shoot
	 * @param currentPlayer
	 */
	private void askShoot(Player currentPlayer)
	{
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method watches where the shoot go. 
	 * If it touches a boat from the other player, the method returns true
	 * Else, returns false
	 * @return true or false
	 */
	private boolean evaluateShoot()
	{
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This method return true if all boats of one player are destroyed.
	 * Else, the method returns false
	 * @return true or false
	 */
	private boolean notFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
