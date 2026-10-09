/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author jogag
 */
public class Cuenta {
 private String NumCuenta;
 private String nombreCuenta;
 private String Dinero;
 private String tipoCuenta;

    public Cuenta(String NumCuenta, String nombreCuenta, String Dinero, String tipoCuenta) {
        this.NumCuenta = NumCuenta;
        this.nombreCuenta = nombreCuenta;
        this.Dinero = Dinero;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getDinero() {
        return Dinero;
    }

    public void setDinero(String Dinero) {
        this.Dinero = Dinero;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    
}
