import java.util.Scanner;

public class LoopWhileSugestaoJoao {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		
		int qtdeAlunos=0;
		int idade=0;
		double media=0;
		String continuar = "sim";
		
		Scanner leitor = new Scanner(System.in);
				
		while (continuar.equalsIgnoreCase("sim")){
			System.out.println("Informe a idade do " + (qtdeAlunos+1) + "� aluno ");
			idade = leitor.nextInt();
			media = media + idade;
			
			qtdeAlunos++;
			
			System.out.println("Digite sim para informar outro aluno ou n�o para relizar a m�dia com os dados j� informados");
			continuar = leitor.next();

		}
		
		media = media/(double) qtdeAlunos;
		
		System.out.println("A m�dias das idades � " + media);
		
		leitor.close();

	}

}
