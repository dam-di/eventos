package org.damx.controllers;

import org.damx.services.WindowsService;
import org.damx.views.ChangeDialog;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class ChangeDialogController implements ActionListener, ChangeListener, WindowListener, KeyListener {

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
        handlerSetDefaultValues();
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

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Obtener el carácter de la tecla que fue presionada
        char c = e.getKeyChar();
        if(!Character.isDigit(c)){
            JOptionPane.showMessageDialog(null, "Sólo números permitidos");
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String kgValue = changeDialog.getKgValue();
        if(!kgValue.isEmpty()){
            int kg = Integer.parseInt(kgValue);
            if(kg >=1000){
                kg = 1000;
            }
            changeDialog.setSlValue(kg);
            changeDialog.setKgValue(kg);
        }else{
            changeDialog.setSlValue(0);
            changeDialog.setKgValue(0);
        }
    }
}
