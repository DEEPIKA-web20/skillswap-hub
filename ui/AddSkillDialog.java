import javax.swing.*;
import java.awt.*;

public class AddSkillDialog extends JFrame {

    public AddSkillDialog() {

        setTitle("Add Skill");
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(50,50,100,30);
        add(l1);

        JTextField name = new JTextField();
        name.setBounds(150,50,150,30);
        add(name);

        JLabel l2 = new JLabel("Skill");
        l2.setBounds(50,100,100,30);
        add(l2);

        JTextField skill = new JTextField();
        skill.setBounds(150,100,150,30);
        add(skill);

        JLabel l3 = new JLabel("Contact");
        l3.setBounds(50,150,100,30);
        add(l3);

        JTextField contact = new JTextField();
        contact.setBounds(150,150,150,30);
        add(contact);

        JButton btn = new JButton("Submit");
        btn.setBounds(120,200,100,30);
        add(btn);

        btn.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Skill Added!")
        );

        setVisible(true);
    }
}
