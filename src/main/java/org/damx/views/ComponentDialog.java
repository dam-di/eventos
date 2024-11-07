package org.damx.views;

import org.damx.controllers.Panel1Controller;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import static org.damx.controllers.ComponentDialogController.NAVIGATE_PANEL1;
import static org.damx.controllers.ComponentDialogController.NAVIGATE_PANEL2;

public class ComponentDialog extends JDialog implements InterfaceView {
    private JPanel mainPanel;
    private JPanel contenedorPaneles;
    private JButton bt_panel1;
    private JButton bt_panel2;

    private CardLayout navegador;

    public Panel1 panel1;
    public Panel2 panel2;

    public ComponentDialog(JFrame parent, boolean modal){
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
        this.setVisible(true);
    }

    @Override
    public void closeWindow() {
        dispose();
    }

    @Override
    public void setCommands() {
        bt_panel1.setActionCommand(NAVIGATE_PANEL1);
        bt_panel2.setActionCommand(NAVIGATE_PANEL2);
    }

    @Override
    public void addListener(ActionListener listener) {
        bt_panel1.addActionListener(listener);
        bt_panel2.addActionListener(listener);
        panel1.addAncestorListener((AncestorListener) listener);
        panel2.addAncestorListener((AncestorListener) listener);

    }

    @Override
    public void initComponents() {
        navegador = (CardLayout) contenedorPaneles.getLayout();
        panel1 = new Panel1();
        panel1.addListener(new Panel1Controller(panel1));
        panel2 = new Panel2();
        contenedorPaneles.add(panel1,"Panel1");
        contenedorPaneles.add(panel2,"Panel2");
    }

    public void navegar(String nombrePanel){
        navegador.show(contenedorPaneles,nombrePanel);
    }

}
