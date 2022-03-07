public class Utils{

    public static void sleep(double milis){
        double t1=System.currentTimeMillis();
        while (System.currentTimeMillis()<t1+milis){}
    }
}