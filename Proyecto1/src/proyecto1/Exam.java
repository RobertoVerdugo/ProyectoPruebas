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
public class Exam {
    public static final int MAX_PREGUNTAS = 10;
    private int cant_preguntas=0;
    private Pregunta Preguntas[] = new Pregunta[MAX_PREGUNTAS];
    
    public void agregarPregunta(Pregunta p){
        if(cant_preguntas<MAX_PREGUNTAS){
            this.Preguntas[cant_preguntas]=p;
            cant_preguntas++;
        }
        else{
            System.out.println("Limite de preguntas alcanzado");
        }
    }
    public int darExamen(){
        int puntaje_total= getPuntajeTotal();
        int puntaje_obtenido=0;
        for(int i=0;i<this.cant_preguntas;i++){
            if(Preguntas[i].buscar()){
                puntaje_obtenido+=Preguntas[i].getPuntaje();
            }
        }
        int porcentaje_logrado = calcular_porcentaje(puntaje_total,puntaje_obtenido);
        return porcentaje_logrado;
    }
    
    private int getPuntajeTotal(){
        int puntaje=0;
        for(int i=0;i<this.cant_preguntas;i++){
            puntaje+=this.Preguntas[i].getPuntaje();
        }
        return puntaje;
    }
    private int calcular_porcentaje(int total,int puntaje){
        int porcentaje = (puntaje*100)/total;
        return porcentaje;
    }
}
