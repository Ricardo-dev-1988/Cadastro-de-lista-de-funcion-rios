package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		List<Funcionario> listFunc = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("\nFuncionário #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(checagemId(listFunc, id)) {
				System.out.println("ESSE ID JÁ EXISTE! TENTE NOVAMENTE!");
				System.out.println("\nFuncionário #" + (i + 1) + ":");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: R$ ");
			Double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			listFunc.add(func);
		}
		
		Integer pos = 0;
		do {
			System.out.print("\nInforme o ID do funcionário que terá aumento salarial: ");
			int idSalario = sc.nextInt();
			pos = posicao(listFunc, idSalario);
		
			if(pos == null) {
				System.out.println("Esse ID não existe!");			
			}
			else {
				System.out.print("Digite um valor de porcentagem para o aumento: ");
				Double porcentagem = sc.nextDouble();
				listFunc.get(pos).aumentoSalario(porcentagem);
			}	
			
		} while(pos == null);
		
		System.out.println("\nLISTA DE FUNCIONÁRIOS:");
		for(Funcionario func : listFunc) {
			System.out.println(func);
		}
		
		sc.close();
	}
	
	public static Integer posicao(List<Funcionario> listF, int id) {
		for(int i = 0; i < listF.size(); i++) {
			if(listF.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean checagemId(List<Funcionario> listF, int id) {
		Funcionario func = listF.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
	
} 