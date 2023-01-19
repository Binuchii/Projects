public class Trout extends Fish
{
    //variables
    private boolean hasSpikes;
    private boolean edible;
    private boolean swimUpRiverLayEggs;

    //constructor
    public Trout(String name)
    {
        //boolean results
        super();
        this.name = name;
        colour = "yellow";
        hasSpikes = true;
        edible = true;
        swimUpRiverLayEggs = true;
        className = "Trout";
    }

    //boolean methods
    public boolean Spikes(){
        return hasSpikes;
    }
    
    public boolean Edible(){
        return edible;
    }
    
    public boolean LaysEggs(){
        return swimUpRiverLayEggs;
    }
    
    //Tostring printstates
    @Override
    public String toString(){
        String strng ="";
        strng+= "Trout; ";
        strng+= "\n";
        strng+= "name: ";
        strng+= name;
        strng+= "\n";
        strng+= "colour: ";
        strng+= colour;
        strng+= "\n";
        strng+= "Gills: ";
        strng+= Gills();
        strng+= "\n";
        strng+= "Fins: ";
        strng+= Fins();
        strng+= "\n";
        strng+= "Swim: ";
        strng+= Swim();
        strng+= "\n";
        strng+= "Do they have spikes: ";
        strng+= Spikes();
        strng+= "\n";
        strng+= "Are they edible: ";
        strng+= Edible();
        strng+= "\n";
        strng+= "Do they swim up rivers to lay eggs: ";
        strng+= LaysEggs();
        strng+= "\n\n";
        
        return strng;
    }
    
    //Override
    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        
        if (!(o instanceof Trout)) {
        
        //creating an object to compare
        Trout trout = (Trout)o;
        
        //return if statements to compare
        if(hasSpikes != trout.hasSpikes) return false;
        if(edible != trout.edible) return false;
        if(!super.equals(o)) return false;

        return true;
    }
    return false;
    }
}
