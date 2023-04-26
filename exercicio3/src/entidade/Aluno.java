package entidade;

public class Aluno {

	public String nome;
	public double nota1,nota2,nota3;
	public double notaTotal;
	
	
	public double calculaNota() {
		return nota1+nota2+nota3;
	}
	
	
	public double minimoNota() {
		return (30+35+35)*60/100;
	}
	
	
	public double atingirMedia() {
		return 60- (nota1+nota2+nota3);
	}
}
