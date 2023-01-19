public class Animal
{
    //variables
    boolean hasSkin;
    boolean breathes;
    String colour;
    String className;
    String name;
    
    //constructor
    public Animal()
    {
        //boolean results
        breathes = true; //all the subclasses of Animal inherit this property and value
        hasSkin = true; // all the subclasses of Animal inherit this property and value
        colour = "grey"; //all the subclasses of Animal inherit this property and value
    }
    /**
     * move method
     * param int distance - the distance the Animal should move
     * All subclasses inherit this method
     */
    public void move(int distance){
        System.out.printf("I move %d metres \n", distance);
    }
        
    /**
     * getter method for colour field
     * All subclasses inherit this method
     */
    public String getColour(){
        return colour;
    }
    
     /**
     * 'getter' method for haSkin field
     * All subclasses inherit this method
     */
    public boolean hasSkin(){
        return hasSkin;
    }
    
    //get method to return the name of the object for test2
    public String getName(){
        return name;
    }
    
    //get method to return the class name to compare the other classes in test2
    public String getClassName(){
        return className;
    }
    
    //comparing the attributes 
    public boolean equals(Animal o) {

        if(hasSkin != o.hasSkin) return false;
        if(breathes != o.breathes) return false;
        if(!colour.equals(o.colour)) return false;

        return true;
    }
}
