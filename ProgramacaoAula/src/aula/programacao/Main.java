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
		luiz.estudar("Java OO...");
				

		}

}
