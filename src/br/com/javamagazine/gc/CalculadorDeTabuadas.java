package br.com.javamagazine.gc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;

public class CalculadorDeTabuadas {

	public static void main(String[] args) throws Exception {
		// PID para jconsole
		if (ManagementFactory.getRuntimeMXBean() != null) {
		System.out.println("PID = "
				+ ManagementFactory.getRuntimeMXBean().getName());
		}

		// Argumentos
		if (args.length != 1) {
			System.out
					.println("Uso: CalculadorDeTabuadas <classe implementacao de Tabuada>");
			return;
		}

		@SuppressWarnings("unchecked")
		Class<Tabuada> implementacaoDeTabuada = (Class<Tabuada>) Class
				.forName(args[0]);
		int tamanhoDaTabuada = 1000000;

		// Pausa inicial
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();

		// Primeiro calculo e pausa
		System.out.println("Primeiro calculo: 1 a 10");
		Tabuada tabuada1 = (Tabuada) implementacaoDeTabuada.newInstance();
		tabuada1.calcularTabuadas("tabuada1.txt", tamanhoDaTabuada, new int[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		br.readLine();

		// Segundo calculo e pausa
		System.out.println("Segundo calculo: 11 a 20");
		Tabuada tabuada2 = (Tabuada) implementacaoDeTabuada.newInstance();
		tabuada2.calcularTabuadas("tabuada2.txt", tamanhoDaTabuada, new int[] {
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20 });
		br.readLine();

		// Terceiro calculo e pausa
		System.out.println("Terceiro calculo: 21 a 30");
		Tabuada tabuada3 = (Tabuada) implementacaoDeTabuada.newInstance();
		tabuada3.calcularTabuadas("tabuada3.txt", tamanhoDaTabuada, new int[] {
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30 });
		br.readLine();

		// Quarto calculo e pausa
		System.out.println("Quarto calculo: 31 a 40");
		Tabuada tabuada4 = (Tabuada) implementacaoDeTabuada.newInstance();
		tabuada4.calcularTabuadas("tabuada4.txt", tamanhoDaTabuada, new int[] {
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40 });
		br.readLine();

	}

}
