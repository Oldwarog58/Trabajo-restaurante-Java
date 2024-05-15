package ejercicio_restaurante_modelo_;

import javax.swing.JOptionPane;

public class Restaurante {

    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog("Bienvenido al restaurante. Por favor, ingresa tu nombre:");
        int codMenuPpal;
        double totalPagar = 0.0;
        String factura = "FACTURA\n\nCliente: " + nombreUsuario + "\n\n";
        
        do {
            String menuPpal = "Hola, " + nombreUsuario + ". Bienvenido al restaurante.\n\n";
            menuPpal += "MENU PRINCIPAL \n\n";
            menuPpal += "1. Plato típico\n";
            menuPpal += "2. Plato a la carta\n";
            menuPpal += "3. Plato internacional\n";
            menuPpal += "4. Salir\n\n";
            
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menuPpal));
            
            switch (codMenuPpal) {
                case 1:
                    double costoPlatoTipico = menuPlatoTipico();
                    factura += "Plato típico: " + costoPlatoTipico + " colones\n";
                    totalPagar += costoPlatoTipico;
                    break;
                case 2:
                    double costoPlatoCarta = menuPlatoCarta();
                    factura += "Plato a la carta: " + costoPlatoCarta + " colones\n";
                    totalPagar += costoPlatoCarta;
                    break;
                case 3:
                    double costoPlatoInternacional = menuPlatoInternacional();
                    factura += "Plato internacional: " + costoPlatoInternacional + " colones\n";
                    totalPagar += costoPlatoInternacional;
                    break;
                case 4:
                    mostrarMensaje("¡Gracias por visitar nuestro restaurante!");
                    break;
                default:
                    mostrarMensaje("No corresponde a un código válido", "ADVERTENCIA");
                    break;
            }
        } while (codMenuPpal != 4);
        
        factura += "\nTotal a pagar: " + totalPagar + " colones";
        mostrarMensaje(factura);
    }
    
    private static double menuPlatoTipico() {
        String menu = "MENU PLATO TÍPICO \n\n";
        menu += "1. Casado (₡5000)\n";
        menu += "2. Gallo Pinto (₡3000)\n";
        menu += "3. Tamal (₡1500)\n";
        menu += "4. Volver al menú principal\n\n";
        
        int codPlato = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (codPlato) {
            case 1:
                return 5000.0;
            case 2:
                return 3000.0;
            case 3:
                return 1500.0;
            case 4:
                return 0.0;
            default:
                mostrarMensaje("No corresponde a un código válido", "ADVERTENCIA");
                return 0.0;
        }
    }
    
    private static double menuPlatoCarta() {
        String menu = "MENU PLATO A LA CARTA \n\n";
        menu += "1. Filete de Res (₡8000)\n";
        menu += "2. Pasta Alfredo (₡6000)\n";
        menu += "3. Ensalada César (₡4000)\n";
        menu += "4. Volver al menú principal\n\n";
        
        int codPlato = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (codPlato) {
            case 1:
                return 8000.0;
            case 2:
                return 6000.0;
            case 3:
                return 4000.0;
            case 4:
                return 0.0;
            default:
                mostrarMensaje("No corresponde a un código válido", "ADVERTENCIA");
                return 0.0;
        }
    }
    
    private static double menuPlatoInternacional() {
        String menu = "MENU PLATO INTERNACIONAL \n\n";
        menu += "1. Sushi (₡10000)\n";
        menu += "2. Pizza Margarita (₡7000)\n";
        menu += "3. Pad Thai (₡9000)\n";
        menu += "4. Volver al menú principal\n\n";
        
        int codPlato = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (codPlato) {
            case 1:
                return 10000.0;
            case 2:
                return 7000.0;
            case 3:
                return 9000.0;
            case 4:
                return 0.0;
            default:
                mostrarMensaje("No corresponde a un código válido", "ADVERTENCIA");
                return 0.0;
        }
    }
    
    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    private static void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }
}
