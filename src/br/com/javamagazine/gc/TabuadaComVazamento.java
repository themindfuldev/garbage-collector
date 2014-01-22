package br.com.javamagazine.gc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TabuadaComVazamento implements Tabuada {
	private Long[][] matrizTabuadas;

	@Override
	public void calcularTabuadas(String arquivoTabuada, int quantidadeNumeros,
			int... fatores) throws IOException {
		matrizTabuadas = new Long[quantidadeNumeros][fatores.length];
		criarTabuadas(quantidadeNumeros, fatores);
		imprimirTabuadas(arquivoTabuada, fatores);
	}

	private void criarTabuadas(int quantidadeNumeros, int... fatores) {
		for (int i = 0; i < quantidadeNumeros; i++) {
			for (int j = 0; j < fatores.length; j++) {
				matrizTabuadas[i][j] = new Long(i * fatores[j]);
			}
		}
	}

	private void imprimirTabuadas(String arquivoTabuada, int... fatores)
			throws IOException {
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
