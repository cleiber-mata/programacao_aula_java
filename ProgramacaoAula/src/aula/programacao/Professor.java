package aula.programacao;

public class Professor extends Pessoas {
	private String registro; 
	private String curso; 
	public String getRegistro() { 
		return registro; } 
	public void setRegistro(String registro) { 
		this.registro = registro; } 
	public String getCurso() { 
		return curso; } 
	public void setCurso(String curso) { 
		this.curso = curso; } 
	public void lecionar(String materia) { System.out.println("Professor " + getNome() + " " + getSobrenome() + ", lecionando " + materia + ", Registro:" + getRegistro() + "."); }

}
