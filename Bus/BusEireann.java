public class BusEireann extends Buses {

    public BusEireann() {
        // Making different trip objects
        Trip journey1 = new Trip("Bus Eireann", "Galway", "Ballina", "22/11", "18.10", "22/11", "20.30", 521, 50,12.50);
        Trip journey2 = new Trip("Bus Eireann", "Galway", "Derry", "22/11", "18.00", "22/11", "22.30", 641, 50,13.60);
        Trip journey3 = new Trip("Bus Eireann", "Galway", "Limerick", "22/11", "17.00", "22/11", "18.20", 501, 50,11.50);

        // Adding trips to trips arraylist
        trips.add(journey1);
        trips.add(journey2);
        trips.add(journey3);
    }
}