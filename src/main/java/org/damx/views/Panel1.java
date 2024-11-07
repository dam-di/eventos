package org.damx.views;

import javax.swing.*;

public class Panel1 extends JPanel {
    private JPanel mainPanel;
    private JLabel tx_contador;
    private int contador = 0;

    public Panel1(){
        initPanel();
    }

    private void initPanel(){
        add(mainPanel);
        setName("Panel1");
    }
    public void setContador(){
        contador++;
        tx_contador.setText("Has entrado: " + contador + " veces");
    }
}
