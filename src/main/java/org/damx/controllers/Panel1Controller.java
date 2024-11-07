package org.damx.controllers;

import org.damx.utils.JTextFieldBorderColorUtil;
import org.damx.views.Panel1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;

public class Panel1Controller implements FocusListener {

    private final Panel1 panel1;

    public Panel1Controller(Panel1 panel1) {
        this.panel1 = panel1;
    }

    private void handleLostFocus(JTextField campo){
        if(campo.getText().equals("")){
            JTextFieldBorderColorUtil.setJTextFieldBorderColorUtil(campo, Color.RED);
        }else{
            JTextFieldBorderColorUtil.setJTextFieldBorderColorUtil(campo, Color.LIGHT_GRAY);
        }
    }

    private void handleGetFocus(JTextField campo){
        JTextFieldBorderColorUtil.setJTextFieldBorderColorUtil(campo, Color.BLUE);
    }

    private void handleGetButtonFocus(){
        panel1.setBorderColor();
    }
    @Override
    public void focusGained(FocusEvent e) {
        Object component = e.getComponent();
        if(component.getClass().equals(JTextField.class)){
            System.out.println("FOCO GANADO " + e.getComponent().getName());
            handleGetFocus((JTextField) e.getComponent());
        }else if(component.getClass().equals(JButton.class)){
            handleGetButtonFocus();
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        Object component = e.getComponent();
        if(component.getClass().equals(JTextField.class)){
            System.out.println("FOCO PERDIDO " + e.getComponent().getName());
            handleLostFocus((JTextField) e.getComponent());
        }
    }

}
