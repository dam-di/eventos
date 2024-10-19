package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ActionDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ActionDialogController implements ActionListener, WindowListener {

    // Comandos
    public static final String CHANGE_COLOR_PANEL = "CHANGE_COLOR_PANEL";

    private final WindowsService windowsService;
    private ActionDialog actionDialog;

    public ActionDialogController(WindowsService windowsService) {
        this.windowsService = windowsService;
        actionDialog = (ActionDialog) windowsService.getWindow("ActionDialog");
    }

    private void handleChangePanelColor(){
        actionDialog.setColorPanel(Color.RED);
    }


    private void handleFirtsDialogOpen(){
        JOptionPane.showMessageDialog(null, "HOLA! ESPERO QUE TE DIVIERTAS");
    }

    private void handleSetDialogToDefaultValues(){
        actionDialog.setColorPanel(Color.BLACK);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case CHANGE_COLOR_PANEL:
                handleChangePanelColor();
                break;
            default:
                break;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        handleFirtsDialogOpen();
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        handleSetDialogToDefaultValues();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
