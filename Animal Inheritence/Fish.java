public class Fish extends Animal
{
    //variables
    private boolean hasFins;
    private boolean canSwim;
    private boolean hasGills;
    
    //constructor
    public Fish()
    {
        //boolean results
        super();
        colour = "grey";
        hasFins = true;
        canSwim = true;
        hasGills = true;
    }
    
    //boolean methods
    public boolean Fins(){
        return hasFins;
    }
    
    public boolean Swim(){
        return canSwim;
    }
    
    public boolean Gills(){
        return hasGills;
    }
    
    //override
    @Override 
    public void move(int distance){
        System.out.printf("I swim %d metres \n", distance);
    }
    
    //boolean to compare the classes
    public boolean equals(Fish o) {
        if(hasFins != o.hasFins) return false;
        if(hasGills != o.hasGills) return false;
        if(!super.equals(o)) return false;

        return true;
    }

}
