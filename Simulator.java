
public class Simulator {
	int msec;
	int sec;
	int n;//num sides
	Control con;
	
	public Simulator(){}
	int getCurrentSec(){
		return sec;
	}
	int getCurrentMSec(){
		return msec;
	}
	Control getControl(int sec, int msec){
		con = new Control(0,0);
		return con;
	}
	int setNumSides(int sides){
		if (sides>=3 && sides<=10){return sides;}
		else {return n;}
	}
	void run(){
		double[] pose = {0,0,0};
		double speed = 0;
		double omega = 0;
		GroundVehicle veh = new GroundVehicle(pose,speed,omega);
		while (sec<100){
			veh.controlVehicle(getControl(sec,msec));
			veh.updateState(sec,msec);
			String time = sec+"."+msec;
			System.out.println(time+" "+veh.getPosition()[0]+" "+veh.getPosition()[1]+" "+veh.getPosition()[2]);
			if (msec==990){
				sec++;
				msec=0;
			}
			else{msec+=10;}
		}
	}
	public static void main(String[] args) {
		Simulator sim = new Simulator();
		sim.run();
	}

}
