package dritter_block.ui;

import javax.swing.*;
import java.awt.*;

public class MichaPanel extends JPanel {

    public enum TYPE {
        CURVE
    }

    public static TYPE type;
    public static int a = 20;
    public static double b = 0.1;
    MichaPanel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
        setVisible(true);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        if (type == TYPE.CURVE) {
            int mid = getHeight()/2;
            int offset = 30;
            boolean up = false;
            for(int s = 0; s < getHeight()/a; s++) {
                for (int i = 0; i < getWidth(); i++) {
                    g.fillRect(i, (int)(s*a+(Math.sin(i*b)*a)), 1, 1);
                }
            }
        }
    }
}
