package br.com.javamagazine.gc;

import java.io.IOException;

public interface Tabuada {
	public abstract void calcularTabuadas(String arquivoTabuada,
			int quantidadeNumeros, int... fatores) throws IOException;
}