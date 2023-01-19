public class Shark extends Fish
{
    //variables
    private boolean canBite;
    private boolean isDangerous;

    //constructor
    public Shark(String name)
    {
        //boolean results
        super();
        this.name = name;
        colour = "grey";
        canBite = true;
        isDangerous = true;
        className = "Shark";
    }

    //boolean methods
    public boolean Bite(){
        return canBite;
    }
    
    public boolean Dangerous(){
        return isDangerous;
    }
    
    //toString printstates
    @Override
    public String toString(){
        String strng ="";
        strng+= "Shark; ";
        strng+= "\n";
        strng+= "name: ";
        strng+= name;
        strng+= "\n";
        strng+= "colour: ";
        strng+= colour;
        strng+= "\n";
        strng+= "Do you have Gills: ";
        strng+= Gills();
        strng+= "\n";
        strng+= "Do you have Fins: ";
        strng+= Fins();
        strng+= "\n";
        strng+= "Can you Swim: ";
        strng+= Swim();
        strng+= "\n";
        strng+= "Are you Dangerous: ";
        strng+= Dangerous();
        strng+= "\n";
        strng+= "Do you Bite: ";
        strng+= Bite();
        strng+= "\n\n";
        
        return strng;
    }
    
    //Override
    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        
        if (!(o instanceof Shark)) {
        
        //creating an object to compare
        Shark shark = (Shark)o;
        
        //return if statements to compare
        if(isDangerous != shark.isDangerous) return false;
        if(!super.equals(o)) return false;

        return true;
    }
    return false;
    }
}
