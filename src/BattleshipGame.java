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
	 * player inputs table
	 */
	private PlayerInput[] players;
	
	/**
	 * rack inputs table
	 */
	private Rack[] racks;
	
	
	/**
	 * Creates a new battleship game, ready to be played (2 racks with randomly
	 * placed boats and 2 players ready to play.)
	 */
	public BattleshipGame()
	{
	
		this.racks = new Rack[2];
		this.racks[0]= new Rack();
		this.racks[1] = new Rack();
		this.players = new PlayerInput[2];
		this.players[0] = new PlayerInput();
		this.players[1] = new PlayerInput();
		
		
	}

	// @formatter:off
	/**
	 * ALGORITHM :
	 * 
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
		PlayerInput currentPlayer = this.players[0];
		Rack currentRack= this.racks[1];
		int numplayer=0;
		int numrack=1;
		 
		while (this.isGameOver())
		{
		    Position position = currentPlayer.askShoot();

			if (!this.isTouchedAt(position))
			{
				currentPlayer = this.players[(numplayer+1)%2]; 
				currentRack = this.racks[(numrack+1)%2];
			}
		}
		System.out.println("la partie est finie.");
	}

	
	/**
	 * evaluates if game is over (all boats of a player are destroyed).
	 * @return <tt>true</tt> if game is over, <tt>false</tt> else.
	 */
	private boolean isGameOver()
	{
		
		return false;
		// TODO Auto-generated method stub

	}

	
}
