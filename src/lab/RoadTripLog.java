package lab;

public class RoadTripLog {

	private String title;
	private double dist;
	private double fuel;
	
	public RoadTripLog(String title) {
		this.title = title; 
	}
	
	public RoadTripLog(int dist, int fuel) { 
		this.dist = dist;
		this.fuel = fuel;
	}

	
	public void addDistance(double d) {
		dist += d;
	}
	
	public void addFuel(double f) {
		fuel += f;
	}
	
	public double getTotalDistance() {
		return dist;
	}
	
	public double getTotalFuel() {
		return fuel;
	}
	
	public double getMPG() {
		return dist/fuel;
	}
	
	public String toString() {
		return 		"Trip: " + title
					+ "\nDistance: " + dist 
					+ "\nFuel Used: " + fuel
					+ "\nMPG: " + dist/fuel;
	}
	
}
