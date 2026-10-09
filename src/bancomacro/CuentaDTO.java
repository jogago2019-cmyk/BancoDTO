/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author jogag
 */
public class CuentaDTO {
    private String Num;
    private String Dinero;
    private String NombCuenta;

    public CuentaDTO(String Num, String Dinero, String NombCuenta) {
        this.Num = Num;
        this.Dinero = Dinero;
        this.NombCuenta = NombCuenta;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" + "Num=" + Num + ", Dinero=" + Dinero + ", NombCuenta=" + NombCuenta + '}';
    }

   
  
    
}
