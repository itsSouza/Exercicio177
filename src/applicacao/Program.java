package applicacao;

import java.util.Locale;
import java.util.Scanner;

import model.entidades.Conta;
import model.excecoes.DominioExcecao;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Digite os dados da conta");
			
			System.out.print("Numero de id da conta: ");
			int id = sc.nextInt();
			System.out.print("Nome do titular: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Saldo inicial da conta: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			
			Conta conta = new Conta(id, nome, saldo, limiteSaque);
			
			System.out.println();
			System.out.print("Digite o valor que deseja sacar: ");
			double valor = sc.nextDouble();
			
			conta.saque(valor);
			System.out.println("Novo saldo: $ " + String.format("%.2f", conta.getSaldo()));
		}
		catch(DominioExcecao e) {
			System.out.println("Erro no saque: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
