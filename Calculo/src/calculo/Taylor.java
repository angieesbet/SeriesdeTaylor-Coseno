package calculo;

// @author Escribano Betanzos Angélica

// PLANTEAMIENTO DEL PROBLEMA:
// Calcular el coseno de x grados con una serie de Taylor haciendo un ciclo que
// calcule los términos y los acumule

public class Taylor{
            
    public static void main(String[] args){
                
        //Ingresa el valor de los grados a calcular
        double num=60;
        //Recordemos que los ángulos se expresan en Radianes
        double angulo=Math.toRadians(num);
        double calcularPorSerie=serieTaylor(angulo);
        double calcularPorMath=Math.cos(angulo);
        System.err.println("Problema resuelto con series de Taylor: ");
        System.out.println(calcularPorSerie);
        System.err.println("Problema resolviendo el coseno por operación normal: ");
        System.out.println(calcularPorMath);
        
    }

    static double serieTaylor(double x){
        double sumando;
        double sumatoria=0;
        double precision=0.0001d;
        //Limite superior, iteración de la sumatoria
        int n=0; 
        do{
            sumando=Math.pow(-1, n)/factorial(2*n)*Math.pow(x,2*n);
            sumatoria=sumatoria+sumando;
            n=n+1;
        }
        while (Math.abs(sumando)>precision);
        return sumatoria;
    }

    static double factorial(int numero){
        double factorial=1.0d;
        while (numero != 0){
            factorial*=numero--;
        }
        return factorial;
    }    
}
