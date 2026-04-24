package aula.programacao;

public class Aluno extends Pessoas {
	private String matricula;

	public String getMatricula() {
		return matricula;
	}	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	
	public void estudar(String materia) {
		System.out.println(getNome() + " " + getSobrenome() + " estudando " + materia);
	}

}
