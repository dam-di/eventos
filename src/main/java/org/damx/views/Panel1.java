package org.damx.views;

import org.damx.utils.JTextFieldBorderColorUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.util.EventListener;

public class Panel1 extends JPanel {
    private JPanel mainPanel;
    private JLabel tx_contador;
    private JTextField tx_nombre;
    private JTextField tx_dni;
    private JButton bt_aceptar;
    private int contador = 0;

    public Panel1(){
        initPanel();
    }

    private void initPanel(){
        add(mainPanel);
        setName("Panel1");
        tx_nombre.setName("nombre");
        tx_dni.setName("dni");
    }
    public void setContador(){
        contador++;
        tx_contador.setText("Has entrado: " + contador + " veces");
    }

    public void addListener(EventListener listener){
        tx_dni.addFocusListener((FocusListener) listener);
        tx_nombre.addFocusListener((FocusListener) listener);
        tx_dni.addKeyListener((KeyListener) listener);
        tx_nombre.addKeyListener((KeyListener) listener);
        bt_aceptar.addFocusListener((FocusListener) listener);
    }

    public void setBorderColor(){
        if(tx_nombre.getText().equals("")){
            JTextFieldBorderColorUtil.setJTextFieldBorderColorUtil(tx_nombre, Color.RED);
        }

        if(tx_dni.getText().equals("")) {
            JTextFieldBorderColorUtil.setJTextFieldBorderColorUtil(tx_dni, Color.RED);
        }
    }
}
