public class Card{
    private String name;
    private int age;
    private double speed;
    private double ram;
    public Card(String pName,int pAge,double pSpeed,double pRam){
        name=pName;
        age=pAge;
        speed=pSpeed;
        ram=pRam;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSpeed(){
        return speed;
    }

    public double getRam(){
        return ram;
    }

    public void display(){
        System.out.println(name+" has: ");
        System.out.println("age: "+age);
        System.out.println("speed: "+speed);
        System.out.println("ram: "+ram);
    }
}