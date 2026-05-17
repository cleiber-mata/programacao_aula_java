package aula.programacao;

public class Main {

	public static void main(String[] args) {
		Pessoas cleiber = new Pessoas();
		cleiber.setNome("Cleiber");
		cleiber.setSobrenome("Mata");
		cleiber.setCpf("12345678911");
		cleiber.andar();
		cleiber.parar();
		cleiber.correr();
		cleiber.falar();
		
		Aluno luiz = new Aluno();
		luiz.setNome("Luiz");
		luiz.setSobrenome("Mata");
		luiz.setCpf("11223344551");
		luiz.andar();
		luiz.parar();
		luiz.correr();
		luiz.falar();
		luiz.setMatricula("44433321");
		luiz.estudar("Java OO");
		
		Professor pedro = new Professor(); 
		pedro.setNome("Pedro"); 
		pedro.setSobrenome("Paulo"); 
		pedro.setCpf("11122233311"); 
		pedro.andar(); 
		pedro.parar(); 
		pedro.correr(); 
		pedro.falar(); 
		pedro.setRegistro("55533321"); 
		pedro.lecionar("Programação Orientada a Objeto");

		}

}
