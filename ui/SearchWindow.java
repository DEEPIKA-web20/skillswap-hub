import javax.swing.*;
import java.awt.*;

public class SearchWindow extends JFrame {

    public SearchWindow() {

        setTitle("Search Skills");
        setSize(400, 300);
        setLayout(new FlowLayout());

        for (Skill s : SkillManager.getSkills()) {

            JLabel label = new JLabel(
                    s.name + " - " + s.skill + " - " + s.contact
            );

            add(label);
        }

        setVisible(true);
    }
}
