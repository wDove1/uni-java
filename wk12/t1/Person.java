
/**
 * The Person class represents a person

**/

public class Person{
    private String name;
    private int age=0;


    /**
     * Creates a new person with the given name
     * @param pName The name of the person
    **/
    public Person(String pName){
        name=pName;
    }
    /**
     * Displays the details of the person
    **/
    public void display() {
        System.out.println("name: "+name+" age: "+age);
    }

    /**
     * increments the persons age by one year
     */
    public void birthday(){
        age+=1;
    }

    /**
     * a getter for the name
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * a getter for the age
     * @return the age
     */
    public int getAge(){
        return age;
    }


}
