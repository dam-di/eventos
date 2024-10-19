package org.damx.views;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class ItemDialog extends JDialog implements InterfaceView {
    private JPanel mainPanel;
    private JComboBox cb_marcas;
    private JLabel lb_marca;
    private JComboBox cb_habilitar;

    public ItemDialog(JFrame parent, Boolean modal){
        super(parent, modal);
        initWindow();
    }

    @Override
    public void initWindow() {
        setContentPane(mainPanel);
        pack();
        setCommands();
        initComponents();
    }

    @Override
    public void showWindow() {
        setVisible(true);
    }

    @Override
    public void closeWindow() {
        dispose();
    }

    @Override
    public void setCommands() {

    }

    @Override
    public void addListener(ActionListener listener) {
        cb_marcas.addItemListener((ItemListener) listener);
        cb_habilitar.addItemListener((ItemListener) listener);
    }

    public void setTextToLabel(String text){
        lb_marca.setText(text);
    }

    public String getCbMarcaSelectedItem(){
        return (String) cb_marcas.getSelectedItem();
    }

    public void setCbMarcasEnabled(boolean state){
        cb_marcas.setEnabled(state);
    }

    @Override
    public void initComponents() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel();
        model.addElement("Seleccionar");
        model.addElement("Adidas");
        model.addElement("Nike");
        model.addElement("Puma");
        model.addElement("Fila");
        cb_marcas.setModel(model);
        setCbMarcasEnabled(false);
        cb_marcas.setName("cb_marcas");

        DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel();
        model2.addElement("Deshabilitado");
        model2.addElement("Habilitado");
        cb_habilitar.setModel(model2);
        cb_habilitar.setName("cb_habilitar");

        lb_marca.setText("-");
    }
}
