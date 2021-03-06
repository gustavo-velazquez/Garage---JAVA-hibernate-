package modelo;
// Generated 16/06/2020 17:55:22 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idempleado;
     private int dni;
     private String nombre;
     private int telefono;
     private String direccion;
     
     private Set registros = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(int dni, String nombre, int telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public Empleado(int dni, String nombre, int telefono, String direccion, Set registros) {
       this.dni = dni;
       this.nombre = nombre;
       this.telefono = telefono;
       this.direccion = direccion;
       this.registros = registros;
    }
   
    public Integer getIdempleado() {
        return this.idempleado;
    }
    
    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }
    public int getDni() {
        return this.dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }



    public String toString(){
        
        return "Empleado:"+nombre+"\nDNI:"+dni;
    }
    
    
    
    public void alta(Empleado e){
        SessionFactory instancia = NewHibernateUtil.getSessionFactory();
        Session sesion = instancia.openSession();
        
        Transaction tx = sesion.beginTransaction();
        sesion.save(e);
        tx.commit();
        sesion.close();
        JOptionPane.showMessageDialog(null, "Empleado agregado Correctamente");
    }
    
    public Object consultarEmp(int id){
        
        Empleado e;
        SessionFactory instancia = NewHibernateUtil.getSessionFactory();
        Session sesion = instancia.openSession();
        
        Transaction tx = sesion.beginTransaction();
        
        e=(Empleado) sesion.get(Empleado.class, id);//Busca en la clase empleado el parametro q y devuelve un objeto
     
        tx.commit();
        sesion.close();     
        return e;
    }
}


