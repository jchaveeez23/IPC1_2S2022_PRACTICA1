
public class senox {
    public double senx(double valor){
        int contador = 1;
        double pot1 = 1;
        double pot2 = 3;
        double y;
        double suma_mas = 0.0;
        double suma_menos = 0.0;
        
        factorial fact = new factorial();
        do{
            suma_mas = suma_mas + (Math.pow(valor, pot1))/fact.calcula_factorial(pot1);
            pot1 += contador;
            suma_menos = suma_menos - (Math.pow(valor,pot2))/fact.calcula_factorial(pot2);
            pot2 += contador;
            contador ++;
        }while(contador < 4);
        y = suma_mas + suma_menos;
            return y;
    }
}
