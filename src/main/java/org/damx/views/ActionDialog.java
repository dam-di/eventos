package org.damx.views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ActionDialog extends JDialog implements InterfaceView {
    private JPanel mainPanel;

    public ActionDialog(JFrame parent, Boolean modal){
        super(parent, modal);
        initWindow();

    }

    @Override
    public void initWindow() {
        setContentPane(mainPanel);
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
