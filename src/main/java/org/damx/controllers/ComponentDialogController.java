package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ComponentDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ComponentDialogController implements ActionListener, ComponentListener {
    public static final String NAVIGATE_PANEL1 = "NAVIGATE_PANEL1";
    public static final String NAVIGATE_PANEL2 = "NAVIGATE_PANEL2";

    private final WindowsService windowsService;
    private ComponentDialog componentDialog;

    public ComponentDialogController(WindowsService windowsService) {
        this.windowsService = windowsService;
        this.componentDialog = (ComponentDialog) windowsService.getWindow("ComponentDialog");
    }

    private void handleNavigate(String nombrePanel){
        componentDialog.navegar(nombrePanel);
    }

    @Override
    public void componentResized(ComponentEvent e) {

    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

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
}
