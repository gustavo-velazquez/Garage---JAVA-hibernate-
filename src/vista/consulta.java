/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.mysql.jdbc.ResultSetMetaData;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import modelo.Cliente;
import modelo.Empleado;
import modelo.NewHibernateUtil;
import modelo.Registro;
import modelo.Vehiculo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author USUARIO
 */
public class consulta extends javax.swing.JFrame {

    /**
     * Creates new form consulta
     */
    Registro registro;
    Vehiculo vehiculo;
    Cliente cliente;
    Empleado empleado;
    String bd="";
    public consulta() {
        initComponents();
        txtpatente.setEditable(false);
        txtcliente.setEditable(false);
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        radioemp = new javax.swing.JRadioButton();
        radiocliente = new javax.swing.JRadioButton();
        radiovehiculo = new javax.swing.JRadioButton();
        buttonmostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtpatente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtcliente = new javax.swing.JTextField();
        radiopatente = new javax.swing.JRadioButton();
        radioclientebusqueda = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        radioRegistros = new javax.swing.JRadioButton();
        radiovehiculosfuera = new javax.swing.JRadioButton();

        setTitle("Consultas");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(table);

        buttonGroup1.add(radioemp);
        radioemp.setText("Empleados");

        buttonGroup1.add(radiocliente);
        radiocliente.setText("Clientes");
        radiocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioclienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiovehiculo);
        radiovehiculo.setText("Vahiculos en el garage");
        radiovehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiovehiculoActionPerformed(evt);
            }
        });

        buttonmostrar.setText("Mostrar");
        buttonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmostrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Listar todos:");

        txtpatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatenteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Busqueda");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        buttonGroup2.add(radiopatente);
        radiopatente.setText("Vehiculo x Patente");
        radiopatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiopatenteActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioclientebusqueda);
        radioclientebusqueda.setText("Cliente x nombre");
        radioclientebusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioclientebusquedaActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioRegistros);
        radioRegistros.setText("Registros");
        radioRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRegistrosActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiovehiculosfuera);
        radiovehiculosfuera.setText("Vehiculos fuera del garage");
        radiovehiculosfuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiovehiculosfueraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radiocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiovehiculo))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radioemp)
                                    .addComponent(radioRegistros))
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radiovehiculosfuera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioclientebusqueda)
                            .addComponent(radiopatente))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpatente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(buttonmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiocliente)
                    .addComponent(txtpatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiopatente)
                    .addComponent(radioRegistros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiovehiculo)
                            .addComponent(radioemp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radiovehiculosfuera))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioclientebusqueda))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(buttonmostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radiovehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiovehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiovehiculoActionPerformed

    private void buttonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmostrarActionPerformed
        
        //String tipo= "";
        String q;
        Empleado empleado = new Empleado();
        Registro registro = new Registro();
        
        if (radiocliente.isSelected()) {
            
                bd="Cliente";
                //Agrego columnas
                DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                modelo.setRowCount(0);//borrar filas tabla
                modelo.setColumnCount(0);//borrar columnas tabla
                
                modelo.addColumn("IDCliente");
                modelo.addColumn("DNI");
                modelo.addColumn("Nombre");
                modelo.addColumn("Telefono");
                modelo.addColumn("Direccón");
                
                ArrayList<Cliente> clientes = new ArrayList<Cliente>();               
                ArrayList<String> lista = new ArrayList<String>();
                q="From Cliente";
                
                //Obtengo todos los empleados
                clientes= (ArrayList<Cliente>) registro.consultar(q); 
                     
                //Recorre los empleados y agraga filas a la tabla
                for (Cliente t: clientes) {
                    //lista.add(t.getNombre());
                    
                    String[] datos={String.valueOf(t.getIdcliente()),t.getNombre(),String.valueOf(t.getDni()),String.valueOf(t.getTelefono()),t.getDireccion()};
                    modelo.addRow(datos);
            
                }
            
            
        }//fin if
        else{
            if(radiovehiculo.isSelected()){
                bd="Vehiculo";
                String estados="";
              //Agrego columnas
                DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                
                modelo.setRowCount(0);//borrar filas tabla
                modelo.setColumnCount(0);//borrar columnas tabla
                
                modelo.addColumn("IDVehiculo");
                modelo.addColumn("IDCliente");
                modelo.addColumn("Patente");
                modelo.addColumn("Tipo");
                modelo.addColumn("Color");
                modelo.addColumn("Marca");
                modelo.addColumn("Estado");
                
                
                ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();               
                ArrayList<String> lista = new ArrayList<String>();
                q="From Vehiculo Where estado=true";
                
                //Obtengo todos los empleados
                vehiculos= (ArrayList<Vehiculo>) registro.consultar(q); 
               
                
                //modelo.setRowCount(0);//borrar
                
                //Recorre los empleados y agraga filas a la tabla
                for (Vehiculo t: vehiculos) {
                    //lista.add(t.getNombre());
                    if(t.getEstado()==true)
                        estados="En garage";
                    
                    String[] datos={String.valueOf(t.getIdvehiculo()),String.valueOf(t.getCliente().getIdcliente()),t.getPatente(),t.getTipo(),t.getColor(),t.getMarca(),estados};
                    modelo.addRow(datos);
            
                }
                
            }//fin if2
            else
            {
                if(radioemp.isSelected()){
                //TableColumnModel columna = table.getColumnModel();
                //columna.getColumn().setHeaderValue("pedro");//cambiar nombre a columnas
                
                bd="Empleado";
                
                //Agrego columnas
                DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                
                modelo.setRowCount(0);//borrar filas tabla
                modelo.setColumnCount(0);//borrar columnas tabla
                modelo.addColumn("IDEmpleado");
                modelo.addColumn("DNI");
                modelo.addColumn("Nombre");
                modelo.addColumn("Telefono");
                modelo.addColumn("Direccón");
                
                
                ArrayList<Empleado> empleados = new ArrayList<Empleado>();               
                ArrayList<String> lista = new ArrayList<String>();
                q="From Empleado";
                
                //Obtengo todos los empleados
                empleados= (ArrayList<Empleado>) registro.consultar(q); 
               
                
                //modelo.setRowCount(0);//borrar
                
                //Recorre los empleados y agraga filas a la tabla
                for (Empleado t: empleados) {
                    //lista.add(t.getNombre());
                    
                    String[] datos={String.valueOf(t.getIdempleado()),t.getNombre(),String.valueOf(t.getDni()),String.valueOf(t.getTelefono()),t.getDireccion()};
                    modelo.addRow(datos);
            
                }
                }//fin if3
             
            
            else{
                    if (radioRegistros.isSelected()) {

                        bd="Registro";
                        //Agrego columnas
                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                        modelo.setRowCount(0);//borrar filas tabla
                        modelo.setColumnCount(0);//borrar columnas tabla

                        modelo.addColumn("IDRegistro");
                        modelo.addColumn("IDEmpleado");
                        modelo.addColumn("HoraEntrada");
                        modelo.addColumn("TarifaTotal");
                        modelo.addColumn("IDVehiculo");

                        ArrayList<Registro> registros = new ArrayList<Registro>();               
                        ArrayList<String> lista = new ArrayList<String>();
                        q="From Registro";

                        //Obtengo todos los empleados
                        registros= (ArrayList<Registro>) registro.consultar(q); 

                        //Recorre los empleados y agraga filas a la tabla
                        for (Registro t: registros) {
                            //lista.add(t.getNombre());

                            String[] datos={String.valueOf(t.getIdregistro()),String.valueOf(t.getEmpleado().getIdempleado()),String.valueOf(t.getHoraEntrada()),String.valueOf(t.getTarifaTotal()),String.valueOf(t.getVehiculo().getIdvehiculo())};
                            modelo.addRow(datos);

                        }
            
            
                    }//fin if4
                    else{
                            if (radiovehiculosfuera.isSelected()) {

                                    bd="Vehiculo";
                                    String estados="";
                                  //Agrego columnas
                                    DefaultTableModel modelo = (DefaultTableModel) table.getModel();

                                    modelo.setRowCount(0);//borrar filas tabla
                                    modelo.setColumnCount(0);//borrar columnas tabla

                                    modelo.addColumn("IDVehiculo");
                                    modelo.addColumn("IDCliente");
                                    modelo.addColumn("Patente");
                                    modelo.addColumn("Tipo");
                                    modelo.addColumn("Color");
                                    modelo.addColumn("Marca");
                                    modelo.addColumn("Estado");


                                    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();               
                                    ArrayList<String> lista = new ArrayList<String>();
                                    q="From Vehiculo Where estado=false";

                                    //Obtengo todos los empleados
                                    vehiculos= (ArrayList<Vehiculo>) registro.consultar(q); 


                                    //modelo.setRowCount(0);//borrar

                                    //Recorre los empleados y agraga filas a la tabla
                                    for (Vehiculo t: vehiculos) {
                                        //lista.add(t.getNombre());
                                        if(t.getEstado()==false)
                                            estados="Fuera de Garage";

                                        String[] datos={String.valueOf(t.getIdvehiculo()),String.valueOf(t.getCliente().getIdcliente()),t.getPatente(),t.getTipo(),t.getColor(),t.getMarca(),estados};
                                        modelo.addRow(datos);

                                    }

                        }//fin if4
                        
                    }
                    
                }//fin else
            }//fin else
                   
        }
        
    }//GEN-LAST:event_buttonmostrarActionPerformed

    private void txtpatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatenteActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        
    }//GEN-LAST:event_txtclienteActionPerformed

    private void radiopatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiopatenteActionPerformed
        // TODO add your handling code here:
        txtpatente.setEditable(true);
        txtcliente.setEditable(false);
        txtcliente.setBackground(Color.GRAY);
        txtpatente.setBackground(Color.white);
    }//GEN-LAST:event_radiopatenteActionPerformed

    private void radioclientebusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioclientebusquedaActionPerformed
        txtpatente.setEditable(false);
        txtcliente.setEditable(true);
        txtpatente.setBackground(Color.GRAY);
        txtcliente.setBackground(Color.white);
        
    }//GEN-LAST:event_radioclientebusquedaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        registro = new Registro();
        vehiculo = new Vehiculo();
        cliente = new Cliente();
        String q="";
        if(radiopatente.isSelected()){
            
            bd="Vehiculo";
            String estados="";
            String patente="";
            
              //Agrego columnas
                DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                
                modelo.setRowCount(0);//borrar filas tabla
                modelo.setColumnCount(0);//borrar columnas tabla
                
                modelo.addColumn("IDVehiculo");
                modelo.addColumn("IDCliente");
                modelo.addColumn("Patente");
                modelo.addColumn("Tipo");
                modelo.addColumn("Color");
                modelo.addColumn("Marca");
                modelo.addColumn("Estado");
                
                
                ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();               
                ArrayList<String> lista = new ArrayList<String>();
                
                patente=txtpatente.getText();
                q="From Vehiculo Where patente='"+patente+"'";
                
                //Obtengo todos los empleados
                vehiculos= (ArrayList<Vehiculo>) registro.consultar(q); 
               
                
                //modelo.setRowCount(0);//borrar
                
                //Recorre los empleados y agraga filas a la tabla
                for (Vehiculo t: vehiculos) {
                    //lista.add(t.getNombre());
                    if(t.getEstado()==true)
                        estados="En garage";
                    else
                        estados="Fuera del garage";
                    
                    String[] datos={String.valueOf(t.getIdvehiculo()),String.valueOf(t.getCliente().getIdcliente()),t.getPatente(),t.getTipo(),t.getColor(),t.getMarca(),estados};
                    modelo.addRow(datos);
            
                }
                
        }//fin if
        else{
            bd="Cliente";
            if(radioclientebusqueda.isSelected()){
                
                String busqueda="";
                //Agrego columnas
                DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                modelo.setRowCount(0);//borrar filas tabla
                modelo.setColumnCount(0);//borrar columnas tabla
                
                modelo.addColumn("IDCliente");
                modelo.addColumn("DNI");
                modelo.addColumn("Nombre");
                modelo.addColumn("Telefono");
                modelo.addColumn("Direccón");
                
                ArrayList<Cliente> clientes = new ArrayList<Cliente>();               
                ArrayList<String> lista = new ArrayList<String>();
                busqueda =txtcliente.getText();
                q="From Cliente where nombre='"+busqueda+"'";
                
                //Obtengo todos los empleados
                clientes= (ArrayList<Cliente>) registro.consultar(q); 
                     
                //Recorre los empleados y agraga filas a la tabla
                if(clientes.size()!=0){//si no esta vacio
                    for (Cliente t: clientes) {
                    //lista.add(t.getNombre());
                    String[] datos={String.valueOf(t.getIdcliente()),t.getNombre(),String.valueOf(t.getDni()),String.valueOf(t.getTelefono()),t.getDireccion()};
                    modelo.addRow(datos);
                    }
                    
                }//Fin if2
                else
                {
                    JOptionPane.showMessageDialog(null, "No se encontraron resultados");
                }
                
            }
            else
                JOptionPane.showMessageDialog(null, "Elija un tipo de busqueda");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int selec = table.getSelectedRow();
        int id=Integer.parseInt((String) table.getValueAt(selec, 0));//ID seleccionado
        System.out.println(bd);
        registro = new Registro();
        
        //Abro base de datos
        SessionFactory instancia = NewHibernateUtil.getSessionFactory();
        Session sesion = instancia.openSession();
        
        //Mensaje de eliminacion
        if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el registro, ¿desea continuar?",
        "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            
            switch(bd){
                case "Cliente":
                        
                        

                        Cliente c = (Cliente)sesion.get(Cliente.class,id);
                        registro.eliminar(sesion, instancia, c);
                    break;
                case "Empleado":
                    
                        Empleado e = (Empleado)sesion.get(Empleado.class,id);
                        registro.eliminar(sesion, instancia, e);
                    break;
                
                case "Vehiculo":
                    
                        Vehiculo v = (Vehiculo)sesion.get(Vehiculo.class,id);
                        registro.eliminar(sesion, instancia, v);
                    break;
                case "Registro":
                    
                        Registro r = (Registro)sesion.get(Registro.class,id);
                        registro.eliminar(sesion, instancia, r);
                    break;

            }
        }
            
                
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRegistrosActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_radioRegistrosActionPerformed

    private void radiovehiculosfueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiovehiculosfueraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiovehiculosfueraActionPerformed

    private void radioclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioclienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonmostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioRegistros;
    private javax.swing.JRadioButton radiocliente;
    private javax.swing.JRadioButton radioclientebusqueda;
    private javax.swing.JRadioButton radioemp;
    private javax.swing.JRadioButton radiopatente;
    private javax.swing.JRadioButton radiovehiculo;
    private javax.swing.JRadioButton radiovehiculosfuera;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtpatente;
    // End of variables declaration//GEN-END:variables
}
