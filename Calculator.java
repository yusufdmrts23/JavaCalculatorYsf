import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
  // Create text field for display
  private JTextField displayField = new JTextField();

  // Create button for each digit and operator
  private JButton button0 = new JButton("0");
  private JButton button1 = new JButton("1");
  private JButton button2 = new JButton("2");
  private JButton button3 = new JButton("3");
  private JButton button4 = new JButton("4");
  private JButton button5 = new JButton("5");
  private JButton button6 = new JButton("6");
  private JButton button7 = new JButton("7");
  private JButton button8 = new JButton("8");
  private JButton button9 = new JButton("9");
  private JButton buttonDot = new JButton(".");
  private JButton buttonEqual = new JButton("=");
  private JButton buttonPlus = new JButton("+");
  private JButton buttonMinus = new JButton("-");
  private JButton buttonMultiply = new JButton("*");
  private JButton buttonDivide = new JButton("/");
  private JButton buttonClear = new JButton("C");

  // Create a calculator engine
  private CalculatorEngine engine = new CalculatorEngine(this);

  public Calculator() {
    // Set up the display field and make it read-only
    displayField.setEditable(false);
    displayField.setHorizontalAlignment(JTextField.RIGHT);

    // Add action listeners to the buttons
    button0.addActionListener(engine);
    button1.addActionListener(engine);
    button2.addActionListener(engine);
    button3.addActionListener(engine);
    button4.addActionListener(engine);
    button5.addActionListener(engine);
    button6.addActionListener(engine);
    button7.addActionListener(engine);
    button8.addActionListener(engine);
    button9.addActionListener(engine);
    buttonDot.addActionListener(engine);
    buttonEqual.addActionListener(engine);
    buttonPlus.addActionListener(engine);
    buttonMinus.addActionListener(engine);
    buttonMultiply.addActionListener(engine);
    buttonDivide.addActionListener(engine);
    buttonClear.addActionListener(engine);

    // Create a panel for the buttons
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
    buttonPanel.add(button7);
    buttonPanel.add(button8);
    buttonPanel.add(button9);
    buttonPanel.add(buttonDivide);
    buttonPanel.add(button4);
    buttonPanel.add(button5);
    buttonPanel.add(button6);
    buttonPanel.add(buttonMultiply);
    buttonPanel.add(button1);
    buttonPanel.add(button2);
    buttonPanel.add(button3);
    buttonPanel.add(buttonMinus);
    buttonPanel.add(button0);
    buttonPanel.add(buttonDot);
    buttonPanel.add(buttonEqual);
    buttonPanel.add(buttonPlus);

// Set up the main frame
setLayout(new BorderLayout(5, 5));
add(displayField, BorderLayout.NORTH);
add(buttonPanel, BorderLayout.CENTER);
add(buttonClear, BorderLayout.SOUTH);

setTitle("Calculator");
setSize(200, 200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
  }

  public static void main(String[] args) {
    new Calculator();
  }

  public JTextField getDisplayField() {
    return displayField;
  }
}


