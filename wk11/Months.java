public class Months{
    public static void main(String[] Args){
        int month=1;
        String[] months={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        int[] lengths={31,28,31,30,31,30,31,31,30,31,30,31};
        for (month=1;month<=12;month++){
            String length="31";
            if (month==9 || month==4 || month==6 || month==11){
                length="30";
            }
            else if(month==2){
                length="28 or 29 days";
            }
            System.out.println(months[month-1]+" has "+length+" days!");
        }
    }
}