package org.damx;

import com.formdev.flatlaf.FlatLightLaf;
import org.damx.controllers.ActionDialogController;
import org.damx.controllers.ItemDialogController;
import org.damx.controllers.MainFrameController;
import org.damx.services.WindowsService;
import org.damx.views.ActionDialog;
import org.damx.views.ItemDialog;
import org.damx.views.MainFrame;

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

        // Añadir ventanas al servicio
        windowsService.registerWindow("MainFrame",mainFrame);
        windowsService.registerWindow("ActionDialog", actionDialog);
        windowsService.registerWindow("ItemDialog", itemDialog);

        // Crear controladores
        MainFrameController mainFrameController = new MainFrameController(windowsService);
        ActionDialogController actionDialogController = new ActionDialogController(windowsService);
        ItemDialogController itemDialogController = new ItemDialogController(windowsService);


        // Añadir Listeners
        mainFrame.addListener(mainFrameController);
        actionDialog.addListener(actionDialogController);
        itemDialog.addListener(itemDialogController);

        // Mostrar ventana principal
        mainFrame.showWindow();
    }
}
