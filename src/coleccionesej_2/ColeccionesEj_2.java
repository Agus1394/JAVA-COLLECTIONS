/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package coleccionesej_2;

import coleccionesej_2.atributos.atributoAlumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AGUS
 */
public class ColeccionesEj_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
        ArrayList <atributoAlumno> informacionAlu = new ArrayList <> ();
        String respuesta;
        
        do{
            atributoAlumno crear= new atributoAlumno();
            System.out.println("Ingrese el nombre: ");
            String nom= leer.next();
            
            System.out.println("Ingrese las 3 notas correspondientes: ");
            int calificacion1= leer.nextInt(); int calificacion2= leer.nextInt(); int calificacion3= leer.nextInt();
           
            crear.setNombre(nom);
            crear.setNota1(calificacion1);
            crear.setNota2(calificacion2);
            crear.setNota3(calificacion3);
            
            informacionAlu.add(crear);
            
            System.out.println("Desea ingresar otro alumno?");
            respuesta= leer.next();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("Ingrese el nombre del alumno para promediar la nota final: ");
        String nombreAlu= leer.next();
        
        informacionAlu.stream().filter((alumno) -> (alumno.getNombre().equalsIgnoreCase(nombreAlu))).forEachOrdered((alumno) -> {
            System.out.println("La nota final de "+nombreAlu+" es de: "+alumno.notaFinal());
        }); //recorre en la lista:

      
    }
    
    
    
}
