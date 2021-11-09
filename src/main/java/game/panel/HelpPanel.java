package game.panel;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class HelpPanel extends JFrame {
    public HelpPanel() throws IOException {
        super("How to Use");
        setSize(600, 880);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        //setAlwaysOnTop(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        //popup.pack();
        JPanel one = new JPanel(), two = new JPanel(),three = new JPanel(), four = new JPanel(), five = new JPanel(), six = new JPanel(), seven = new JPanel(), eight = new JPanel();
        one.setSize(getWidth(), getHeight());

        JLabel page1 = new JLabel();
        page1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Rules/0001.jpg")));
        one.add(page1);
        JLabel page2 = new JLabel();
        page2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Rules/0002.jpg")));
        two.add(page2);
        JLabel page3 = new JLabel();
        page3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Rules/0003.jpg")));
        three.add(page3);
        JLabel page4 = new JLabel();
        page4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Rules/0004.jpg")));
        four.add(page4);
        JLabel page5 = new JLabel();
        page5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Rules/0005.jpg")));
        five.add(page5);
        JLabel page6 = new JLabel();
        page6.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Rules/0006.jpg")));
        six.add(page6);
        JLabel page7 = new JLabel();
        page7.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Rules/0007.jpg")));
        seven.add(page7);
        JLabel page8 = new JLabel();
        page8.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Rules/0008.jpg")));
        eight.add(page8);



        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(0, 0, getWidth(), getHeight());
        tp.addTab("Page 1", one);
        tp.addTab("Page 2", two);
        tp.addTab("Page 3", three);
        tp.addTab("Page 4", four);
        tp.addTab("Page 5", five);
        tp.addTab("Page 6", six);
        tp.addTab("Page 7", seven);
        tp.addTab("Page 8", eight);
        tp.setMnemonicAt(0,KeyEvent.VK_1);
        tp.setMnemonicAt(1,KeyEvent.VK_2);
        tp.setMnemonicAt(2,KeyEvent.VK_3);
        tp.setMnemonicAt(3,KeyEvent.VK_4);
        tp.setMnemonicAt(4,KeyEvent.VK_5);
        tp.setMnemonicAt(5,KeyEvent.VK_6);
        tp.setMnemonicAt(6,KeyEvent.VK_7);
        tp.setMnemonicAt(7,KeyEvent.VK_8);
        add(tp);
        revalidate();
    }
}
