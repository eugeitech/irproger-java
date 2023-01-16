package com.itproger.program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    JTextField nameField, emailField;
    JRadioButton male;
    JRadioButton female;
    JCheckBox check;
    public ContactForm() {
        super("Contact Form");
        super.setBounds(200, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,3,2,10));

        JLabel name = new JLabel("Enter a name: ");
        nameField = new JTextField("", 1);
        JLabel email = new JLabel("Enter an email: ");
        emailField = new JTextField("@", 1);

        container.add(name);
        container.add(nameField);
        container.add(email);
        container.add(emailField);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        check = new JCheckBox("Are you sure?", false);
        JButton sendButton = new JButton("Send");

        male.setSelected(true);

        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(sendButton);

        sendButton.addActionListener(new ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String email = emailField.getText();

            String isMale = "Male";
            if(!male.isSelected())
                isMale = "Female";

            boolean checkBox = check.isSelected();

            JOptionPane.showMessageDialog(null,
                    "Your email " + email +
                            "\nYour sex: " + isMale +
                            "\nAre you sure? " + checkBox,
                    "Hi, " + name, JOptionPane.PLAIN_MESSAGE
            );
        }
    }
}
