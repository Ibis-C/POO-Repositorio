
public class App {
    public static void main(String[] args) throws Exception {

        VistaCliente vista = new VistaCliente();
        ControladorCliente cliente = new ControladorCliente(vista);
        cliente.MenuCliente();
    }
}
