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
public abstract class Pregunta {
    private int puntaje;
    String texto;
    
    public Pregunta(String texto, int puntaje){
        this.texto = texto;
        this.setPuntaje(puntaje);
    };
    
    public abstract boolean buscar();
    
    private void setPuntaje(int puntaje){
        this.puntaje = puntaje;
    };
    
    public int getPuntaje(){
      return this.puntaje;  
    };
    
    public String getTexto(){
        return this.texto;
    }; 
}
