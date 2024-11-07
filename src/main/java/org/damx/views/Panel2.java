package org.damx.views;

import javax.swing.*;

public class Panel2 extends JPanel {
    private JPanel mainPanel;
    private JLabel tx_contador;

    private int contador = 0;

    public Panel2(){
        initPanel();
    }

    private void initPanel(){
        add(mainPanel);
        setName("Panel2");
    }

    public void setContador(){
        contador++;
        tx_contador.setText("Has entrado: " + contador + " veces");
    }
}
