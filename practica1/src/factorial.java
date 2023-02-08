
public class factorial {
    public int calcula_factorial(double n){
        int f = 1;
        for (int c = 1; c <= n; c++){
            f= f*c;
        }
        return f;
    }
}
