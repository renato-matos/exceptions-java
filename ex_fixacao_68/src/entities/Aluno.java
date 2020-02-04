package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		
		return nota1 + nota2 + nota3;
		
	}
	
	public boolean aprovado() {
		
		if (this.notaFinal() >= 60) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public double missingPoints() {
		return 60 - this.notaFinal();
	}

}
