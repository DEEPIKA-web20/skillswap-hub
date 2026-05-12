import javax.swing.*;
import java.awt.*;

public class SearchWindow extends JFrame {

    public SearchWindow() {

        setTitle("Search Skills");
        setSize(400,300);
        setLayout(new FlowLayout());

        String[] list = {
                "🎨 Graphic Designer",
                "🍰 Cake Baker",
                "💻 Java Developer",
                "📚 Tutor",
                "💄 Mehndi Artist"
        };

        for (String s : list) {
            add(new JLabel(s));
        }

        setVisible(true);
    }
}
