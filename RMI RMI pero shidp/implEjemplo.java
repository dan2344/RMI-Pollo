import java.rmi.*;
import java.rmi.server.*;

	public class implEjemplo extends UnicastRemoteObject implements InterfazEjemplo{
		
		public implEjemplo() throws RemoteException{
			super();
		}
		
		public String metodoEj1() throws RemoteException{
			return "soy la chencha";
		}
		
		public static int Factorial(int num) {
			int resultado = 1;
			for (int i = 1; i <= n; i++) {
				resultado *= i;
			}
			return resultado;
		}
		
		public boolean Primo(int num) {
			int resultado = 1;
			boolean condicion= false;
			for (int i = 2; i <= num; i++) {
				if(i %num = 0){
					condicion=false;
				}else{
					condicion=true;
				}
			}
			return condicion;
		}
		
		public String Binario(int num){			
			int dividendo, resto;
			String binario = "";
			dividendo = num;
			while (dividendo >= 2) {
				resto = dividendo % 2;
				if (resto == 1) {
					binario = "1" + binario;
				} else {
					binario = "0" + binario;
				}
				dividendo = dividendo / 2;
			}
			if (dividendo == 1) {
				binario = "1" + binario;
			} else {
				binario = "0" + binario;
			}
			return binario;
		}
    }
		
		public int elnum (int parametro) throws RemoteException{ //regresa el parámetro
			int num = parametro;
			int factorial = 1;
			
			while (num!= 1){
				factorial = num * factorial;
				num--;
			}
			return factorial;
		}
		
	}
