import javax.swing.*;
import java.awt.*;

public class AddSkillDialog extends JFrame {

    public AddSkillDialog() {

        setTitle("Add Skill");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel n1 = new JLabel("Name");
        n1.setBounds(50, 50, 100, 30);
        add(n1);

        JTextField name = new JTextField();
        name.setBounds(150, 50, 150, 30);
        add(name);

        JLabel n2 = new JLabel("Skill");
        n2.setBounds(50, 100, 100, 30);
        add(n2);

        JTextField skill = new JTextField();
        skill.setBounds(150, 100, 150, 30);
        add(skill);

        JLabel n3 = new JLabel("Contact");
        n3.setBounds(50, 150, 100, 30);
        add(n3);

        JTextField contact = new JTextField();
        contact.setBounds(150, 150, 150, 30);
        add(contact);

        JButton save = new JButton("Save");
        save.setBounds(130, 200, 100, 30);
        add(save);

        save.addActionListener(e -> {

            Skill s = new Skill(
                    name.getText(),
                    skill.getText(),
                    contact.getText()
            );

            SkillManager.addSkill(s);

            JOptionPane.showMessageDialog(this, "Skill Added!");
        });

        setVisible(true);
    }
}
