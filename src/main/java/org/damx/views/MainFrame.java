package org.damx.views;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import static org.damx.controllers.MainFrameController.SHOW_ACTIONDIALOG;
import static org.damx.controllers.MainFrameController.SHOW_ITEMDIALOG;

public class MainFrame extends JFrame implements InterfaceView {
    private JButton bt_actionlistener;
    private JPanel mainPanel;
    private JButton bt_itemlistener;

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
        bt_itemlistener.setActionCommand(SHOW_ITEMDIALOG);
    }

    @Override
    public void addListener(ActionListener listener) {
        bt_actionlistener.addActionListener(listener);
        bt_itemlistener.addActionListener(listener);
    }

    @Override
    public void initComponents() {

    }
}
