public class ProblemA {

    public static String starString(int n){
        if(n < 0){
            return "";
        }
        if(n < 1){
            return "*";
        }
        else{
            return starString(n - 1) + starString(n - 1);
        }
    }
}
