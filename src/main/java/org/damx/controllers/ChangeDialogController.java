package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ChangeDialog;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ChangeDialogController implements ActionListener, ChangeListener, WindowListener {

    private final WindowsService windowsService;
    private ChangeDialog changeDialog;

    public ChangeDialogController(WindowsService windowsService) {
        this.windowsService = windowsService;
        changeDialog = (ChangeDialog) windowsService.getWindow("ChangeDialog");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void setLbState(int value){
        if(value > -1 && value <= 350){
            changeDialog.setLbColor(Color.BLUE);
            changeDialog.setLbText("PESO BAJO");
        }else if(value > 350 && value <= 650){
            changeDialog.setLbColor(Color.GREEN);
            changeDialog.setLbText("PESO MEDIO");
        }else{
            changeDialog.setLbColor(Color.RED);
            changeDialog.setLbText("PESO ALTO");
        }
    }

    private void handlerSetDefaultValues(){
        changeDialog.initComponents();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider sl = (JSlider) e.getSource();
        //changeDialog.setKgValue(changeDialog.getSlValue());
        changeDialog.setKgValue(sl.getValue());
        setLbState(sl.getValue());
    }

    @Override
    public void windowOpened(WindowEvent e) {

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
        handlerSetDefaultValues();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
