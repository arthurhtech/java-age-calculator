package javadoc;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import javadoc.calculos.CalculosParaIdade;
import javadoc.exception.AnoInvalidoException;
import javadoc.exception.DiaInvalidoException;
import javadoc.exception.MesInvalidoException;

public class Main {

	public static void main(String[] args) throws DiaInvalidoException,  MesInvalidoException, AnoInvalidoException {
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
		String dia = JOptionPane.showInputDialog("Digite o dia de seu aniversario da pessoa: ");
		String mes = JOptionPane.showInputDialog("Digite o mes de seu aniversario da pessoa: ");
		String ano = JOptionPane.showInputDialog("Digite o ano de seu aniversario da pessoa: ");
		
		LocalDate dataNascimento = CalculosParaIdade.retornaDataNascimento(
				Integer.parseInt(dia),
				Integer.parseInt(mes),
				Integer.parseInt(ano));
				
				Pessoa pessoa = new Pessoa(nome, dataNascimento);
				
				JOptionPane.showMessageDialog(null, pessoa.getNome() + " possui "
						+ CalculosParaIdade.calcularIdade(pessoa.getDataNascimento())
						+ " anos de idade");
	}
	
}
