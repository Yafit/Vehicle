package HomeTese;

public class Vehicle {
	
	String licensePlateNumber;	//It is a string in case the plate has letters in it OR it starts with a zero
	String carType;
	int numOfCoaches;
	boolean isCar = true; //this variable determines whether it is a car or a train
	
	//Constructor initializing a car
	public Vehicle(String type, String licensePlateNumber) {
		this.carType = type;
		this.licensePlateNumber = licensePlateNumber; 
	}
	
	//constructor initializing a plate number
	public Vehicle (int numOfCoaches, String licensePlateNumber) {
		isCar=false;
		this.numOfCoaches = numOfCoaches; 
		this.licensePlateNumber = licensePlateNumber; 
	}s
}
