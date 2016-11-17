import java.rmi.*;

public interface InterfazEjemplo extends Remote {
	public int Factorial(int num) throws java.rmi.RemoteException;
	public char[] Binario(String num) throws java.rmi.RemoteException;
	public int Primo(int num) throws java.rmi.RemoteException;
	
	public String metodoEj1() throws java.rmi.RemoteException;
	public int elnum(int parametro) throws java.rmi.RemoteException;
} 