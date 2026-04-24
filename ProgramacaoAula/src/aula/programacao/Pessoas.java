package aula.programacao;

public class Pessoas {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	
	
	public void andar() {
		System.out.println(getNome() + " andando...");
	}
	
	public void parar() {
		System.out.println("Pessoa parada...");
	}
	
	public void correr() {
		System.out.println("Pessoa correndo...");
	}
	public void falar() {
		System.out.println("Pessoa falando...");
	}
	
	
	
	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	public String getCpf() {
		return cpf;
	}	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	}