import java.util.Scanner;

public class LoopWhileSugestaoJoao {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		
		int qtdeAlunos=0;
		int idade=0;
		double media=0;
		String continuar = "sim";
		
		Scanner leitor = new Scanner(System.in);
				
		while (continuar.equalsIgnoreCase("sim")){
			System.out.println("Informe a idade do " + (qtdeAlunos+1) + "º aluno ");
			idade = leitor.nextInt();
			media = media + idade;
			
			qtdeAlunos++;
			
			System.out.println("Digite sim para informar outro aluno ou não para relizar a média com os dados já informados");
			continuar = leitor.next();

		}
		
		media = media/(double) qtdeAlunos;
		
		System.out.println("A médias das idades é " + media);
		
		leitor.close();

	}

}
