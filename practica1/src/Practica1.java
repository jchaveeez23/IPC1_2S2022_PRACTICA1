import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Practica1 {
    /*Funciones para ejecutar Gauss-jordan*/
    static void muestradematriz(float matriz[][], int variable){
        for (int x = 0; x < variable; x++){
            for(int  y = 0; y < (variable+1); y++){
                System.out.print("" + matriz[x][y] + "|");
            }
            System.out.println("");
        }
    }
    
    static void pivote(float matriz[][], int piv, int variable){
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (variable+1); y++){
            matriz[piv][y] = matriz[piv][y]/temp;
        }
    }
    
    static void convertir_ceros(float matriz[][], int piv, int variable){
        for(int x = 0; x < variable; x++){
            if(x != piv){
                float c = matriz[x][piv];
                for(int z = 0; z < (variable+1); z++){
                    matriz[x][z] = ((-1*c)*matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner  leer = new Scanner(System.in);
        BufferedReader bf;
        bf = new BufferedReader (new InputStreamReader(System.in));
        Scanner valor = new Scanner(System.in);
        String enter;
        String cadena;
        double sum_prom = 0.0;
        double sum_vari= 0.0;
        double sum_desvi = 0.0;
        double media = 0.0;
        double sumatoria = 0.0;
        double varianza = 0.0;
        double desviacion = 0.0;
        int num_operacion = 0, c;
        boolean condicion = true;
        double x;
        double grados;
        double contador, contador_secu;
        double sen = 0.0, cos = 0.0, tan = 0.0;
        double parte_arriba, parte_abajo;
        double i = 0.0;
        double signo_serie;
        do{//abre do principal
        System.out.println("MENU");
        System.out.println("1. Aritmética");
        System.out.println("2. Trigonometría");
        System.out.println("3. Estadistica");
        System.out.println("4. Cálculo");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.print("Por Favor Ingrese el numero de la operación a realizar: ");
        int numero_menu = leer.nextInt();
        switch(numero_menu){//abre switch principal
            case 1://Case aritmetica
                double num1 = 0;
                double num2 = 0;
                double resultado = 0;
                
                do{//abre el do aritmetica 
                    System.out.println("");
                    System.out.println("ARITMETICA");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicación");
                    System.out.println("4. División");
                    System.out.println("5. Regresar");
                    System.out.print("Seleccione el número de la operacion a efectuar: ");
                    num_operacion = leer.nextInt();
                    
                    
                    switch(num_operacion){//abre switch aritmetica
                        case 1:
                            num_operacion = 1;
                            System.out.print("Ingrese un Número: ");
                            num1 = leer.nextInt();
                            System.out.print("Ingrese un segundo Número: ");
                            num2 = leer.nextInt();
                            resultado = num1 + num2;
                            System.out.println("El Resultado de la Suma es: "+ resultado);
                            System.out.print("Presione Enter para continuar... ");
                            /*Código para que la tecla enter continue con el programa*/
                            enter = bf.readLine();
                            /*Termina el codigo para que la tecla enter continue con el programa*/
                            break;
                        case 2:
                            num_operacion = 2;
                            System.out.print("Ingrese un Número: ");
                            num1 = leer.nextInt();
                            System.out.print("Ingrese un segundo Número: ");
                            num2 = leer.nextInt();
                            resultado = num1 - num2;
                            System.out.println("El Resultado de la Resta es: "+ resultado);
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            break;
                        case 3:
                            num_operacion = 3;
                            System.out.print("Ingrese un Factor: ");
                            num1 = leer.nextInt();
                            System.out.print("Ingrese un segundo Factor: ");
                            num2 = leer.nextInt();
                            resultado = num1 * num2;
                            System.out.println("El Producto es: "+ resultado);
                           System.out.print("Presione Enter para continuar... ");
                           enter = bf.readLine();
                            break;
                        case 4:
                            num_operacion = 4;
                            System.out.print("Ingrese el dividendo: ");
                            num1 = leer.nextInt();
                            System.out.print("Ingrese el divisor: ");
                            num2 = leer.nextInt();
                            
                            if(num2 != 0){//abre if divisor
                                resultado = num1 / num2;
                            System.out.println("El Cociente es: "+ resultado);
                            }//Cierra if divisor
                            
                            else{
                                System.out.println("El Divisor no puede ser 0");
                            }
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            break;
                        default:
                            if (num_operacion >= 6){
                            System.out.println("El número Ingresado esta fuera de rango");
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            }
                    }//cierra switch aritmetica
                            
                }while(num_operacion != 5); /*cierra dowhile aritmetica*/
                    System.out.println("Regresando a Menú Principal");
                    System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            break;            
                
             case 2://case trigonometria
                 
                 /*Para las funciones trigonometricas se utilizaron
                 distintas clases con funciones recursivas*/
                 
                 do{//abre do trigonometria
                    System.out.println("");
                    System.out.println("TRIGONOMETRIA");
                    System.out.println("1. Seno");
                    System.out.println("2. Coseno");
                    System.out.println("3. Tangente");
                    System.out.println("4. Regresar");
                    System.out.print("Seleccione el número de la operacion a efectuar: ");
                    num_operacion = leer.nextInt();
                    
                    switch(num_operacion){//abre switch trigonometria
                        case 1:
                            num_operacion = 1;  
                            System.out.print("Digite el valor de x: ");
                            x = valor.nextDouble();
                            grados = (x*3.1416)/180;
                            System.out.print("Digite el valor de i: ");
                            i = valor.nextDouble();
                            /*Empieza la serie de mclaurin*/
                            for(contador = 0; contador <= i; contador ++){
                                parte_arriba = 1;
                                for(contador_secu = 0; contador_secu <= 2*contador+1; contador_secu++){
                                    parte_arriba = parte_arriba*x;
                                }
                                
                                parte_abajo = 1;
                                for(contador_secu = 1; contador_secu <= 2*contador+1; contador_secu++){
                                    parte_abajo = parte_abajo * contador_secu;
                                }
                                /*Aqui se sabra si el signo es positivo o negativo en la serie*/
                                if (contador % 2 ==0){
                                    signo_serie = 1;
                                }
                                else{
                                    signo_serie = -1;
                                }
                                /*Resultado del seno*/
                                sen = sen + ((signo_serie * parte_arriba)/(parte_abajo));
                            }
                            System.out.print("Seno(" + x + ") es: " + sen);
                            System.out.println("");
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            break;
                            
                        case 2:
                            num_operacion = 2; ;
                            System.out.print("Digite el valor de x: ");
                            x = valor.nextDouble();
                            grados = (x * 3.1416)/180;
                            i = valor.nextDouble();
                            System.out.print("Digite el valor de i: ");
                            /*Empieza la serie de mclaurin*/
                            /*Contador secu se utiliza para el exponente*/
                            for(contador = 0; contador <= i; contador ++){
                                parte_arriba = 1;
                                for(contador_secu = 0; contador_secu <= 2*contador; contador_secu++){
                                    parte_arriba = parte_arriba*x;
                                }
                                
                                parte_abajo = 1;
                                /*for utilizado para el factorial*/
                                for(contador_secu = 1; contador_secu <= 2*contador; contador_secu++){
                                    parte_abajo = parte_abajo * contador_secu;
                                }
                                /*Aqui se sabra si el signo es positivo o negativo en la serie*/
                                if (contador % 2 ==0){
                                    signo_serie = 1;
                                }
                                else{
                                    signo_serie = -1;
                                }
                                /*Resultado del seno*/
                                cos = cos + ((signo_serie * parte_arriba)/parte_abajo);
                            }
                            System.out.print("Coseno(" + x + ") es: " + cos);
                            System.out.println("");
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            break;
                            
                        case 3:
                            num_operacion = 3;  
                            System.out.print("Digite el valor de x: ");
                            x = valor.nextDouble();
                            grados = (x*3.1416)/180;
                            System.out.print("Digite el valor de i: ");
                            i = valor.nextDouble();
                            tan = sen/cos;
                            System.out.print("Tangente(" + x + ") es: " + tan);
                            System.out.println("");
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            break;
                            
                        default:
                            if (num_operacion >= 5){
                            System.out.println("El número Ingresado esta fuera de rango");
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            }
                    }//cierra switch trigonometria
                     
                 }while(num_operacion != 4);//cierra do trigonometria
                    System.out.println("Regresando a Menú Principal");
                    System.out.print("Presione Enter para continuar... ");
                    enter = bf.readLine();
                 break;
            
             case 3://Case estadistica
                 
                 do{//abre do estadistica
                    System.out.println("");
                    System.out.println("ESTADISTICA");
                    System.out.println("1. Media");
                    System.out.println("2. Varianza");
                    System.out.println("3. Desviacion Estandar");
                    System.out.println("4. Regresar");
                    System.out.print("Seleccione el número de la operacion a efectuar: ");
                    num_operacion = leer.nextInt();
                    
                    switch (num_operacion){//abre switch estadistica
                        
                        case 1: 
                            num_operacion = 1;
                            System.out.println("Ingrese una cadena con numero enteros separados por coma: ");
                            cadena = leer.next();
                            String [] cadena_prom = cadena.split(",");
                            double [] vector_prom = new double[cadena_prom.length]; //se utiliza double para valores decimales
                            
                            /*Se asignan los valores al vector de tipo entero*/
                            for(c = 0; c < cadena_prom.length; c++){ //abre bucle for cadena
                                vector_prom[c] = Double.parseDouble(cadena_prom[c]);
                            }// cierra bucle for cadena
                            
                            for(c = 0; c < cadena_prom.length; c++){
                                 sum_prom = sum_prom + vector_prom[c];
                                 media = sum_prom/vector_prom.length;
                            }
                            System.out.println("El Promedio de (" + cadena + ") es: " + media);
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            break;
                            
                        case 2:
                            num_operacion = 2;
                            System.out.println("Ingrese una cadena de numeros separados por coma: ");
                            cadena = leer.next();
                            String [] cadena_vari = cadena.split(",");
                            double [] vector_vari = new double[cadena_vari.length]; //se utiliza double para valores decimales
                            
                            /*Se asignan los valores al vector de tipo entero*/
                            for(c = 0; c < cadena_vari.length; c++){ //abre bucle for cadena
                                vector_vari[c] = Double.parseDouble(cadena_vari[c]);
                            }// cierra bucle for cadena
                            for(c = 0; c < cadena_vari.length; c++){
                                sum_vari = sum_vari + vector_vari[c];// suma los numeros ingresados
                                media = sum_vari/vector_vari.length; // calcula la media
                                
                            }
                            
                            for(c = 0; c < cadena_vari.length; c++){
                                 sumatoria = Math.pow(vector_vari[c] - media, 2);// calcula la sumatoria al cuadrado
                                 varianza = varianza + sumatoria;// calcula la carianza     
                            }
                            varianza = varianza/(vector_vari.length);// divide dentro de n datos
                            
                            System.out.println("La Varianza de (" + cadena + ") es: " + varianza);
                            System.out.print("Presione Enter para continuar... ");;
                            
                            enter = bf.readLine();
                            break;
    
                        case 3:
                            num_operacion = 3;
                            System.out.println("Ingrese una cadena de numeros separados por coma: ");
                            cadena = leer.next();
                            String [] cadena_desvi = cadena.split(",");
                            double [] vector_desvi = new double[cadena_desvi.length]; //se utiliza double para valores decimales
                            
                            /*Se asignan los valores al vector de tipo entero*/
                            for(c = 0; c < cadena_desvi.length; c++){ //abre bucle for cadena
                                vector_desvi[c] = Double.parseDouble(cadena_desvi[c]);
                            }// cierra bucle for cadena
                            for(c = 0; c < cadena_desvi.length; c++){
                                sum_desvi = sum_desvi + vector_desvi[c];// suma los numeros ingresados
                                media = sum_desvi/vector_desvi.length; // calcula la media
                                
                            }
                            
                            for(c = 0; c < cadena_desvi.length; c++){
                                 sumatoria = Math.pow(vector_desvi[c] - media, 2);// calcula la sumatoria al cuadrado
                                 varianza = varianza + sumatoria;// calcula la carianza     
                            }
                            varianza = varianza/(vector_desvi.length);// divide dentro de n datos
                            desviacion = Math.sqrt(varianza);
                            
                            System.out.println("La Desviacion Estandar de (" + cadena + ") es: " + desviacion);
                            System.out.print("Presione Enter para continuar... ");
                            
                            enter = bf.readLine();
                            break;
                        
                        default:
                            if (num_operacion >= 5){
                            System.out.println("El número Ingresado esta fuera de rango");
                            System.out.print("Presione Enter para continuar... ");
                            enter = bf.readLine();
                            }
                            
                    }//cierra switch estadistica
                  
                 }while(num_operacion != 4);//cierra do estadistica
                    System.out.println("Regresando a Menú Principal");
                    System.out.print("Presione Enter para continuar... ");
                    enter = bf.readLine();               
                 break;
                 
             case 4: // Case de Cálculo
                 
                 do{ //Abre Do Cálculo
                    System.out.println("");
                    System.out.println("CALCULO");
                    System.out.println("1. Reslover un sistema de ecuaciones lineales de N X N por medio de Gauss-Jordan");
                    System.out.println("2. Regresar a menu principal");
                    System.out.print("Seleccione el numero de la operacion a efectuar: ");
                    num_operacion = leer.nextInt();
                    
                    switch (num_operacion){ //abre switch de cálculo
                        case 1:
                            num_operacion = 1;
                            int variable = 0;
                            int piv = 0;
                            float matriz[][];
                            System.out.println("Indique el tamaño del sistema de ecuaciones: ");
                            variable = leer.nextInt();
                            
                            if (variable > 0){ //abre if del tamaño
                                matriz = new float [variable][variable + 1];
                                for (int k = 0; k < variable; k++){
                                    for(int r = 0; r < (variable + 1); r++){
                                            System.out.println("Ingrese el coeficiente de la posicion: A[" + (k+1) + "][" + (r+1) + "]");
                                            matriz[k][r] = leer.nextFloat();
                                    }
                                }
                                
                                for(int a = 0; a < variable; a++){
                                    pivote(matriz, piv, variable);
                                    
                                    System.out.println("\tRenglon " +  (a+1) + " entre el pivote");
                                    muestradematriz(matriz,variable);
                                    
                                    System.out.println("");
                                    
                                    System.out.println("\tConvirtiendo a Ceros");
                                    convertir_ceros(matriz,piv,variable);
                                    
                                    muestradematriz(matriz,variable);
                                    System.out.println("");
                                    piv++;
                                }
                                
                                for( int k = 0; k < variable; k++){
                                    System.out.println("La Variable X" + (k+1) + " es: " + matriz[k][variable]);
                                }
                                             
                            }// cierra if del tamaño
                            
                            else {
                                System.out.println("El tamaño de la matriz no puede ser 0 !!");
                            }
                            System.out.println("Presione enter para continuar...");
                            
                            enter = bf.readLine();   
                            break;


                    } //Cierra switch de cálculo
                     
                 }while(num_operacion != 2); //Cierra Do Cálculo
                    System.out.println("Regresando a Menú Principal");
                    System.out.print("Presione Enter para continuar... ");
                    enter = bf.readLine();      
                 
                 break;
                 
             case 5:
                condicion = false;
                 System.out.println("Saliendo...");
                 System.out.print("Presione Enter para continuar... ");
                 enter = bf.readLine();
                break;
            default: 
                 System.out.println("El número Ingresado esta fuera de rango");
                 System.out.print("Presione Enter para continuar... ");
                 enter = bf.readLine();
        }//cierra switch principal
    }while(condicion);//cierra do while prncipal
        }
}
