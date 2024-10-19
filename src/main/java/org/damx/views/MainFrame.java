package org.damx.views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements InterfaceView {
    private JButton ACTIONLISTENERButton;
    private JPanel mainPanel;

    public MainFrame() {
        initWindow();

    }

    @Override
    public void initWindow() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    @Override
    public void showWindow() {
        setVisible(true);
    }

    @Override
    public void closeWindow() {
        dispose();
    }

    @Override
    public void setCommands() {

    }

    @Override
    public void addListener(ActionListener listener) {

    }

    @Override
    public void initComponents() {

    }
}
