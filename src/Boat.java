import java.util.Random;


/**
 * @author cluselm/reyqu
 * This class represents boats 
 */
public class Boat
{
	
	
	public Position position;
	private boolean touchedOrNo; 
	private boolean sankOrNo; 
	private BoatsType boats;
	private int verticaleORhorizontale;
	
	
	// TODO (fix it) there can be only a constructor for Boat, not a construstor for
	// each kind of boat
		
	/**
	 * If verticalORhorizontal=1, the boat is placed horizontal 
	 * else verticalORhorizontal=0, the boat is placed vertical  
	 * @param positionBoat
	 * @param boat
	 * @param verticalORhorizontal
	 */
	public Boat(Position positionBoat, BoatsType boat, int verticalORhorizontal)
		{
			this.position=positionBoat;
			this.touchedOrNo=false;
			this.sankOrNo=false;
			this.boats=boat;
			this.verticaleORhorizontale=verticalORhorizontal;
		}
	

	public Position getPosition()
	{
		return position;
	}



	public boolean isSankOrNo()
	{
		return sankOrNo;
	}

	public BoatsType getBoats()
	{
		return boats;
	}


	public boolean isTouchedOrNo()
	{
		return touchedOrNo;
	}

	public void verticalOrHorizontale()
	{
		this.verticaleORhorizontale=(int) (Math.random()*2+1);
			
	}

	
}


	
}
