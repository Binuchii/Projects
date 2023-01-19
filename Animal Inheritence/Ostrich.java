public class Ostrich extends Bird
{
    //variables
    private boolean isTall;
    private boolean flies;
    private boolean thinLongLegs;

    //constructor
    public Ostrich(String name)
    {
        //boolean results
        super();
        this.name = name;
        colour = "brown";
        isTall = true;
        flies = false;
        thinLongLegs = true;
        className = "Ostrich";
    }
    
    //booleans methods
    @Override
    public boolean flies(){
        return flies;
    }

    public boolean Tall(){
        return isTall;
    }
    
    public boolean ThinLongLegs(){
        return thinLongLegs;
    }
    
    //toString method
    @Override
    public String toString(){
        String strng ="";
        strng+= "Osterich; ";
        strng+= "\n";
        strng+= "name: ";
        strng+= name;
        strng+= "\n";
        strng+= "colour: ";
        strng+= colour;
        strng+= "\n";
        strng+= "Do you have skin: ";
        strng+= hasSkin();
        strng+= "\n";
        strng+= "Do you have Wings: ";
        strng+= hasWings();
        strng+= "\n";
        strng+= "Do you have feathers: ";
        strng+= hasFeathers();
        strng+= "\n";
        strng+= "Are you tall: ";
        strng+= Tall();
        strng+= "\n";
        strng+= "Do you have thin long legs: ";
        strng+= ThinLongLegs();
        strng+= "\n";
        strng+= "Flies: ";
        strng+= flies();
        strng+= "\n\n";
        
        return strng;
    }
    
    // to compare the classes with other classes
    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        
        if (!(o instanceof Ostrich)) {
        
        //creating object to compare
        Ostrich ostrich = (Ostrich)o;
        
        //return if statements to compare
        if(isTall != ostrich.isTall) return false;
        if(thinLongLegs != ostrich.thinLongLegs) return false;
        if(!super.equals(o)) return false;

        return true;
    }
    return false;
    }
}
