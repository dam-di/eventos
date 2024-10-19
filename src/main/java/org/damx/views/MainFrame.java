package org.damx.views;

import javax.swing.*;
import java.awt.event.ActionListener;

import static org.damx.controllers.MainFrameController.SHOW_ACTIONDIALOG;

public class MainFrame extends JFrame implements InterfaceView {
    private JButton bt_actionlistener;
    private JPanel mainPanel;

    public MainFrame() {
        initWindow();

    }

    @Override
    public void initWindow() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setCommands();
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
        bt_actionlistener.setActionCommand(SHOW_ACTIONDIALOG);
    }

    @Override
    public void addListener(ActionListener listener) {
        bt_actionlistener.addActionListener(listener);
    }

    @Override
    public void initComponents() {

    }
}
