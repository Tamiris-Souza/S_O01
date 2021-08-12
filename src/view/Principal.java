package view;
import controller.OperacoesController;



public class Principal {

	public static void main(String[] args) {
	OperacoesController op = new OperacoesController();
//	op.concatenaString();
//	op.concatenaBuffer();
	
	String frase = "Olá turma do terceiro semestre de ADS da Fatec ZL";
	op.divideFrase(frase);
	}

}
/*
 <f11>  - Run in debug mod
 <ctrl + /> - comenta linha toda
 <ctrl + f11> - Run
 <ctrl + s> salva a classe ativa
 <ctrl + shift + s> - salva todas as classes abertas
 */
