package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ComponentDialog;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentDialogController implements ActionListener, AncestorListener {
    public static final String NAVIGATE_PANEL1 = "NAVIGATE_PANEL1";
    public static final String NAVIGATE_PANEL2 = "NAVIGATE_PANEL2";

    private ComponentDialog componentDialog;

    public ComponentDialogController(WindowsService windowsService) {
        this.componentDialog = (ComponentDialog) windowsService.getWindow("ComponentDialog");
    }

    private void handleNavigate(String nombrePanel){
        componentDialog.navegar(nombrePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case NAVIGATE_PANEL1:
                handleNavigate("Panel1");
                break;
            case NAVIGATE_PANEL2:
                handleNavigate("Panel2");
                break;
            default:
                break;
        }
    }

    @Override
    public void ancestorAdded(AncestorEvent event) {
        System.out.println("Mostrar " + event.getComponent().getName());
        if(event.getComponent().getName().equals("Panel1")){
            componentDialog.panel1.setContador();
        }else if(event.getComponent().getName().equals("Panel2")){
            componentDialog.panel2.setContador();
        }
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        System.out.println("Ocultar " + event.getComponent().getName());
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        System.out.println("Mover " + event.getComponent().getName());
    }
}
