import java.util.Scanner;

public class SueldoOperario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int horas_trabajadas;
		float costoHora;
		float Sueldo;
		System.out.println("Ingrese la cantidad de horas trabajadas por el empleado");
		horas_trabajadas = teclado.nextInt();
		System.out.println("ingrese el costo de la hora");
		costoHora = teclado.nextFloat();
		teclado.close();
		Sueldo = horas_trabajadas * costoHora;
		
		System.out.println("El sueldo a pagar " + Sueldo);
		
		System.out.println("Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		

	}

}
