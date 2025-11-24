package javadoc.calculos;

import java.time.LocalDate;
import java.time.Period;

import javadoc.exception.AnoInvalidoException;
import javadoc.exception.DiaInvalidoException;
import javadoc.exception.MesInvalidoException;

public class CalculosParaIdade {
	
	private static String mensagemDiaInvalido = "Por favor, informe um dia valido";
	private static String mensagemMesInvalido = "Por favor, informe um mes valido";
	private static String mensagemAnoInvalido = "Por favor, informe um ano valido";
	
	/**
	 * 
	 * Metodo para retornar uma exceção se a data de nascimento estiver incorreta
	 * 
	 * @param dia dia do nascimento
	 * @param mes mes do nascimento
	 * @param ano ano do nascimento
	 * @return um objeto da classe ( @link java.time.LocalDate) representando a data de nascimento formada
	 * @throws DiaInvalidoException exceção que representa um dia invalido informado
	 * @throws MesInvalidoException exceção que representa um mes invalido informado
	 * @throws AnoInvalidoException exceção que representa um ano invalido informado
	 */
	public static LocalDate retornaDataNascimento(int dia, int mes, int ano) throws DiaInvalidoException, MesInvalidoException, AnoInvalidoException {
		if (dia < 1 || dia > 31) {
			throw new DiaInvalidoException(mensagemDiaInvalido);
		} else if (mes < 1 || mes > 12) {
			throw new MesInvalidoException(mensagemMesInvalido);
		} else if (ano < 1900 || ano > LocalDate.now().getYear()) {
			throw new AnoInvalidoException(mensagemAnoInvalido);
		}
		return LocalDate.of(ano, mes, dia);
	}
	
	public static int calcularIdade(LocalDate dataNascimento) {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}
}