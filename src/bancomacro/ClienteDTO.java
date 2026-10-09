/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

import java.util.Objects;

/**
 *
 * @author jogag
 */
public class ClienteDTO {
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteDTO(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }


    
    
}
