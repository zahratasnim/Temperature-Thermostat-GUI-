import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThermostatFrame
{
    private JFrame frame;
    private JLabel tempDisp;
    private JPanel top_panel;
    private JButton up_button;
    private JButton down_button;
    private JButton exit_button;
    private int currTemp = 24;
    private int maxTemp = 30;
    private int minTemp = 12;
    
    
    public ThermostatFrame()
    {
        frame = new JFrame("Thermostat");
        tempDisp = new JLabel();
        tempDisp.setText("Current Temperature: "+currTemp);
        top_panel = new JPanel();
        top_panel.add(tempDisp);
        frame.getContentPane().add(top_panel, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
        
        up_button = new JButton("Increase");
        JPanel panel1 = new JPanel();
        panel1.add(up_button);
        frame.getContentPane().add(panel1, BorderLayout.EAST);
        up_button.addActionListener(e -> up());
        
        down_button = new JButton("Decrease");
        JPanel panel2 = new JPanel();
        panel2.add(down_button);
        frame.getContentPane().add(panel2, BorderLayout.WEST);
        down_button.addActionListener(e -> down());
        
        exit_button = new JButton("Exit");
        JPanel panel3 = new JPanel();
        panel3.add(exit_button);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);
        exit_button.addActionListener(e -> exit());
        
    }
    
    public void up()
    {
      if(currTemp<maxTemp)
      {
          currTemp++;
          tempDisp.setText("Current Temperature: "+currTemp);
      }
    }
    
    public void down()
    {
        if(currTemp>minTemp)
        {
           currTemp--;
           tempDisp.setText("Current Temperature: "+currTemp);
        }
    }
    
    public void exit()
    {
        System.exit(0);
    }
}