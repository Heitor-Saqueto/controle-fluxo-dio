/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Heitor Saqueto
 */
public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("Error: "+e.getMessage());
		}catch(InputMismatchException e){
			System.out.println("Error: "+ e);
		}
		
	}
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois){
			throw  new ParametrosInvalidosException("Invalide entry");
		}else{

			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++){
				System.out.println("Imprimindo o número "+ i);
			}
		}
	}
}