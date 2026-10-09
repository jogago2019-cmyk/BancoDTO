/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
