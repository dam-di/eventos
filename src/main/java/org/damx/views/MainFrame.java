package org.damx.views;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import static org.damx.controllers.MainFrameController.*;

public class MainFrame extends JFrame implements InterfaceView {
    private JButton bt_actionlistener;
    private JPanel mainPanel;
    private JButton bt_itemlistener;
    private JButton bt_changelistener;
    private JButton bt_component;

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
        bt_changelistener.setActionCommand(SHOW_CHANGEDIALOG);
        bt_component.setActionCommand(SHOW_COMPONENTDIALOG);
    }

    @Override
    public void addListener(ActionListener listener) {
        bt_actionlistener.addActionListener(listener);
        bt_itemlistener.addActionListener(listener);
        bt_changelistener.addActionListener(listener);
        bt_component.addActionListener(listener);
    }

    @Override
    public void initComponents() {

    }
}
