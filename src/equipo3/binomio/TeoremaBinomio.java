//Este es el paquete en donde se encuentra la clase
package equipo3.binomio;

//Se importan las librerias necesarias
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;

public class TeoremaBinomio {
    
    //Método para calcular el teorema del binomio
    public void teoremaBinomio(String expresion, JLabel lb) {
        //Patrón para validar la expresión ingresada
        String pattern = "^\\((\\d*x)?(\\+\\d*y)?\\)\\^\\d+$|^\\((\\d*x)\\)\\^\\d+$|^\\((\\d*y)\\)\\^\\d+$";
        //Se compila el patrón
        Pattern p = Pattern.compile(pattern);
        //Se busca si la expresión ingresada coincide con el patrón
        Matcher m = p.matcher(expresion);
        String resultado = ""; //Se inicializa la variable resultado
        int i,n,a,b,coeficiente; //Se declaran las variables
        if (m.matches()) { //Si la expresión coincide con el patrón
            //Se obtiene el valor de n
            n = Integer.parseInt(expresion.substring(expresion.indexOf("^") + 1));
            if (expresion.contains("x")) { //Si la expresión contiene x
                //Se obtiene el valor de a y b
                a = Integer.parseInt(expresion.substring(expresion.indexOf("(") + 1,
                        expresion.indexOf("x")));
                b = 0;
                if (expresion.contains("y")) {
                    b = Integer.parseInt(expresion.substring(expresion.indexOf("+") + 1, 
                            expresion.indexOf("y")));
                }
                for (i=0;i<=n;i++) { //Se realiza un ciclo para calcular los coeficientes
                    coeficiente = combinatoria(n, i) * (int) Math.pow(a, n - i) * (int) Math.pow(b, i);
                    if (coeficiente != 0) { //Si el coeficiente es diferente de cero se concatena en la 
                        //variable resultado
                        resultado += coeficiente + "x^" + (n-i);
                        if (i != 0) {
                            resultado += "y^" + i;
                        }
                        if (i != n) {
                            resultado += " + ";
                        }
                    }
                }
                resultado += ""; //Se concatena un espacio vacío
            } else if (expresion.contains("y")) { //Si la expresión contiene y
                //Se obtiene el valor de b
                b = Integer.parseInt(expresion.substring(expresion.indexOf("(") + 1, 
                        expresion.indexOf("y")));
                for (i=0;i<=n;i++) { //Se realiza un ciclo para calcular los coeficientes
                    coeficiente = combinatoria(n, i) * (int) Math.pow(b, i);
                    if (coeficiente != 0) { //Si el coeficiente es diferente de cero se concatena 
                        //en la variable resultado
                        resultado += coeficiente + "y^" + i;
                        if (i != n) {
                            resultado += " + ";
                        }
                    }
                }
                resultado += "\n"; //Se concatena un salto de línea
            }
        } else { //Si la expresión no coincide con el patrón
            resultado = "La expresión no tiene el formato correcto.";
        }
        lb.setText(resultado); //Se establece el valor de resultado en el JLabel
    }

    
    private int combinatoria(int n, int j) {
        //Verifica si j es igual a 0 o j es igual a n
        if (j == 0 || j == n) {
            return 1; // Devuelve 1 si se cumple
        }
        //Optimización para calcular más rápidamente el coeficiente binomial
        if (j > n - j) {
            j = n - j;
        }
        int c = 1; //Inicialización de c
        //Bucle for que calcula el coeficiente binomial
        for (int i=0;i<j;i++) {
            c = c * (n - i) / (i + 1);
        }
        return c; //Devuelve el valor calculado de c
    }

}
