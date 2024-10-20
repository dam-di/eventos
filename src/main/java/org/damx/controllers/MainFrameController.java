package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ActionDialog;
import org.damx.views.ChangeDialog;
import org.damx.views.ItemDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController implements ActionListener {

    // Comandos
    public static final String SHOW_ACTIONDIALOG = "SHOW_ACTION_DIALOG";
    public static final String SHOW_ITEMDIALOG = "SHOW_ITEM_DIALOG";
    public static final String SHOW_CHANGEDIALOG = "SHOW_CHANGE_DIALOG";

    private final WindowsService windowsService;
    private ActionDialog actionDialog;
    private ItemDialog itemDialog;
    private ChangeDialog changeDialog;

    public MainFrameController(WindowsService windowsService) {
        this.windowsService = windowsService;
        actionDialog = (ActionDialog) windowsService.getWindow("ActionDialog");
        itemDialog = (ItemDialog) windowsService.getWindow("ItemDialog");
        changeDialog = (ChangeDialog) windowsService.getWindow("ChangeDialog");
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
            default:
                break;
        }
    }
}
