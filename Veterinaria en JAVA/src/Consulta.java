
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agustin
 */
public class Consulta {
    public Cliente cliente;
    public Mascota mascota;
    public String Veterinario;
    public String Fecha;
    public String Tiempo;
    public double Importe;
    public String Resolucion;
    public String Receta;
    
    public Consulta(){
        
    }
    
    public void getCliente(Cliente cliente1){
        cliente= cliente1;
    }
    public void getMascota(Mascota mascota1){
        mascota=mascota1;
    }
    public void getVeterinario(String veterinario){
        Veterinario=veterinario;
    }
    public void getFecha(String fecha){
        Fecha=fecha;
    }
    public void getTiempo(String tiempo){
        Tiempo=tiempo;
    }
    public void getImporte(double importe){
        Importe=importe;
    }
    public void getResolucion(String resolucion){
        Resolucion=resolucion;
    }
    public void getReceta(String receta){
        Receta=receta;
    }
    
    public void muestra_objeto(){
       JOptionPane.showMessageDialog(null,"Consulta: \n Cliente: "+cliente.Apellido+" "+cliente.Nombre+"\n Mascota: "+mascota.Alias+"\n Fecha: "+Fecha+"\n Tiempo: "+Tiempo+"\n Resolucion: "+Resolucion+"\n Receta: "+Receta+"\n Importe: $"+Importe);
    }
}
