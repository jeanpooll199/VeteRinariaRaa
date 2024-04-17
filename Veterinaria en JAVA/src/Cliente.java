
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
public class Cliente {
    public String Nombre;
    public String Apellido;
    public String Dni;
    public String FechaNacimiento;
    public String Telefono;
    public String Email;
    public Mascota mascota;
    
    public Cliente(){
    
    }
    public Cliente(String nombre, String apellido){
        Nombre=nombre;
        Apellido=apellido;
    }

    public void getNombre(String nombre)
    {
       Nombre= nombre;
       
    }
    public void getApellido(String apellido)
    {
       Apellido= apellido;  
    }
    public void getDni(String dni)
    {
       Dni= dni;   
    }
    
    public void getFecha(String fecha){
        FechaNacimiento=fecha;
    }
    public void getTelefono(String telefono){
        Telefono=telefono;
    }
    public void getEmail(String email){
        Email=email;
    }
    
    public String setApellido(){
        return Apellido;
    }
    
    public void getMascota(Mascota mascotaf)
    {
       mascota= mascotaf;
       
    }
    
    public void muestra_objeto(){
       JOptionPane.showMessageDialog(null, "Cliente: "+Nombre+" "+Apellido+"\n Fecha de Nacimiento: "+FechaNacimiento+"\n"+"DNI: "+Dni+"\n"+"Telefono: "+Telefono+"\n"+"Email: "+Email);
    }
    
    public void muestra_mascota(){
        JOptionPane.showMessageDialog(null,"Mascota a cargo: "+mascota);
    }
    
    @Override
    public String toString() {
        return Nombre+" "+Apellido;
    }
}
