import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu
{
    public Menu()
    {
        JFrame frame = new JFrame("Menu");
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        
        frame.getContentPane().add(menubar);
        frame.pack();
        frame.setVisible(true);
        
    }
}