import java.awt.event.*;

public class CalculatorEngine implements ActionListener {
  private Calculator parent;
  private double result;
  private String lastCommand;
  private boolean start;

  public CalculatorEngine(Calculator parent) {
    this.parent = parent;
  }

  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();

    if (command.equals("0") ||
        command.equals("1") ||
        command.equals("2") ||
        command.equals("3") ||
        command.equals("4") ||
        command.equals("5") ||
        command.equals("6") ||
        command.equals("7") ||
        command.equals("8") ||
        command.equals("9") ||
        command.equals(".")) {
      if (start) {
        parent.getDisplayField().setText("");
        start = false;
      }
      parent.getDisplayField().setText(parent.getDisplayField().getText() + command);
    } else {
      if (start) {
        if (command.equals("=")) {
          parent.getDisplayField().setText(lastCommand);
        } else {
          lastCommand = parent.getDisplayField().getText();
          parent.getDisplayField().setText("");
        }
      } else {
        start = true;
        if (lastCommand.equals("+")) {
          result += Double.parseDouble(parent.getDisplayField().getText());
        } else if (lastCommand.equals("-")) {
          result -= Double.parseDouble(parent.getDisplayField().getText());
        } else if (lastCommand.equals("*")) {
          result *= Double.parseDouble(parent.getDisplayField().getText());
        } else if (lastCommand.equals("/")) {
          result /= Double.parseDouble(parent.getDisplayField().getText());
        } else{
  result = Double.parseDouble(parent.getDisplayField().getText());
}
lastCommand = command;
parent.getDisplayField().setText("");
  }
}

