/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Roberto
 */
public class Proyecto1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea un examen  con un total de 10 puntos: 8 preguntas de un punto y una de dos puntos 

        Exam miExam = new Exam(); 

        miExam.agregarPregunta(new VFpregunta("La capital de Chile es Santiago", true, 1)); 

        String santiagoElec[] = {"Santiago", "Valparaiso", "Concepcion", "Magallanes", "Arica"}; 

        miExam.agregarPregunta(new Selec_Mul_Pregunta("Cuál es la capital de Region Metropolitana", santiagoElec, 0, 1)); 

        miExam.agregarPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de IV Region", "Coquimbo", 1)); 

        miExam.agregarPregunta(new VFpregunta("La capital de Alberta es Calgary", false, 1)); 

        String BCElec[] = {"Victoria", "Vancouver", "Nanaimo"}; 

        miExam.agregarPregunta(new Selec_Mul_Pregunta("Cuál es la capital de British Columbia", BCElec, 0, 1)); 

        miExam.agregarPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Argentina", "Buenos Aires", 1)); 

        miExam.agregarPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Canada", "Ottawa", 2)); 

        miExam.agregarPregunta(new VFpregunta("La capital de La Serena es Illapel", false, 1)); 

        String PElec[] = {"Brasilia", "Rio de Janeiro", "Sao Paulo", "Blumenau"}; 

        miExam.agregarPregunta(new Selec_Mul_Pregunta("Cuál es la capital de Brasil?", PElec, 0, 1)); 

        // dar examen y reportar el puntaje 

        int puntaje = miExam.darExamen(); 

        System.out.println("su resultado es " + puntaje + "%"); 
        
    }
    
}
