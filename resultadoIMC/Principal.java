package resultadoIMC;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(53.44, 1.71);
		Paciente p2 = new Paciente(63.44, 1.71);
		Paciente p3 = new Paciente(93.44, 1.71);
		
		System.out.println(p1.caucularIMC());
		System.out.println(p1.diagnostico());
		System.out.println("---------------------------");
		
		System.out.println(p2.caucularIMC());
		System.out.println(p2.diagnostico());
		System.out.println("---------------------------");
		
		System.out.println(p3.caucularIMC());
		System.out.println(p3.diagnostico());
		System.out.println("---------------------------");

	}

}
