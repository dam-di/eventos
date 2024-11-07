package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ActionDialog;
import org.damx.views.ChangeDialog;
import org.damx.views.ComponentDialog;
import org.damx.views.ItemDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController implements ActionListener {

    // Comandos
    public static final String SHOW_ACTIONDIALOG = "SHOW_ACTION_DIALOG";
    public static final String SHOW_ITEMDIALOG = "SHOW_ITEM_DIALOG";
    public static final String SHOW_CHANGEDIALOG = "SHOW_CHANGE_DIALOG";
    public static final String SHOW_COMPONENTDIALOG = "SHOW_COMPONENT_DIALOG";

    private final WindowsService windowsService;
    private ActionDialog actionDialog;
    private ItemDialog itemDialog;
    private ChangeDialog changeDialog;
    private ComponentDialog componentDialog;

    public MainFrameController(WindowsService windowsService) {
        this.windowsService = windowsService;
        actionDialog = (ActionDialog) windowsService.getWindow("ActionDialog");
        itemDialog = (ItemDialog) windowsService.getWindow("ItemDialog");
        changeDialog = (ChangeDialog) windowsService.getWindow("ChangeDialog");
        componentDialog = (ComponentDialog) windowsService.getWindow("ComponentDialog");
    }

    private void handleShowActionDialog(){
        actionDialog.showWindow();
    }

    private void handleShowItemDialog(){
        itemDialog.showWindow();
    }

    private void handleShowChangeDialog(){
        changeDialog.showWindow();
    }
    private void handleShowComponentDialog(){
        componentDialog.showWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case SHOW_ACTIONDIALOG:
                handleShowActionDialog();
                break;
            case SHOW_ITEMDIALOG:
                handleShowItemDialog();
                break;
            case SHOW_CHANGEDIALOG:
                handleShowChangeDialog();
                break;
            case SHOW_COMPONENTDIALOG:
                handleShowComponentDialog();
                break;
            default:
                break;
        }
    }
}
