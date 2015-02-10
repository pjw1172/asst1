
public class Control {
	double s;
	double omega;
	public Control(double speed, double omegaa){
		s=speed;
		omega=omegaa;
	}
	public double getSpeed(){
		return s;
	}
	public double getRotVel(){
	return omega;
	}
}
