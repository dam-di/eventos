package org.damx.utils;

import javax.swing.*;
import java.awt.*;

public class JTextFieldBorderColorUtil {

    public static void setJTextFieldBorderColorUtil(JTextField campo, Color color){
        campo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(color),
                BorderFactory.createEmptyBorder(5, 6, 5, 5) // Márgenes internos
        ));
    }
}
