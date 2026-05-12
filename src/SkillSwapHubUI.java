import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SkillSwapHubUI extends JFrame implements ActionListener {

    JButton addSkillBtn, searchBtn, exitBtn;

    public SkillSwapHubUI() {

        setTitle("SkillSwap Hub");
        setSize(950,650);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(10,10,30));

        // TITLE
        JLabel title = new JLabel("🚀 SKILLSWAP HUB");
        title.setBounds(240,30,500,50);
        title.setForeground(Color.CYAN);
        title.setFont(new Font("Arial", Font.BOLD, 38));
        add(title);

        JLabel subtitle = new JLabel("Connect • Learn • Grow");
        subtitle.setBounds(350,90,300,30);
        subtitle.setForeground(Color.WHITE);
        subtitle.setFont(new Font("Arial", Font.PLAIN, 20));
        add(subtitle);

        // CLOCK
        JLabel clock = new JLabel();
        clock.setBounds(40,40,150,30);
        clock.setForeground(Color.WHITE);
        clock.setFont(new Font("Arial", Font.BOLD, 18));
        add(clock);

        Timer t = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            clock.setText(sdf.format(new Date()));
        });
        t.start();

        // BUTTONS PANEL
        JPanel panel = new JPanel();
        panel.setBounds(650,180,250,320);
        panel.setBackground(new Color(25,25,50));
        panel.setLayout(null);
        add(panel);

        JLabel access = new JLabel("⚡ QUICK ACCESS");
        access.setBounds(20,20,200,30);
        access.setForeground(Color.YELLOW);
        panel.add(access);

        addSkillBtn = new JButton("➕ ADD SKILL");
        addSkillBtn.setBounds(30,90,180,40);
        addSkillBtn.addActionListener(this);
        panel.add(addSkillBtn);

        searchBtn = new JButton("🔍 SEARCH");
        searchBtn.setBounds(30,150,180,40);
        searchBtn.addActionListener(this);
        panel.add(searchBtn);

        exitBtn = new JButton("❌ EXIT");
        exitBtn.setBounds(30,210,180,40);
        exitBtn.addActionListener(this);
        panel.add(exitBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addSkillBtn) {
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
