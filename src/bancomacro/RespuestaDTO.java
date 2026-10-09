/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author jogag
 */
public class RespuestaDTO<T> {
    private boolean exito;
    private String mensaje;
    private T dato;

    public RespuestaDTO(boolean exito, String mensaje, T dato) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.dato = dato;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDato() {
        return dato;
    }
    
    
}
