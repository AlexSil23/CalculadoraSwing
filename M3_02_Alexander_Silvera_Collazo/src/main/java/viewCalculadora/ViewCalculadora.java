package viewCalculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.Getter;
import lombok.Setter;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewCalculadora.
 * @author Alexander Silvera
 */
@Getter
@Setter

public class ViewCalculadora extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The frame. */
	private JFrame frame;
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The txt resultado. */
	private JTextField txtResultado;
	
	/** The btn guardar. */
	private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPunto, btnBorrar, btnSuma, btnResta,
			btnMultiplicacion, btnDivision, btnMostrar, btnIgual, btnGuardar;
	
	/** The array btn. */
	private JButton arrayBtn[];

	/**
	 * Instantiates a new view calculadora.
	 */
	public ViewCalculadora() {
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarculaLaf");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		frame();
		panel();
		txtResultado();
		botton();
		frame.setVisible(true);
	}

	/**
	 * Configura y personaliza las propiedades del marco principal de la aplicación.
	 * Este método inicializa un {@link JFrame} con una serie de configuraciones
	 * como título, tamaño, posición y restricciones de redimensionamiento.
	 */
	private void frame() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/calculadora.png")));
		frame.setResizable(false);
		frame.setTitle("CALCULADORA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 267, 434);
		frame.setLocationRelativeTo(null);
	}

	/**
	 * Configura y personaliza el panel principal de contenido de la aplicación.
	 * Este método inicializa un {@link JPanel}, establece su diseño y margenes,
	 * y lo asigna como el contenido principal del marco.
	 */
	private void panel() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		frame.setContentPane(contentPane);
	}

	/**
	 * Configura y personaliza el campo de texto principal para mostrar los resultados
	 * y las entradas de la calculadora.
	 * Este método inicializa un {@link JTextField} y ajusta sus propiedades visuales 
	 * y funcionales, como su tamaño, alineación y fuente.
	 */
	private void txtResultado() {
		txtResultado = new JTextField();
		txtResultado.setBounds(10, 22, 230, 50);
		txtResultado.setEditable(false);
		txtResultado.setHorizontalAlignment(JTextField.RIGHT);
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(txtResultado);
	}

	/**
	 * Configura y personaliza todos los botones de la interfaz gráfica de la calculadora.
	 * Este método inicializa múltiples instancias de {@link JButton}, ajusta sus propiedades
	 * como posición, tamaño, texto y estilos, y los agrega al panel principal de contenido.
	 * También aplica un estilo uniforme a algunos botones específicos.
	 */
	private void botton() {
		btn0 = new JButton("0");
		btn0.setBounds(10, 338, 50, 50);
		btn1 = new JButton("1");
		btn1.setBounds(10, 277, 50, 50);
		btn2 = new JButton("2");
		btn2.setBounds(70, 277, 50, 50);
		btn3 = new JButton("3");
		btn3.setBounds(130, 277, 50, 50);
		btn4 = new JButton("4");
		btn4.setBounds(10, 216, 50, 50);
		btn5 = new JButton("5");
		btn5.setBounds(70, 216, 50, 50);
		btn6 = new JButton("6");
		btn6.setBounds(130, 216, 50, 50);
		btn7 = new JButton("7");
		btn7.setBounds(10, 155, 50, 50);
		btn8 = new JButton("8");
		btn8.setBounds(70, 155, 50, 50);
		btn9 = new JButton("9");
		btn9.setBounds(130, 155, 50, 50);
		btnPunto = new JButton(".");
		btnPunto.setBounds(70, 338, 50, 50);
		btnBorrar = new JButton("C");
		btnBorrar.setBounds(10, 94, 50, 50);
		btnGuardar = new JButton("G");
		btnGuardar.setBounds(70, 94, 50, 50);
		btnMostrar = new JButton("M");
		btnMostrar.setBounds(130, 94, 50, 50);
		btnSuma = new JButton("+");
		btnSuma.setBounds(190, 277, 50, 50);
		btnResta = new JButton("-");
		btnResta.setBounds(190, 216, 50, 50);
		btnMultiplicacion = new JButton("x");
		btnMultiplicacion.setBounds(190, 155, 50, 50);
		btnDivision = new JButton("/");
		btnDivision.setBounds(190, 94, 50, 50);
		btnIgual = new JButton("=");
		btnIgual.setBounds(130, 338, 110, 50);

//		contentPane.add(btn0);
//		contentPane.add(btn1);
//		contentPane.add(btn2);
//		contentPane.add(btn3);
//		contentPane.add(btn5);
//		contentPane.add(btn4);
//		contentPane.add(btn6);
//		contentPane.add(btn7);
//		contentPane.add(btn8);
//		contentPane.add(btn9);
//		contentPane.add(btnPunto);
//		contentPane.add(btnBorrar);
//		contentPane.add(btnMostrar);
//		contentPane.add(btnGuardar);
//		contentPane.add(btnSuma);
//		contentPane.add(btnResta);
//		contentPane.add(btnMultiplicacion);
//		contentPane.add(btnDivision);
//		contentPane.add(btnIgual);

		arrayBtn = new JButton[] { btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPunto, btnSuma,
				btnResta, btnMultiplicacion, btnDivision, btnIgual, btnBorrar, btnMostrar, btnGuardar };

	// FUENTE DE LOS BOTONES
		for (JButton jButton : arrayBtn) {
			contentPane.add(jButton);
			jButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		
		JButton estiloB[]= {btnSuma,
				btnResta, btnMultiplicacion, btnDivision, btnIgual, btnBorrar, btnMostrar, btnGuardar };
		
		for (JButton jButton : estiloB) {
			jButton.setBackground(Color.decode("#fece99"));
			jButton.setForeground(SystemColor.DARK_GRAY);			
		}
	}
	 
	/**
	 * Actualiza el texto mostrado en el campo de resultados de la calculadora.
	 *
	 * @param resultado el nuevo valor a mostrar en el campo de texto. 
	 *                  Este valor puede ser un número, un mensaje de error 
	 *                  o cualquier texto relevante para la calculadora.
	 */
 	public void actualizarResultado(String resultado) {
	        txtResultado.setText(resultado);
	    }
}
