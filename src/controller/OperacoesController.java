package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
}
	//Concatena 32768 caracteres, 1 a 1, em uma variavel string
	public void concatenaString() {
	String cadeia ="";
	double tempoInicial = System.nanoTime(); //<ctrl + 1>
	for (int i = 0 ; i < 32768 ; i++) {
		cadeia = cadeia + "a";
	}
	double tempoFinal = System.nanoTime();
	double tempoTotal = tempoFinal - tempoInicial;
	//tempoTotal nS - 10^-9 s
	tempoTotal  = tempoTotal /Math.pow(10, 9);
	System.out.println("String ==> "+tempoTotal+"s.");
	}
	//Concatena  32768 caracteres,1 a 1, em um buffer de Strings
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime(); //<ctrl + 1>
		for (int i = 0 ; i < 32768 ; i++) {
			buffer.append("a");
		
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal nS - 10^-9 s
		tempoTotal  = tempoTotal /Math.pow(10, 9);
		System.out.println("Buffer ==> "+tempoTotal+"s.");
	}
	//Receba uma frase, divide em palavras, imprime em cada palavra
	public void divideFrase(String frase) {
		String[] vetorPalavras = frase.split(" ");
	//	int length = vetorPalavra.length;
	//	for (int = 0 ; i < length; i++) {}
		//foreach - for (TipoDado var: vetor)
		for (String palavra: vetorPalavras) {
			System.out.println(palavra);
			
		}
		
	}
}
//<ctrl + d> - apaga a linha toda
//Olá turma do terceiro semestre de ADS da Fatec ZL
//Olá turma
//Olá pessoal do ADS