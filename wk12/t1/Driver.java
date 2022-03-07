public class Driver{
    public static void main(String[] args) {

        Person joe = new Person("Joe");
        for (int i=0;i<20;i+=1){
            joe.birthday();
        }
        joe.display();
    }

}
