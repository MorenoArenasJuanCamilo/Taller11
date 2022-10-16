import java.util.Scanner;

public class Cuenta {
	Scanner leer = new Scanner (System.in);

	private String cuenta; 
	private float cantidad;


	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public void inicio() {
		System.out.println("digite su nombre");
		cuenta=leer.nextLine();
		preguntar();
	}
	public void preguntar() {
		System.out.println("si desea ingresar dinero oprima 1");
		System.out.println("si desea retirar dinero oprima 2");
		System.out.println("si desea terminar oprima 3");
		int cant= leer.nextInt();
		if (cant==1) {
			ingresar();
		}
		if (cant==2) {
			retirar();
		}
		if (cant==3) {
			terminar();
		}
	}
	public void ingresar() {
		System.out.println("digite la cantidad a ingresar");
		float diner = leer.nextFloat();
		diner = diner + cantidad;
				cantidad = diner; 
				if (cantidad<=0) {
					cantidad=0;
				}
				System.out.println("la cantidad actual que tiene en su cuenta es:"+cantidad);
				preguntar();
	}
	public void retirar() {
		System.out.println("digite la cantidad a retirar");
		float diner = leer.nextFloat();
		diner = cantidad - diner;
				cantidad = diner; 
				if (cantidad<=0) {
					cantidad=0;
				}
				System.out.println("la cantidad actual que tiene en su cuenta es:"+cantidad);
				preguntar();

	}
	public void terminar() {
		System.out.println("El programa de la cuenta ha terminado ");

	}
}
