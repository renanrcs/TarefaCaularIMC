package resultadoIMC;

public class Paciente {
	
	double peso;
	double altura;
	
	public Paciente(double kilos, double metros) {
		this.peso = kilos;
		this.altura = metros;
	}
	
	public double caucularIMC() {
		return this.peso/(this.altura*this.altura);
	}
	
	public String diagnostico() {
		
		if(caucularIMC() < 16) {
			return "Baixo peso muito Grave";
		}else if(caucularIMC() >= 16 && caucularIMC() < 17) {
			return "Baixo peso grave";
		}else if(caucularIMC() >= 17 && caucularIMC() < 18.49) {
			return "Baixo peso";
		}else if(caucularIMC() >= 18.50 && caucularIMC() < 24.99) {
			return "Peso normal";
		}else if(caucularIMC() >= 25 && caucularIMC() < 29.99) {
			return "Sobrepeso";
		}else if(caucularIMC() >= 30 && caucularIMC() < 34.99) {
			return "Obesidade grau I";
		}else if(caucularIMC() >= 35 && caucularIMC() < 39.99) {
			return "Obesidade grau II";
		}else {
			return "Obesidade grau III (obesidade mórbida)";
		}
	}
}
