import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		
		int qtdeAlunos, qtdeAtual=1;
		int idade;
		double media=0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos:");
		qtdeAlunos = leitor.nextInt();
		
		while (qtdeAtual<=qtdeAlunos){
			System.out.println("Informe a idade do " + qtdeAtual + "� aluno");
			idade = leitor.nextInt();
			media = media + idade;
			
			qtdeAtual++;
		}
		
		media = media/(double) qtdeAlunos;
		
		System.out.println("A m�dias das idades � " + media);
		
		leitor.close();

	}

}
