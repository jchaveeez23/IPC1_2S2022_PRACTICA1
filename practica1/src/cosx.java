/*
 * @author cokei
 */
public class cosx {
    public double cosenox(double valor){
        int contador = 1;
        double pot1 = 2;
        double pot2 = 4;
        double z;
        double sum_mas = 0.0;
        double sum_menos = 0.0;
        
        factorial fact = new factorial();
        do{
            sum_mas = sum_mas - (Math.pow(valor, pot1))/fact.calcula_factorial(pot1);
            pot1 += 4;
            sum_menos = sum_menos + (Math.pow(valor, pot2))/fact.calcula_factorial(pot2);
            pot2 += 4;
            contador ++;
        }while(contador < 4);
            z = 1 + sum_mas + sum_menos;
            return z;
    }
}
