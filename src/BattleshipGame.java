/**
 * Represents a battleship game,
 * 
 * @author cluselm
 * @author reyqu
 * 
 */

public class BattleshipGame
{
	// TODO write comment
	private Rack player1Rack;

	// TODO write comment
	private Rack player2Rack;
    
	private Player[] players;
	
	
	/**
	 * Creates a new battleship game, ready to be played (2 racks with randomly
	 * placed boats and 2 players ready to play.)
	 */
	public BattleshipGame()
	{
	
		this.player1Rack = new Rack();
		this.player2Rack = new Rack();
		this.players = new Player[2];
		this.players[0] = new Player();
		this.players[1] = new Player();
		
		
	}

	// @formatter:off
	/**
	 * Plays the game. 
	 * 
	 * current player is player 1 
	 * while <game not finished> 
	 * 	<ask current player where to shoot> 
	 *  <evaluate shot result> 
	 *  if <not touched>  current player changes
	 *  <evaluate game result>
	 *   
	 */
	// @formatter:on
	public void play()

	{
		System.out.println("la partie est prête à être jouée !");
		Player currentPlayer = this.players[0];
		int num=0;
		
		while (this.notFinished())
			;
		{
			// TODO use this.
			askShoot(currentPlayer);

			// TODO use this.
			boolean result = this.evaluateShoot();

			// TODO think about it: why evaluateShoot is called twice? (done)
			if (result==false)
			{
				// TODO consider gathering players references into an array to 
				// easily switch current player 
				currentPlayer = this.players[(num+1)%2]; 
				num=num+1;
			}
			isGameOver();
		}
		System.out.println("la partie est finie.");
	}

	// TODO clean comment (ask for advice) (done) 
	/**
	 * evaluates if game is over (all boats of a player are destroyed).
	 * @return <tt>true</tt> if game is over, <tt>false</tt> else.
	 */
	private boolean isGameOver()
	{
		return false;
		// TODO Auto-generated method stub

	}

	/**
	 * This method asks to the currentPlayer where he wants to shoot
	 * 
	 * @param currentPlayer
	 */
	private void askShoot(Player currentPlayer)
	{
		// TODO Auto-generated method stub

	}

	/**
	 * This method watches where the shoot go. If it touches a boat from the
	 * other player, the method returns true Else, returns false
	 * 
	 * @return true or false
	 */
	private boolean evaluateShoot()
	{
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This method return true if all boats of one player are destroyed. Else,
	 * the method returns false
	 * 
	 * @return true or false
	 */
	private boolean notFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
