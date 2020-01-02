package HomeTese;

public class Main {

	public static void main(String[] args) {
		
		//Initializing data
		Vehicle c1 = new Vehicle("private", "2138794");
		Vehicle c2 = new Vehicle("sports", "487101211");
		Vehicle c3 = new Vehicle("van", "093120312");
		
		Vehicle t1 = new Vehicle(5, "319074181");
		Vehicle t2 = new Vehicle(22, "92370942");
		
		//Create the array to include all the data
		Vehicle listOfVehicles[] = {c1, c2, c3, t1, t2};  	
		printData(listOfVehicles);
		
	}	//end of main
	
	
	//This function prints the vehicles
	public static void printData(Vehicle listOfVehicles[]) {
			
		for(int i=0; i<listOfVehicles.length; i++) {
			if(listOfVehicles[i].isCar) {	//print cars
				System.out.println("The car's license plate number is " + listOfVehicles[i].licensePlateNumber + " and its type is " + listOfVehicles[i].carType);
			} else if (!listOfVehicles[i].isCar) {	//print trains
				System.out.println("The train's license plate number is " + listOfVehicles[i].licensePlateNumber + " and the number of coaches is " + listOfVehicles[i].numOfCoaches);
			}
		}
	}

}
