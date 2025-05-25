import java.awt.*;
import java.awt.event.*;

public class AbstractWindowToolkit extends Frame
        implements ActionListener, ItemListener, AdjustmentListener, TextListener {

    // Components
    Label label;
    Button button;
    TextField textField;
    TextArea textArea;
    Checkbox checkbox;
    CheckboxGroup radioGroup;
    Checkbox radio1, radio2;
    Choice choice;
    List list;
    Scrollbar scrollbar;

    public AbstractWindowToolkit() {
        // Frame properties
        setTitle("AWT Example - AbstractWindowToolkit");
        setSize(600, 500);
        setLayout(null); // Absolute positioning
        setVisible(true);

        // Close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the frame
            }
        });

        // Label
        label = new Label("AWT Demo Label");
        label.setBounds(50, 50, 200, 20);
        add(label);

        // TextField
        textField = new TextField();
        textField.setBounds(50, 80, 200, 20);
        textField.addTextListener(this);
        add(textField);

        // TextArea
        textArea = new TextArea("Type here...", 5, 30);
        textArea.setBounds(50, 110, 300, 100);
        add(textArea);

        // Button
        button = new Button("Click Me");
        button.setBounds(270, 80, 100, 30);
        button.addActionListener(this);
        add(button);

        // Checkbox
        checkbox = new Checkbox("I agree");
        checkbox.setBounds(50, 220, 100, 20);
        checkbox.addItemListener(this);
        add(checkbox);

        // Radio buttons using CheckboxGroup
        radioGroup = new CheckboxGroup();
        radio1 = new Checkbox("Male", radioGroup, false);
        radio2 = new Checkbox("Female", radioGroup, false);
        radio1.setBounds(50, 250, 80, 20);
        radio2.setBounds(140, 250, 80, 20);
        radio1.addItemListener(this);
        radio2.addItemListener(this);
        add(radio1);
        add(radio2);

        // Choice (dropdown)
        choice = new Choice();
        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        choice.setBounds(50, 280, 100, 20);
        choice.addItemListener(this);
        add(choice);

        // List (multi-select)
        list = new List(4, true);
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.setBounds(50, 310, 100, 60);
        list.addItemListener(this);
        add(list);

        // Scrollbar
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
        scrollbar.setBounds(50, 380, 200, 20);
        scrollbar.addAdjustmentListener(this);
        add(scrollbar);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = textField.getText();
            textArea.append("\nButton Clicked! You typed: " + text);
        }
    }

    // Handle checkbox, radio, list, and choice changes
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == checkbox) {
            textArea.append("\nCheckbox state: " + checkbox.getState());
        } else if (source == radio1 || source == radio2) {
            textArea.append("\nSelected Gender: " + radioGroup.getSelectedCheckbox().getLabel());
        } else if (source == choice) {
            textArea.append("\nSelected Language: " + choice.getSelectedItem());
        } else if (source == list) {
            String[] selectedItems = list.getSelectedItems();
            textArea.append("\nSelected Fruits: " + String.join(", ", selectedItems));
        }
    }

    // Handle scrollbar movement
    public void adjustmentValueChanged(AdjustmentEvent e) {
        label.setText("Scrollbar Value: " + scrollbar.getValue());
    }

    // Handle text field changes
    public void textValueChanged(TextEvent e) {
        label.setText("Typing: " + textField.getText());
    }

    public static void main(String[] args) {
        new AbstractWindowToolkit();
    }
}
