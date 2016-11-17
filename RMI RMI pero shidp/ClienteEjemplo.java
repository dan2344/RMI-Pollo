import java.io.*; 
import java.rmi.*; 
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry;
import java.util.*;
public class ClienteEjemplo {
	public static void main(String args[]){
		try{			
			int numPuertoRMI=1099;
			
			String URLRegistro = "rmi://192.168.9.55:" + numPuertoRMI + "/ejemplo"; 
			InterfazEjemplo h = (InterfazEjemplo) Naming.lookup(URLRegistro); //busqueda en el registry del servidor
		    //Invocar el o los metodos remotos
			Scanner sc= new Scanner(System.in);
			int num=sc.nextInt();
			String Binario = h.Binario(num);
			int Factorial = h.Factorial(num);
			int Primo = h.Primo(num);
			
			String mensaje=h.metodoEj1();
			System.out.println("Numero: " + num);
			System.out.println("Binario: " + Binario);
			System.out.println("Factorial: " + Factorial);
			System.out.println("Primo: " + Primo);
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}
}