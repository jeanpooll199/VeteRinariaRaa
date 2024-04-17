
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
public class Mascota {
    public String Codigo;
    public String FechaNacimiento;
    public String Especie;
    public String Raza;
    public double Peso;
    public String Color;
    public String Alias;
    public Cliente cliente;
    
    public Mascota(){
       
    }
    
    public Mascota(String alias){
       Alias=alias;
    }
    
    public void getCodigo(String codigo)
    {
       Codigo= codigo;
       
    }
    public void getFechaNacimiento(String fecha)
    {
       FechaNacimiento= fecha;
       
    }
    public void getEspecie(String especie)
    {
       Especie= especie;
       
    }
    public void getRaza(String raza)
    {
       Raza= raza;
       
    }
    public void getPeso(double peso)
    {
       Peso= peso;
       
    }
    public void getAlias(String alias)
    {
       Alias= alias;
       
    }
    public void getCliente(Cliente cliente1)
    {
       cliente=cliente1;
       
    }
    public void getColor(String color)
    {
       Color= color;
       
    }
    
    public void muestra_objeto(){
       JOptionPane.showMessageDialog(null, "Mascota "+Alias+" del cliente "+cliente.Nombre+" "+cliente.Apellido+"\n"+"Fecha de nacimiento: "+FechaNacimiento+"\n"+"Especie: "+Especie+"\n"+"Raza: "+Raza+"\n"+"Peso: "+Peso+"\n"+"Color de pelo: "+Color+"\n"+"Codigo: "+Codigo+"\n");
    }
    
    @Override
    public String toString() {
        return Alias;
    }
}
