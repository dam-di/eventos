package org.damx.views;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;

public class ChangeDialog extends JDialog implements InterfaceView {
    private JPanel mainPanel;
    private JSlider sl_kg;
    private JTextField tx_kg;
    private JLabel lb_info;

    public ChangeDialog(JFrame parent, boolean modal){
        super(parent, modal);
        initWindow();
    }



    @Override
    public void initWindow() {
        setContentPane(mainPanel);
        pack();
        setCommands();
        initComponents();
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
        sl_kg.addChangeListener((ChangeListener) listener);
        this.addWindowListener((WindowListener) listener);
        tx_kg.addKeyListener((KeyListener) listener);
    }

    @Override
    public void initComponents() {
        sl_kg.setMinimum(0);
        sl_kg.setMaximum(1000);
        sl_kg.setValue(0);
        tx_kg.setText("0");
        setLbText("PESO BAJO");
        setLbColor(Color.BLUE);
    }

    public int getSlValue(){
        return sl_kg.getValue();
    }

    public void setSlValue(int value){
        sl_kg.setValue(value);
    }

    public String getKgValue(){
        return tx_kg.getText();
    }

    public void setKgValue(int value){
        tx_kg.setText(String.valueOf(value));
    }

    public void setLbColor(Color color){
        lb_info.setForeground(color);
    }
    public void setLbText(String text){
        lb_info.setText(text);
    }
}
