package dritter_block.ui;
import javax.swing.*;
import java.awt.*;

public class MichaFrame extends JFrame {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    MichaPanel canvas;
    MichaFrame() {
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.pack();
        this.setSize(WIDTH,HEIGHT);
        final Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Hello");
        final Container cp = getContentPane();
        cp.setLayout(null);
        canvas = new MichaPanel(null, true);
        canvas.setSize(getWidth(),getHeight());
        canvas.setLocation(0,0);
        this.add(canvas);
        this.setVisible(true);
        MichaPanel.type = MichaPanel.TYPE.CURVE;
        canvas.paintComponent(canvas.getGraphics());
    }

}
