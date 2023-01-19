public class Canary extends Bird
{
    //varibale
    private boolean sing;

    //contructor
    public Canary(String name)
    {
        //boolean results 
        super(); // call the constructor of the superclass Bird
        this.name = name;
        colour = "yellow"; // this overrides the value inherited from Bird
        sing = true;
        className = "Canary";
    }
    
    /**
     * Sing method overrides the sing method
     * inherited from superclass Bird
     */
    @Override // good programming practice to use @Override to denote overridden methods
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
    
    public boolean canSing(){
        return sing;
    }
    
    /**
     * toString method returns a String representation of the bird
     * What superclass has Canary inherited this method from? 
     */
    @Override
    public String toString(){
        String strng ="";
        strng+= "Canary; ";
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
        strng+= "Flies: ";
        strng+= flies();
        strng+= "\n";
        strng+= "Can you sing: ";
        strng+= canSing();
        strng+= "\n\n";
        
        return strng;
    }
    
    //Override
    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        
        if (!(o instanceof Canary)) {
        
        //canary object
        Canary canary = (Canary)o;
        
        //return if statements to compare
        if(!name.equals(canary.getName())) return false;
        if(!super.equals(o)) return false;

        return true;
    }
    return false;
    }
}
