public class AnimalTest
{
    public static void main(String[] args)
    {
        //making an array test obj
        AnimalTest test = new AnimalTest();
        System.out.printf("\n---------Test 1---------\n");
        test.test1();
        
        System.out.printf("----------------------------------------------------------------------------\n");
        
        
        System.out.printf("\n---------Test 2---------\n");
        test.test2();
    }

    public void test1(){
        
        //making an array list
        Animal[] animal = new Animal[4];
        animal[0] = new Canary("Einstein");
        animal[1] = new Ostrich("Mozart");
        animal[2] = new Trout("Elvis");
        animal[3] = new Shark("Obama");
        
        //making a for loop to print out all the toStrings
        for(int i = 0; i < animal.length; i++){
            System.out.println(animal[i]);
        }
        
    }
    
    public void test2()
    {
         // Initalising array of animal objects
        Animal[] animals = new Animal[8];
        animals[0] = new Canary("Beethoven");
        animals[1] = new Ostrich("Darwin");
        animals[2] = new Shark("Gandhi");
        animals[3] = new Trout("Martin Luther");
        animals[4] = new Trout("Lincoln");
        animals[5] = new Canary("Mandela");
        animals[6] = new Ostrich("Shakespeare");
        animals[7] = new Shark("Van Gogh");

        for (int i = 0; i < animals.length; i++) 
        { // Runs through all the animal objects to compare them
            int y = i; // Sets y = i as there is no point comparing any previous objects as they have already been checked
            for (y = 0; y < animals.length; y++) 
            {
                //print statements
                System.out.printf("%s the %s in position %d in the array matched %s the %s in position %d in the array\n", animals[i].getName(), animals[i].getClassName(), i, animals[y].getName(), animals[y].getClassName(), y);
                System.out.println(animals[i].equals(animals[y]) ? "true" : "false");
            }
        }
    }
}

