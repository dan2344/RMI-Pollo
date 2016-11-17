import java.rmi.*; 
import java.rmi.server.*; 
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.net.*;
import java.io.*; 

 public class ServidorEjemplo { 
   public static void main(String args[]) { 
	 int numPuertoRMI = 1099;
     String	URLRegistro; 
	 try{ 
	 // código que permite obtener el valor del número de puerto 
	 implEjemplo objExportado = new implEjemplo(); 
	 arrancarRegistro(numPuertoRMI); 
	 // registrar el objeto bajo el nombre "ejemplo" 
	 URLRegistro = "rmi://192.168.9.61:" + numPuertoRMI + "/ejemplo"; 
	 Naming.rebind(URLRegistro, objExportado); 
	 System.out.println( "Servidor ejemplo preparado.");
	 } 
	 catch (Exception excr) { 
	   System.out.println(  "Excepción en ServidorEjemplo.main: " + excr); 
	 }
   } 

   // Este método arranca un reg istro RMI en la máquina local
   //si no e iste en el número de puerto especificado
   
   private static void arrancarRegistro(int numPuertoRMI)
	throws RemoteException{
	try{
		Registry registro = LocateRegistry.getRegistry(numPuertoRMI);
		registro.list();
	}
	catch (RemoteException exc){
		System.out.println("El registro RMI no se puede localizar en el puerto " + numPuertoRMI);
		Registry registro = LocateRegistry.createRegistry(numPuertoRMI);
		System.out.println("Registro RMI creado en el puerto " + numPuertoRMI);
	}				
   }
 }
   
   
   