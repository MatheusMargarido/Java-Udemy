package model.exceptions;

// CRIEI UM PACOTE CHAMADO DE EXCESSOES E INDIQUEI QUE ELE É HERANÇA DO RUNTIMEXCEPTION
// RUNTIMEEXCEPTION é uma exceção não verificada em Java, o que significa que não é obrigatório tratá-la ou declará-la no método em que ela ocorre.

public class DomainException extends RuntimeException {

	// Este é um campo estático final que representa o número de versão da classe. O
	// serialVersionUID é usado para garantir que a versão serializada da classe
	// seja compatível entre diferentes versões do programa. Se você não fornecer
	// explicitamente um serialVersionUID, o compilador Java gerará um
	// automaticamente com base nas características da classe. Atribuir um valor
	// fixo (como neste caso) é uma prática comum para evitar problemas de
	// serialização em diferentes ambientes.

	private static final long serialVersionUID = 1L;

	// Este é o construtor da classe DomainException. Ele aceita uma mensagem como
	// parâmetro, que é uma descrição ou explicação da exceção. O construtor chama o
	// construtor da superclasse (RuntimeException) passando essa mensagem, e a
	// superclasse se encarrega do restante do processo de inicialização da exceção.
	
	public DomainException(String msg) {
		super(msg);
	}

}
