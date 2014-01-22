package br.com.javamagazine.gc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TabuadaSemVazamento implements Tabuada {

	public void calcularTabuadas(String arquivoTabuada, int quantidadeNumeros,
			int... fatores) throws IOException {
		Long[][] matrizTabuadas = new Long[quantidadeNumeros][fatores.length];
		criarTabuadas(matrizTabuadas, quantidadeNumeros, fatores);
		imprimirTabuadas(arquivoTabuada, matrizTabuadas, fatores);
	}

	private void criarTabuadas(Long[][] matrizTabuadas, int quantidadeNumeros,
			int... fatores) {
		for (int i = 0; i < quantidadeNumeros; i++) {
			for (int j = 0; j < fatores.length; j++) {
				matrizTabuadas[i][j] = new Long(i * fatores[j]);
			}
		}
	}

	private void imprimirTabuadas(String arquivoTabuada,
			Long[][] matrizTabuadas, int... fatores) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoTabuada));
		for (int i = 0; i < matrizTabuadas.length; i++) {
			for (int j = 0; j < fatores.length; j++) {
				bw.append(i + "*" + fatores[j] + "=" + matrizTabuadas[i][j]
						+ "\t");
			}
		}
		bw.close();
	}
}
