package screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Component
public abstract class ColorFrame extends JFrame {
    @Autowired
    private Color color;

    //TODO make new scope
    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1800), random.nextInt(900));
        getContentPane().setBackground(getColor());
    }

    protected abstract Color getColor();
}
