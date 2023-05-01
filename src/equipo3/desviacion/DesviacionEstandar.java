//Paquete en donde se encuentra la clase
package equipo3.desviacion;
//librerias importadas
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class DesviacionEstandar {
    //Método para calcular la desviación estándar y la media de una lista de números ingresada 
    //en un JTextField
    public void calcularDesviacionEstandar(
            JTextField txt_numeros, 
            JLabel lb_desviacion_resultado,
            JLabel lb_media_resultado) {
        try {
            //Obtener los números ingresados como String y separarlos con ","
            String[] lista_numeros = txt_numeros.getText().split(",");
            //Convertir los números a tipo double y guardarlos en un arreglo
            double[] numeros = new double[lista_numeros.length];
            for (int i=0;i<numeros.length;i++) {
                numeros[i] += Double.parseDouble(lista_numeros[i]);
            }
            //Calcula la media de los números
            double media = calcularMedia(numeros);
            //Calcula la suma de las diferencias al cuadrado entre cada número y la media, y obtiene 
            //la desviación estándar
            double sumaCuadradosDiferencias = 0;
            //for para ir por cada numero de nuestra lista e ir sumando
            for (double numero : numeros) {
                sumaCuadradosDiferencias += Math.pow(numero - media, 2);
            }
            double desviacionEstandar = Math.sqrt(sumaCuadradosDiferencias / numeros.length);
            //Asignar los resultados a los JLabel correspondientes
            lb_desviacion_resultado.setText(String.valueOf(desviacionEstandar));
            lb_media_resultado.setText(String.valueOf(media));
        } catch (NumberFormatException e) {
            //Mostrar mensaje de error si se ingresaron caracteres no numéricos
            JOptionPane.showMessageDialog(null, 
                    "¡Por favor, ingrese solo números!", 
                    "Solo números", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    //Método para calcular la media de una lista de números
    private double calcularMedia(double[] numeros) {
        return Arrays.stream(numeros).sum()/numeros.length;
    }
}
