package org.damx;

import com.formdev.flatlaf.FlatLightLaf;
import org.damx.controllers.*;
import org.damx.services.WindowsService;
import org.damx.views.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "INICIO DE PROGRAMA" );
        // Establecer tema de la aplicacion
        FlatLightLaf.setup();

        // Crear servicio de ventanas
        WindowsService windowsService = new WindowsService();

        // Crear ventanas
        MainFrame mainFrame = new MainFrame();
        ActionDialog actionDialog = new ActionDialog(mainFrame, true);
        ItemDialog itemDialog = new ItemDialog(mainFrame, true);
        ChangeDialog changeDialog = new ChangeDialog(mainFrame, true);
        ComponentDialog componentDialog = new ComponentDialog(mainFrame, true);

        // Añadir ventanas al servicio
        windowsService.registerWindow("MainFrame",mainFrame);
        windowsService.registerWindow("ActionDialog", actionDialog);
        windowsService.registerWindow("ItemDialog", itemDialog);
        windowsService.registerWindow("ChangeDialog", changeDialog);
        windowsService.registerWindow("ComponentDialog", componentDialog);

        // Crear controladores
        MainFrameController mainFrameController = new MainFrameController(windowsService);
        ActionDialogController actionDialogController = new ActionDialogController(windowsService);
        ItemDialogController itemDialogController = new ItemDialogController(windowsService);
        ChangeDialogController changeDialogController = new ChangeDialogController(windowsService);
        ComponentDialogController componentDialogController = new ComponentDialogController(windowsService);

        // Añadir Listeners
        mainFrame.addListener(mainFrameController);
        actionDialog.addListener(actionDialogController);
        itemDialog.addListener(itemDialogController);
        changeDialog.addListener(changeDialogController);
        componentDialog.addListener(componentDialogController);

        // Mostrar ventana principal
        mainFrame.showWindow();
    }
}
