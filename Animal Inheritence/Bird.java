public class Bird extends Animal
{
    //variables
    boolean hasFeathers;
    boolean hasWings;
    boolean flies;

    /**
     * Constructor for objects of class Bird
     */
    public Bird()
    {
        super(); //calls the constructor of its superclass  - Animal
        colour = "black"; //overrides the value of colour inherited from Animal
        hasFeathers = true; //all the subclasses of Bird inherit this property and value
        hasWings = true; //all the subclasses of Bird inherit this property and value
        flies = true; //all the subclasses of Bird inherit this property and value
    }

    /**
     * move method overrides the move method
     * inherited from superclass Animal
     */
    @Override
    public void move(int distance) {
        if(flies) {
            System.out.println("I fly " + distance + " metres");
            return;
        }
        //to print out if it doesnt fly
        System.out.println("I am a bird but i cannot fly. I walk " + distance + " meters");
    }
    
    /**
     * sing method that all birds have
     */
    public void sing(){
        System.out.println("tra la la");
    }
    
    /**
     * 'getter' method for the hasWings field
     */
    public boolean hasWings(){
        return hasWings;
    }
    
    /**
     * 'getter' method for the hasFeathers field
     */
    public boolean hasFeathers(){
        return hasFeathers;
    }
    
    public boolean flies(){
        return flies;
    }
    
    //boolean to compare the classes
    public boolean equals(Bird o) {

        if(hasFeathers != o.hasFeathers) return false;
        if(hasWings != o.hasWings) return false;
        if(flies != o.flies) return false;
        if(!super.equals(o)) return false;
        
        return true;
    }
}
