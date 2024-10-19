package org.damx.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import static org.damx.controllers.ActionDialogController.CHANGE_COLOR_PANEL;

public class ActionDialog extends JDialog implements InterfaceView {
    private JPanel mainPanel;
    private JButton bt_aceptar;
    private JPanel panel;

    public ActionDialog(JFrame parent, Boolean modal){
        super(parent, modal);
        initWindow();

    }

    @Override
    public void initWindow() {
        setContentPane(mainPanel);
        pack();
        setCommands();
    }

    public void setColorPanel(Color color){
        panel.setBackground(color);
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
        bt_aceptar.setActionCommand(CHANGE_COLOR_PANEL);
    }

    @Override
    public void addListener(ActionListener listener) {
        bt_aceptar.addActionListener(listener);
        this.addWindowListener((WindowListener) listener);
    }

    @Override
    public void initComponents() {

    }
}
