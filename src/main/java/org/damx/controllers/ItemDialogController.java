package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ItemDialog;

import javax.swing.*;
import java.awt.event.*;

public class ItemDialogController implements ItemListener, ActionListener, WindowListener {

    private final WindowsService windowsService;
    private ItemDialog itemDialog;

    public ItemDialogController(WindowsService windowsService) {
        this.windowsService = windowsService;
        itemDialog = (ItemDialog) windowsService.getWindow("ItemDialog");
    }

    private void handleSetTextLabel(String texto){
        itemDialog.setTextToLabel(texto);
    }

    private void handleSetCbMarcasEnable(boolean state){
        itemDialog.setCbMarcasEnabled(state);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        JComboBox jComboBox = (JComboBox) e.getSource();
        if(e.getStateChange() == ItemEvent.SELECTED){
            if(jComboBox.getName().equals("cb_marcas")){
                if(jComboBox.getSelectedIndex() == 0){
                    handleSetTextLabel("-");
                }else{
                    handleSetTextLabel("Marca: "+itemDialog.getCbMarcaSelectedItem());
                }

            }else if(jComboBox.getName().equals("cb_habilitar")) {
                if (jComboBox.getSelectedIndex() == 0) {
                    handleSetCbMarcasEnable(false);
                } else {
                    handleSetCbMarcasEnable(true);
                }
            }
        }
    }

    private void handleSetDefaultValues(){
        itemDialog.setDefaultValues();
    }

    private void handleExitDialog(){
        int response = JOptionPane.showConfirmDialog(null, "¿Deseas salir?","Salir del programa" ,JOptionPane.YES_OPTION);
        if(response == JOptionPane.YES_OPTION){
            itemDialog.closeWindow();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        handleExitDialog();
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
        handleSetDefaultValues();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
