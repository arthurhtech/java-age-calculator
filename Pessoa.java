package javadoc;

import java.time.LocalDate;

/**
 * Classe para representar uma pessoa
 * 
 * Toda classe no java herda, por padrao, da classe ( @link java.lang.Object )
 * 
 * @author Arthur Pires
 */

public class Pessoa {
	
	/**
	 * O nome de uma pessoa.
	 */
	private String nome; //por padrao, campos privados nao terao Javadoc gerados para eles
	
	/** 
	 * A data de nascimento da pessoa
	 */
	private LocalDate dataNascimento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
}
