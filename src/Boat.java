import java.util.Random;


/**
 * @author cluselm/reyqu
 * This class represents boats 
 */
public class Boat
{
	
	
	private Position position;
	private boolean touchedOrNo; 
	private boolean sankOrNo; 
	private BoatsType boats;
	
	// TODO (fix it) there can be only a constructor for Boat, not a construstor for
	// each kind of boat
		

	public Boat(Position positionBoat, BoatsType boat)
		{
			this.position=positionBoat;
			this.touchedOrNo=false;
			this.sankOrNo=false;
			this.boats=boat;
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


	
}
