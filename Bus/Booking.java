public class Booking {
    //initialising variables
    Trip trip;
    int numPassengers;
    private static int prevId = 500;
    private int id;

    // Booking Constructor
    // Constructor also sets the available seats when making booking
    public Booking (Trip trip, int numPassengers) {
        // Checks if trip object is null
        if(trip != null){
        this.trip = trip;
        this.numPassengers = numPassengers;
        }
        else{
            System.out.println("Error, Trip not Selected");
            System.exit(0);
        }
        
        id = prevId +1;
        prevId = id;
    }
    
    // printing out the toString 
    @Override
    public String toString() {
    return  "-------Booking Successful-------\n" +
            "--------------------------------\n" +
            "|" + "Booking #" + id + "\n" +
            "--------------------------------\n" +
            "|" + "Trip: " + trip.getCompanyName() + "#" + trip.getTripID() + "\n" +
            "--------------------------------\n" +
            "|" + trip.getStartingLocation() + "\t-->\t" + trip.getDestination() + "\n" +
            "|" + trip.getDepartureTime() + "\t\t" + trip.getArrivalTime() + "\n" +
            "--------------------------------\n" +
            "|" + "Booked seats: " + getNumPassengers() + "\n" +
            "--------------------------------\n" +
            "|" + "Total Cost: €" + getTotalCost() + "\n" +
            "--------------------------------\n";

    }

    /* Getter Methods */
    public Trip getTrip() {
        return trip;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public double getTotalCost() {
        return getNumPassengers() * trip.getFare();
    }
}