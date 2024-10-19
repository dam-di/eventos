package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ItemDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemDialogController implements ItemListener, ActionListener {

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
