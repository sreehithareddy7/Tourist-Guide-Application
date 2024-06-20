package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame {
    String username;

    public static void main(String[] args) {
        new Home("").setVisible(true);
    }

    public Home(String username) {
        super("Travel Guide");
        this.username = username;
        setForeground(Color.CYAN);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dest9.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

        JLabel l1 = new JLabel("Tourist Guide Application");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
        l1.setBounds(500, 60, 1000, 100);
        NewLabel.add(l1);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        
        

 

        

        JMenu m2 = new JMenu("PACKAGES");
        m2.setForeground(Color.RED);
        menuBar.add(m2);

        JMenuItem mi6 = new JMenuItem("CHECK PACKAGE");
        m2.add(mi6);


        mi6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CheckPackage().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JMenu m3 = new JMenu("HOTELS");
        m3.setForeground(Color.BLUE);
        menuBar.add(m3);

        JMenuItem mi9 = new JMenuItem("VIEW HOTELS");
        m3.add(mi9);
        

        mi9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CheckHotels().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JMenu m4 = new JMenu("DESTINATION");
        m4.setForeground(Color.RED);
        menuBar.add(m4);

        JMenuItem mi11 = new JMenuItem("DESTINATION");
        m4.add(mi11);

        mi11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Destination().setVisible(true);
            }
        });
        
        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.BLUE);
        menuBar.add(m7);

        JMenuItem mi15 = new JMenuItem("ABOUT");
        m7.add(mi15);

        mi15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new About().setVisible(true);
            }
        });

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
