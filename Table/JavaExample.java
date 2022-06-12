import javax.swing.*;

public class JavaExample {
public static void main(String[] args) {

JFrame jFrame = new JFrame();

String[][] tableData = {{"01", "Adam"},
{"02", "John"},
{"03", "Sam"},
{"04", "Derek"},
{"05", "Ben"}};

String[] tableColumn = {"ID", "FIRST NAME"};

JTable jTable = new JTable(tableData, tableColumn);

jTable.setBounds(30, 40, 230, 280);

JScrollPane jScrollPane = new JScrollPane(jTable);
jFrame.add(jScrollPane);
jFrame.setSize(350, 300);
jFrame.setVisible(true);
}
}