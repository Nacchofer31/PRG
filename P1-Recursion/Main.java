
/**
 * Write a description of class Main here.
 * 
 * @author (Ignacio Ferrer) 
 */
public class Main{
    public static void main(String[] args){
    }
    
    /* n>=0
    */
    public static int factorial (int n){
        if(n==0) // Condición del caso base 
            return 1; // Instrucciones del caso base
        else /* n>0 */  //Condición del caso general
            return n * factorial(n-1); // Instrucciones del caso general
    }
    
    /* n>=0 y a!=0 
    */
    public static double potencia (double a, int n){
        if (n ==0 ) // Condición del caso base
            return 1; // Instrucciones del caso base
        else // Condición del caso general
            return a * potencia(a,n-1); // Instrucciones del caso general
    }
    
    /* a>=0 y b>0
    */
    public static int resto (int a, int b){
        if ( a < b ) // Condición del caso base
            return a; // Instrucciones del caso base
        else // Condición del caso general
            return resto(a-b,b); // Instrucciones del caso general
    }
    
    /* a>0 y b>0 
    */
    public static int mcd (int a, int b){
        if ( a == b ) // Condición del caso base
            return b; // Instrucciones del caso base
        else if ( a > b) // Condición del caso general
            return mcd(a-b,b); // Instrucciones del caso general
        else // Condición del caso general
            return mcd(a, b-a); // Instrucciones del caso general
    }
    
    /* a>0 y b>0
    */
    public static int euclides (int a, int b){
        if (a % b == 0) // Condición del caso base
            return b; // Instrucciones del caso base
        else // Condición del caso general
            return euclides (b, a % b); // Instrucciones del caso general
    }
    
    public static String invertir_digitos (int n){
        if (n < 10) 
            return String.valueOf(n);
        else  
            return String.valueOf(n % 10 + invertir_digitos(n/10));
    }
    
    /**********************************************************
     *************** EJERCICIOS PROPUESTOS ********************
     **********************************************************/
    
    /**
     * Ej 1
     */
    public static String lineaNum(int n) {
        if (n == 1) 
            return "1";
         else 
            return n +" "+ lineaNum(n - 1)+" "+ n;
    }
    
    /**
     * Ej 2
     */
    public static int[] creaProgGeometrica (int a1, int r, int n){
        int[] a = new int[n];
        creaProgGeometrica(a, a1, r, n-1);
        return a;
    }
    
    public static void creaProgGeometrica (int[] a, int a1, int r, int n){
        if ( n <= 0 ) a[0] = a1;
        else{
            a[n] = a1 * ((int) Math.pow(r,n));
            creaProgGeometrica(a,a1,r,n-1);
        }
    }
    
    /**
     * Ej 3
     */
    public static boolean esProgAritmetica (int[] a, int d){
        if ( a.length>=2 ) 
            return esProgAritmetica(a,d,0);
        else 
            return false;
    }
    
    public static boolean esProgAritmetica (int[] a, int d, int c){
        if ( c < a.length - 1 )
            if( a[c]+d == a[c+1]) return esProgAritmetica(a,d,c+1);
            else return false;
         else return true;
    }
    
}

   
