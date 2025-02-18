package modelCalculadora;

import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelCalculadora.
 * @author Alexander Silvera
 */
@Getter
@Setter

public class ModelCalculadora {
	
	/** The operando 1. */
	private double num1;
	
	/** The operando 2. */
	private double num2;
		
	/** The operador. */
	private char signo;

	/**
	 * Instantiates a new model calculadora.
	 */
	public ModelCalculadora() {
		num1 = 0;
		num2 = 0;
		signo = ' ';
	}

	/**
	 * Calcular.
	 *
	 * Calcula el resultado de una operación matemática básica (suma, resta, multiplicación o división)
	 * según el signo de la operación especificado.
	 *
	 * @return el resultado de la operación como un número de tipo {@code double}.
	 *         Si el signo no coincide con ninguna operación válida, se devuelve 0.
	 */
	public double calcular() {
		double resultado = 0;

		switch (signo) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case 'x':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		default:
		}

		return resultado;
	}
}
