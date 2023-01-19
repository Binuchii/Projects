public class Trip {
    // Initalising variables
    String companyName;
    String startLoc;
    String destination;
    String departureDate;
    String departureTime;
    String arrivalDate;
    String arrivalTime;
    double fare;
    int tripId;
    int availSeats;

    // Trip Constructor
    public Trip (String companyName, String startLoc, String destination, String departureDate, String departureTime,  String arrivalDate,  String arrivalTime, int tripId, int availSeats, double fare) {
        this.companyName = companyName;
        this.startLoc = startLoc;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.tripId = tripId;
        this.availSeats = availSeats;
        this.fare = fare;
    }

    /* Getter Methods */
    public int getTripID() {
        return tripId;
    }
    
    public String getCompanyName(){
        return companyName;
    }

    public String getStartingLocation() {
        return startLoc;
    }

    public String getDestination() {
        return destination;
    }
    
    public String getDepartureDate(){
        return departureDate;
    }
    
    public String getDepartureTime(){
        return departureTime;
    }
    
    public String getArrivalDate(){
        return arrivalDate;
    }
    
    public String getArrivalTime(){
        return arrivalTime;
    }

    public double getFare() {
        return fare;
    }

    public int getAvailableSeats() {
        return availSeats;
    }

    /* Setter Methods */
    public void setAvailableSeats(int availSeats) {
        this.availSeats = availSeats;
    }
}