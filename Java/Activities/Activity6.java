package activities;
	import java.util.ArrayList;
	import java.util.Date;

	public class Activity6 {
	    // Private variables
	    private int maxPassengers;
	    private ArrayList<String> passengers;
	    private Date lastTimeLanded;

	    // Constructor to initialize the values
	    public Activity6(int maxPassengers) {
	        this.maxPassengers = maxPassengers;
	        this.passengers = new ArrayList<>();
	    }

	    // Method to onboard a passenger
	    public void onboard(String passenger) {
	        if (passengers.size() < maxPassengers) {
	            passengers.add(passenger);
	        } else {
	            System.out.println("The plane is full, cannot add more passengers.");
	        }
	    }

	    // Method to simulate take-off and return current date and time
	    public Date takeOff() {
	        return new Date();
	    }

	    // Method to land the plane, set the last landing time, and clear passengers
	    public void land() {
	        this.lastTimeLanded = new Date();
	        passengers.clear();
	    }

	    // Method to get the last landing time
	    public Date getLastTimeLanded() {
	        return this.lastTimeLanded;
	    }

	    // Method to get the list of passengers
	    public ArrayList<String> getPassengers() {
	        return this.passengers;
	    }

	    // Main method to demonstrate the functionality of the Plane class
	    public static void main(String[] args) {
	        // Create a Plane object with a max capacity of 10 passengers
	        Activity6 plane = new Activity6(10);

	        // Onboard passengers
	        plane.onboard("Alice");
	        plane.onboard("Bob");
	        plane.onboard("Charlie");

	        // Print the list of passengers
	        System.out.println("Passengers on board: " + plane.getPassengers());

	        // Simulate take-off
	        System.out.println("Plane took off at: " + plane.takeOff());

	        // Land the plane
	        plane.land();
	        System.out.println("Plane landed at: " + plane.getLastTimeLanded());

	        // Print the list of passengers after landing
	        System.out.println("Passengers on board after landing: " + plane.getPassengers());
	    }
	}
