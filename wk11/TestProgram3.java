// Test Program 3: The Wind and the Rain

public class TestProgram3 {
    public static void main( String[] args ) {
    // Try this code with both booleans set to false,
    // then set to true/false and false/true
    // and finally both set to true
        boolean isRaining = true;
        boolean isWindy = false;
        if (isRaining && isWindy){
            System.out.println("It's both raining and windy - time to stay indoors?");
        }
        else if(isRaining){
            System.out.println("It's Raining");
        }
        else if(isWindy){
            System.out.println("It's Windy");
        }
        else{
            System.out.println("It's neither windy or rainy - time for a game of frisbee?");
        }
    }
}