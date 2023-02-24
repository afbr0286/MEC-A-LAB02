
package ejercicio3_1;

import java.util.Scanner;

public class Ejercicio3_1 {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        int l;
         System.out.println("Ingrese el tamaño del arreglo");
        l=leer.nextInt();
        double[] numeros = new double[l];
        
        
        for(int i = 0 ; i < l ; i++){
            numeros[i]=(int)(Math.random()*10); 
        }
        
        //metodo burbuja - Ordenar numero
        
        System.out.println("Numeros ordenados :");
        
        for(int i = 0 ; i < (l-1) ; i++){
            for(int j = 0 ; j < (l-1) ; j++){
                if(numeros[j]>numeros[j+1]){
                    double aux = numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                }
            }
        }
        
        for(int i = 0 ; i < l ; i++){
            System.out.println(numeros[i]);   
        }
        
        System.out.println("La media es :");
        double acum=0;
        
        for(int i = 0 ; i < l ; i++){
            acum=numeros[i]+acum;   
        }
        double media= acum/l;
        
        System.out.println(media);
        
        System.out.println("La mediana es :");
        
        if(l%2==0){
            System.out.println(((numeros[((l-1)/2)])+((numeros[(((l-1)/2)+1)])))/2);
        } else {
            System.out.println((numeros[((l-1)/2)]));
        }
        
        // Calcular moda
        double num = 0;
        int repmax = 0;
        for(int i = 0; i < l-1 ; i++){
            int repact = 0;
            if (numeros[i]==numeros[i+1]){
                repact+=1;
            }
            if (repact > repmax){
                repmax=repact;
                num = numeros[i];
            }
        }
        System.out.println("La moda es " + num);
        
        //VARIANZA
        
        double sumavari = 0;
        for(int i = 0 ; i < l ; i++){
            sumavari += ((numeros[i]-media)*(numeros[i]-media));
        }
        double varianza= sumavari/l;
        System.out.println("La varianza es " + varianza);
        
        //Desviacion estandar
        
        double desviacion=Math.pow(varianza,0.5);
        System.out.println("La desviacion estandar es " + desviacion);
    }  
}
