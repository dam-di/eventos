package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ActionDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController implements ActionListener {

    // Comandos
    public static final String SHOW_ACTIONDIALOG = "SHOW_ACTION_DIALOG";

    private final WindowsService windowsService;
    private ActionDialog actionDialog;

    public MainFrameController(WindowsService windowsService) {
        this.windowsService = windowsService;
        actionDialog = (ActionDialog) windowsService.getWindow("ActionDialog");
    }

    private void handleShowActionDialog(){
        actionDialog.showWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case SHOW_ACTIONDIALOG:
                handleShowActionDialog();
                break;
            default:
                break;
        }
    }
}
