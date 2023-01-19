import java.util.ArrayList;

public abstract class Buses {
    //calling the array list
    public ArrayList<Trip> trips = new ArrayList<>();

    // Bus Constructor unused
    public Buses() {
    }
    
    // Makes booking if bus has enough seats
    public Boolean makeBooking(Booking booking) {
        for(Trip tripList : trips){
            if(booking.getTrip() == tripList){
                if(tripList.getAvailableSeats() >= booking.getNumPassengers()){
                    tripList.availSeats -= booking.getNumPassengers();
                    return true;
                }
            }         
        }
        return false;
    }

    //making a string method to print out
    public String toString(int i) {
        String str = "";
        str += "Company: " + trips.get(i).companyName + "\n";
        str += "Trip ID: " + trips.get(i).tripId + "\n";
        str += "Origin: " + trips.get(i).startLoc + "\n";
        str += "Destination: " + trips.get(i).destination + "\n";
        str += "Departure Date: " + trips.get(i).departureDate + "\n";
        str += "Departure Time: " + trips.get(i).departureTime + "\n";
        str += "Arrival Data: " + trips.get(i).arrivalDate + "\n";
        str += "Arrival Time: " + trips.get(i).arrivalTime + "\n";
        str += "Fare: €" + trips.get(i).fare + " per passenger" + "\n";
        str += "Currently available seats: " + trips.get(i).availSeats + "\n";
        return str;
    }

    // Calls the toString method for all trips in arraylist
    public String getAllTrips() {
        String str = "";
        for (int i = 0; i < trips.size(); i++) {
            str += toString(i) + "\n\n";
        }
        return str;
    }

    // Returns the trip object that contains the tripID that is passed in
    public Trip getTrip(int tripId) {
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getTripID() == tripId) {
                return trips.get(i);
            }
        }
        return null;
    }
}