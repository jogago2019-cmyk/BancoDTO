# Banco DTO 

Hicimos este proyecto para apreder a utilizar DTOs

# Cliente.java
``` java
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String pass;

    public Cliente(Long id, String nombre, String apellido, String dni, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
```

# ClienteDTO.java
``` java
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
```
# Cuenta.java
``` java
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
```
# CuentaDTO.java

``` java
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

```
# RespuestaDTO.java
``` java
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
```
# BancoMacro.java
``` java
package bancomacro;

/**
 *
 * @author jogag
 */
public class BancoMacro {
    public static ClienteDTO clientecoverDTO(Cliente cli){
    return new ClienteDTO(cli.getNombre(), cli.getApellido(), cli.getDni());
    }
    
    public static CuentaDTO cuentaconverDTO(Cuenta cuen){
    return new CuentaDTO(cuen.getNumCuenta(), cuen.getDinero(), cuen.getNombreCuenta());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Cliente cli1 = new Cliente(1l, "jose", "gome", "12121", "asasa");
      ClienteDTO mensaje=clientecoverDTO(cli1);
      Cuenta cuent1= new Cuenta("2", "jos", "121212", "correinte");
      CuentaDTO mens = cuentaconverDTO(cuent1);
      
        System.out.println(mensaje);
        System.out.println(mens);
        
        RespuestaDTO<ClienteDTO> RespCliente= new RespuestaDTO<>(true,"encontrado",mensaje);
    }
}

```