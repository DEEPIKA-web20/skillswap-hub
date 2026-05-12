import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SkillSwapHubUI extends JFrame implements ActionListener {

    JButton addBtn, searchBtn, exitBtn;

    public SkillSwapHubUI() {

        setTitle("SkillSwap Hub");
        setSize(900, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(15, 15, 40));

        JLabel title = new JLabel("🚀 SkillSwap Hub");
        title.setBounds(300, 30, 400, 40);
        title.setForeground(Color.CYAN);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        add(title);

        addBtn = new JButton("Add Skill");
        addBtn.setBounds(100, 150, 150, 40);
        addBtn.addActionListener(this);
        add(addBtn);

        searchBtn = new JButton("Search Skills");
        searchBtn.setBounds(100, 220, 150, 40);
        searchBtn.addActionListener(this);
        add(searchBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(100, 290, 150, 40);
        exitBtn.addActionListener(this);
        add(exitBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addBtn) {
            new AddSkillDialog();
        }

        else if (e.getSource() == searchBtn) {
            new SearchWindow();
        }

        else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }
}
