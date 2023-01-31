package NursiwatXavier;
import robocode.*;


public class JeyJey1600 extends JuniorRobot
{
	
	
	int east = 90;
	int highPower = 3;
	int midPower = 2;
	int lowPower = 1;

	
	public void run() {
		
		 setColors(red, black, black);
	
		while(true) {
		
			ahead(fieldHeight / 2);
			turnRight(east);
			
		}
	}

	
	public void onScannedRobot() {
		int scannedDist = scannedDistance;	
		int scannedAngle_ = scannedAngle;		
	
				
		
		if(scannedDist > fieldHeight / 4){
			ahead(1);
			back(1);	
			turnGunTo(scannedAngle_);
			fire(highPower);
		}
		else if(scannedDist < fieldHeight / 4){
			ahead(1);
			back(1);
			turnGunTo(scannedAngle_);
			fire(lowPower);
		}
		
	}

	public void onHitRobot(){
			
			ahead(1);
			back(1);	
			turnGunTo(hitRobotBearing);
			fire(midPower);

	}


	public void onHitByBullet() {
		
		if (hitByBulletAngle != -1) {
          	  	turnRight(hitByBulletAngle);
		  	turnRight(east);
            	  	ahead(fieldHeight / 2);
        	}
		
	}

	public void onHitWall() {
		if (hitWallAngle != -1) {
           		turnRight(hitWallAngle);
           		back(fieldHeight / 4);
           		turnRight(east);
        	}
	}	

}
