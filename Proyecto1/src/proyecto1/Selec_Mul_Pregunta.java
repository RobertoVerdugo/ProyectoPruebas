/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class Selec_Mul_Pregunta extends Pregunta{
    public static final int MAX_RESPUESTAS = 5;
    String[] respuesta = new String[MAX_RESPUESTAS];
    int respuesta_correcta;
    
    public Selec_Mul_Pregunta(String texto,String[]respuesta,int respuesta_correcta,int puntaje){
        super(texto,puntaje);
        if(respuesta.length>1 && respuesta.length<=MAX_RESPUESTAS){        
            System.arraycopy(respuesta, 0, this.respuesta, 0, respuesta.length);
            this.respuesta_correcta= respuesta_correcta;
        }
        else{
            System.out.println("Las preguntas de seleccion multiple necesitan almenos 2 respuestas y no mas de 5");
        }
    }
    
    @Override
    public boolean buscar(){
        Scanner entrada = new Scanner(System.in);
        int cantidad_respuestas = calcular_largo_arreglo();
        String respuesta_user; 
        imprimir_alternativas(cantidad_respuestas);
        do{
            System.out.println("Escriba la letra correspondiente a su respuesta: ");
            respuesta_user = entrada.nextLine().toLowerCase();
        }while(!respuesta_user.equals("a") && !respuesta_user.equals("b") && !respuesta_user.equals("c") && !respuesta_user.equals("d") && !respuesta_user.equals("e"));
        
        int respuesta_numero = convertir_letra(respuesta_user);
        if(respuesta_numero>=cantidad_respuestas){
            System.out.println("por favor introduzca una letra válida");
            return this.buscar();
        }
        if(respuesta_numero == this.respuesta_correcta){
            System.out.println("La respuesta es correcta!");
            return true;
        }
        else{
            System.out.println("Incorrecto, la respuesta correcta es: "+ this.respuesta[this.respuesta_correcta]);
            return false;
        }
    }; 
    
    private void imprimir_alternativas(int cantidad_respuestas){
        System.out.println(this.getTexto() + "?");
        for (int i = 0; i < cantidad_respuestas; i++) {
          System.out.println((char)('a' + i)+"- "+ this.respuesta[i]);
        } 
    }
    private int convertir_letra(String letra){
        switch(letra){
            case "a":
                return 0;
            case "b":
                return 1;
            case "c":
                return 2;
            case "d":
                return 3;
            case "e":
                return 4;
        }
        return 0;
    }
    private int calcular_largo_arreglo(){
        int largo=0;
        for(int i=0;i<MAX_RESPUESTAS;i++){
            if(respuesta[i]!=null){
                largo++;
            } 
            else{
                break;
            }
        }
        return largo;
    }
}
