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
public class VFpregunta extends Pregunta{
    boolean respuesta;
    
    public VFpregunta(String texto, boolean respuesta,int puntaje){
        super(texto,puntaje);
        this.respuesta = respuesta;
    }
    
    @Override
    public boolean buscar(){
        Scanner entrada = new Scanner(System.in);
        String respuesta_user;
        System.out.println(this.getTexto() + "?");   
        
        do{
            System.out.println("Ingrese t o f: ");
            respuesta_user = entrada.nextLine().toLowerCase();
        }while(!respuesta_user.equals("t") && !respuesta_user.equals("f"));
        
        if (respuesta_user.equals("t") && this.respuesta){
            System.out.println("La respuesta es correcta!");
            return true;
        }
        else{
            if(respuesta_user.equals("f") && !this.respuesta){
                System.out.println("La respuesta es correcta!");
                return true;
            }
            else{
                System.out.println("Incorrecto, la respuesta correcta es: "+ this.respuesta);
                return false;
            }
        }     
    };
}
