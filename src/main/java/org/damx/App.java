package org.damx;

import com.formdev.flatlaf.FlatLightLaf;
import org.damx.services.WindowsService;
import org.damx.views.ActionDialog;
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
        ActionDialog actionDialog = new ActionDialog();

        // Añadir ventanas al servicio
        windowsService.registerWindow("MainFrame",mainFrame);
        windowsService.registerWindow("ActionDialog", actionDialog);

        // Crear controladores


        // Añadir Listeners



        // Mostrar ventana principal
        mainFrame.showWindow();
    }
}
