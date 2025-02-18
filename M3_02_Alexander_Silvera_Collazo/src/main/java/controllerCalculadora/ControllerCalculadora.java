package controllerCalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import modelCalculadora.ModelCalculadora;
import viewCalculadora.ViewCalculadora;

// TODO: Auto-generated Javadoc
/**
 * The Class ControllerCalculadora.
 * 
 * @author Alexander Silvera
 */
public class ControllerCalculadora implements ActionListener {

	/** The view. */
	private ViewCalculadora view;

	/** The model. */
	private ModelCalculadora model;

	/** The guardar. */
	private String guardar = "";

	private int cont = 0;

	/**
	 * Instantiates a new controller calculadora.
	 */
	public ControllerCalculadora() {
		this.view = new ViewCalculadora();
		this.model = new ModelCalculadora();

		JButton botton[] = view.getArrayBtn();
		for (int i = 0; i < botton.length; i++) {
			((JButton) (botton[i])).addActionListener(this);
		}
	}

	/**
	 * Maneja los eventos de acción generados por la interfaz de usuario,
	 * actualizando el modelo y la vista de acuerdo con el comando ejecutado.
	 *
	 * @param e el evento de acción que contiene información sobre la acción
	 *          realizada.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		switch (action) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			view.actualizarResultado(view.getTxtResultado().getText() + action);
			break;
		case ".":
			if (cont == 0) {
				view.actualizarResultado(view.getTxtResultado().getText() + action);
				cont++;
			}
			break;
		case "+":
		case "-":
		case "x":
		case "/":
			cont = 0;
			try {
				model.setNum1(Double.parseDouble(view.getTxtResultado().getText()));
			} catch (NumberFormatException ex) {
				model.setNum1(0);
			}
			model.setSigno(action.charAt(0));
			view.actualizarResultado("");
			break;
		case "=":
			try {
				model.setNum2(Double.parseDouble(view.getTxtResultado().getText()));
			} catch (NumberFormatException ex) {
				if (model.getSigno() == '+' || model.getSigno() == '-') {
					model.setNum2(0);
				} else {
					model.setNum2(1);
				}
			}
			double resultado = model.calcular();
			view.actualizarResultado(Double.toString(resultado));
			break;
		case "C":
			model.setNum1(0);
			model.setNum2(0);
			model.setSigno(' ');
			cont = 0;
			view.actualizarResultado("");
			break;
		case "G":
				guardar = view.getTxtResultado().getText();
			break;
		case "M":
			if (isPunto(guardar)) {
				cont = 1;
			}
			view.actualizarResultado(guardar);
			break;
		}
	}

	/**
	 * Verifica si la cadena dada contiene un carácter de punto ('.').
	 * 
	 * @param str la cadena en la que se verificará la presencia de un carácter de
	 *            punto.
	 * @return {@code true} si la cadena contiene un carácter de punto;
	 *         {@code false} en caso contrario.
	 */
	private boolean isPunto(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') {
				return true;
			}
		}
		return false;
	}
}
