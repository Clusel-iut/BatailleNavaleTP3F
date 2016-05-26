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
		
		this.racks[0].toString();
		this.racks[1].toString();
		System.out.println("la partie est prête à être jouée !");
		PlayerInput currentPlayer = this.players[0];
		Rack currentRack= this.racks[1];
		int numplayer=0;
		int numrack=1;
		 
		while (this.isGameOver(this.racks[0]) || this.isGameOver(this.racks[1]))
		{
		    Position position = currentPlayer.askShoot();

			if (Rack.isBoatTouchedAt(position) == false)
			{
				currentPlayer = this.players[(numplayer+1)%2]; 
				currentRack = this.racks[(numrack+1)%2];
			}
		}
		System.out.println("la partie est finie.");
	}

	
	/**
	 * if a boat are touched, we replace the identification of the boat on the rack at the position 
	 * we put a -1 on the rack
	 * evaluates if game is over (all boats of a player are destroyed).
	 * @return <tt>true</tt> if game is over, <tt>false</tt> else.
	 */
	private boolean isGameOver(Rack arack)
	{
		for (int x=0; x<10; x++)
			{
				for (int y=0; y<10; y++)
				{
					if ( this.arack[x][y]!= -1 )
						{
							return true;
						}
				}
			}
		return false;
	}
		

}
	

