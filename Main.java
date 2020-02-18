package persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int contadorAlumno = 0, contadorDocente = 0, contadorDirectivo = 0;
        int edadA = 0, edadDoc = 0, edadDir = 0;
        int fem = 0, masc = 0;
        double promedioA, promedioDoc, promedioDir;
        ArrayList<Persona> personas = new ArrayList<Persona>();
        
        Persona pers1 = new Alumno(15,"F");
        Persona pers2 = new Docente (35,"M");
        Persona pers3 = new Directivo(50,"F");
        Persona pers4 = new Alumno(17,"M");
        Persona pers5 = new Alumno(14,"M");
        Persona pers6 = new Docente (41,"M");
        
        personas.add (pers1);
        personas.add (pers2);
        personas.add (pers3);
        personas.add (pers4);
        personas.add (pers5);
        personas.add (pers6);
        
        for (Persona pers : personas){
            if (pers instanceof Alumno){
                contadorAlumno++;
                edadA = edadA + pers.getEdad();                
            }
            if (pers instanceof Docente){
                contadorDocente++;
                edadDoc = edadDoc + pers.getEdad();
            }
            if (pers instanceof Directivo){
                contadorDirectivo++;
                edadDir = edadDir + pers.getEdad();
            }
            if (pers.sexo == "F"){
                fem++;
            }
            if (pers.sexo == "M"){
                masc++;
            }
        }
        
        promedioA = edadA / contadorAlumno;
        promedioDoc = edadDoc / contadorDocente;
        promedioDir = edadDir / contadorDirectivo;
        
        System.out.println("Alumnos: " + contadorAlumno);
        System.out.println("Promedio de edad: " + promedioA);
        System.out.println("Docentes: " + contadorDocente);
        System.out.println("Promedio de edad: " + promedioDoc);
        System.out.println("Directivos: " + contadorDirectivo);
        System.out.println("Promedio de edad: " + promedioDir);
        System.out.println("Cantidad de mujeres: " + fem);
        System.out.println("Cantidad de hombres: " + masc);
    }
}
