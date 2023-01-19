public class TravelIreland {
    public static void main(String[] args) {
        // This instantiation populates the default trip objects that are stored
        CityLink cl = new CityLink();
        BusEireann be = new BusEireann();
        GoBus gb = new GoBus();

        // Prints out details stored on all Bus Eireann trips
        System.out.println(cl.getAllTrips());
        System.out.println(be.getAllTrips());
        System.out.println(gb.getAllTrips());

        // Selects the trip
        Trip selectedTrip = cl.getTrip(251);

        // Sets up the booking object
        Booking booking = new Booking(selectedTrip, 10);
        boolean success = cl.makeBooking(booking);
        
        if(success){
           System.out.println(booking);
        } else{
            System.out.println("Error, Booking Failed... You either havent picked a Trip or seats are not available\n\n");
        }
        
        //re-prints to show the updated trip details
        System.out.println(cl.getAllTrips());
    }
}