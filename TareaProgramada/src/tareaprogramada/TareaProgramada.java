/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaprogramada;

import com.r6.service.Control;
import com.r6.service.Servicio;

/**
 *
 * @author Lenovo
 */
public class TareaProgramada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Servicio.setServerURL("jdbc:mysql://localhost:3306/mensajeria?serverTimezone=UTC");
        Servicio.setUsername("root");
        Servicio.setPassword("wvjjk611");
        Servicio.setDriver("com.mysql.jdbc.Driver");
        Servicio.setHbm2DDLprotocol("update");
        Servicio.setDialect("org.hibernate.dialect.MySQLDialect");
        Servicio.startEntityManagerFactory();
         Servicio.setUbicacionMimes("C:/Users/Lenovo/Desktop/magicmimes.properties");
   
   
            Control prueba = new Control();
            
            prueba.setEm(Servicio.getEm());
            prueba.controlCorreos();
            prueba.controlRecordatorios();
           //System.out.println("Listo!");
    }
    
}
