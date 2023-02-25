import javax.swing.*;

public class JAVA_ISE_CODE_2 extends JFrame {
    private JLabel chemLabel, physLabel, totalLabel;
    private JTextField chemField, physField, totalField;
    private JButton calculateButton;

    public JAVA_ISE_CODE_2() {
        setTitle("Marks Calculator");
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        chemLabel = new JLabel("Chemistry Marks:");
        physLabel = new JLabel("Physics Marks:");
        totalLabel = new JLabel("Total:");

        chemField = new JTextField(10);
        physField = new JTextField(10);
        totalField = new JTextField(10);
        totalField.setEditable(false);

        chemLabel = new JLabel("Chemistry Marks:");
        physLabel = new JLabel("Physics Marks:");
        totalLabel = new JLabel("Total:");

        calculateButton = new JButton("Total");
        calculateButton.addActionListener(e -> calculateTotal());

        JPanel panel = new JPanel();
        panel.add(chemLabel);
        panel.add(chemField);
        panel.add(physLabel);
        panel.add(physField);
        panel.add(totalLabel);
        panel.add(totalField);
        panel.add(calculateButton);
        add(panel);
        setVisible(true);
    }
    private void calculateTotal() {
        int chemMarks = Integer.parseInt(chemField.getText());
        int physMarks = Integer.parseInt(physField.getText());
        int total = chemMarks + physMarks;
        totalField.setText(Integer.toString(total));
    }
    public static void main(String[] args) {
        new JAVA_ISE_CODE_2();
    }
}
