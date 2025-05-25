import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing extends JFrame implements ActionListener, ItemListener, AdjustmentListener, KeyListener {
    // Components
    JLabel label;
    JTextField textField;
    JTextArea textArea;
    JButton button;
    JCheckBox checkBox;
    JRadioButton radio1, radio2;
    ButtonGroup genderGroup;
    JComboBox<String> comboBox;
    JList<String> list;
    JScrollBar scrollBar;
    JSlider slider;

    public Swing() {
        // Frame settings
        setTitle("Swing Component Demo");
        setSize(700, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(245, 245, 255));

        // Label
        label = new JLabel("Swing Components Demo");
        label.setBounds(20, 20, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        add(label);

        // TextField
        textField = new JTextField();
        textField.setBounds(20, 60, 200, 25);
        textField.setToolTipText("Enter some text");
        textField.addKeyListener(this);
        add(textField);

        // TextArea with ScrollPane
        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(20, 95, 300, 80);
        textArea.setLineWrap(true);
        add(scrollPane);

        // Button
        button = new JButton("Click Me");
        button.setBounds(240, 60, 100, 25);
        button.addActionListener(this);
        add(button);

        // CheckBox
        checkBox = new JCheckBox("Accept Terms");
        checkBox.setBounds(20, 190, 150, 25);
        checkBox.addItemListener(this);
        add(checkBox);

        // Radio Buttons
        radio1 = new JRadioButton("Male");
        radio2 = new JRadioButton("Female");
        radio1.setBounds(20, 220, 80, 25);
        radio2.setBounds(110, 220, 100, 25);
        genderGroup = new ButtonGroup();
        genderGroup.add(radio1);
        genderGroup.add(radio2);
        radio1.addItemListener(this);
        radio2.addItemListener(this);
        add(radio1);
        add(radio2);

        // ComboBox (Dropdown)
        comboBox = new JComboBox<>(new String[] { "Java", "Python", "C++" });
        comboBox.setBounds(20, 260, 150, 25);
        comboBox.addItemListener(this);
        add(comboBox);

        // JList with ScrollPane
        list = new JList<>(new String[] { "Apple", "Banana", "Cherry", "Mango" });
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setBounds(20, 300, 150, 80);
        add(listScroll);

        // JScrollBar
        scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 100);
        scrollBar.setBounds(20, 400, 200, 20);
        scrollBar.addAdjustmentListener(this);
        add(scrollBar);

        // JSlider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 25);
        slider.setBounds(20, 430, 200, 50);
        slider.setMajorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(slider);

        // Make frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String name = textField.getText();
            textArea.append("Hello, " + name + "!\n");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getItemSelectable();
        if (source == checkBox) {
            textArea.append("Checkbox: " + checkBox.isSelected() + "\n");
        } else if (source == radio1 || source == radio2) {
            String gender = radio1.isSelected() ? "Male" : "Female";
            textArea.append("Selected Gender: " + gender + "\n");
        } else if (source == comboBox) {
            textArea.append("Language: " + comboBox.getSelectedItem() + "\n");
        }
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        label.setText("Scrollbar Value: " + scrollBar.getValue());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Typing: " + textField.getText() + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new Swing();
    }
}
