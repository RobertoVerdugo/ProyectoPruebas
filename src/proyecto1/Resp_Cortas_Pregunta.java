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
public class Resp_Cortas_Pregunta extends Pregunta{
    String respuesta;
    public Resp_Cortas_Pregunta(String texto, String respuesta,int puntaje){
        super(texto,puntaje);
        this.respuesta = respuesta;
    }
    
    @Override
    public boolean buscar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println(this.getTexto() + "?");
        String respuesta_user = entrada.nextLine().toLowerCase();
        
        if(respuesta_user.equalsIgnoreCase(this.respuesta.toLowerCase())){
            System.out.println("La respuesta es correcta!");
            return true;
        }
        else{
            System.out.println("Incorrecto, la respuesta correcta es: "+ this.respuesta);
            return false;
        }
    }; 
}
