
public class GroundVehicle {//meant to capture how the vehicles positions and orientation are changing
	double pose[];
	double s;
	double omega;
	double minX=0;
	double maxX=100;
	double minY=0;
	double maxY=100;
	double minT=-Math.PI;
	double maxT=Math.PI;
	
	GroundVehicle(double poses[], double speed, double omegaa){
		pose = poses; //gives the pose of the vehicle: [xe[0,100],ye[0,100],thetae[-pi,pi)]
		s=speed;
		omega=omegaa;
	}
	double [] getPosition(){return pose;} //returns the pose of the vehicle
	double [] getVelocity(){
		double [] vel = new double[3];
		vel[0] = s*Math.cos(pose[2]);
		vel[1] = s*Math.sin(pose[2]);
		vel[2] = omega;
		return vel;
	}
	void setPosition(double pos[]){
		if (pose[0]>maxX){pose[0]=maxX;}
		else if (pose[0]<minX){pose[0]=minX;}
		if (pose[1]>maxY){pose[1]=maxY;}
		else if (pose[1]<minY){pose[1]=minY;}
		if (pose[2]>maxT){pose[2]=maxT;}
		else if (pose[2]<minT){pose[2]=minT;}
	} 
	void setVelocity(double vel[]){
		
	}
	void controlVehicle(Control c){
		
	}
	void updateState(int sec, int msec){
		
	}
}
