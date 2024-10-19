package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ActionDialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDialogController implements ActionListener {

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
}
