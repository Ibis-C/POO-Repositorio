import java.util.ArrayList;

public class ControladorCliente {
    private ArrayList <Cliente> lista;

    VistaCliente vista; //Declaración de objeto tipo VistaCliente
    
    ControladorCliente(VistaCliente vista){
        lista = new ArrayList<Cliente>();
        this.vista = vista;
    }

    public void addCliente(){
      lista.add(0, new Cliente());
      lista.get(0).pedirDatos();
   }


    //Menu 
    public void MenuCliente(){
        Integer opcion = 0;

        while(opcion != 6){
            switch(vista.Menu()){
                case 1 : addCliente(); break; //Añadir cliente
                case 2 : vista.comprobacionDesposito(agregarDeposito(obtCliente(vista.pedirCuenta()))); break;
                case 3 : vista.comprobacionRetiro(retirarDinero(obtCliente(vista.pedirCuenta())));;break;
                case 4 : Integer aux1, aux2; 
                aux1 = obtCliente(vista.cuentaQueTransfiere());  // lee la cuenta que transfiere y verifica si existe
                aux2 = obtCliente(vista.cuentaQueRecibeTransferecia()); // lee la cuenta a la que se le transfiere y verifica si existe
                vista.comprobacionTransferencia(hacerTransferencia(aux1, aux2));
                break;
                case 5 : vista.imprimirInfoEstudiante(objetoCliente(obtCliente(vista.pedirCuenta())));break;
                case 6 : opcion = 6; break;
            }
        }
    }

    //Buscar cuenta
    public int obtCliente(Integer cuenta){//esta funcion encuenta el numero en el que se aloja un estudiante apartir de la matricula
        for (int i=0; i<lista.size(); i++){
            if(cuenta == lista.get(i).getNumeroDeCuenta()){
                return i;
            } 
        } return -1;
    }

    //Buscar objeto
    public Cliente objetoCliente(int cuenta){//Regresa el objeto tipo estudiante
        if(cuenta != -1){
            return lista.get(cuenta);
        } else{
            return null;
        }

    }
    
    //Agregar deposito a la cuenta 
    public boolean agregarDeposito(int cliente){
        if(cliente !=-1){  
            Double a, b=vista.pedirDeposito(), c=lista.get(cliente).getSaldo();
            if(b < 0){
                return false;
            } else {
                a=b+c;
                lista.get(cliente).setSaldo(a);
                return true;
            }
        } else {
            return false;
        }
    }

    //Transferir
    public boolean hacerTransferencia(int cliente1, int cliente2){
        if(cliente1 !=-1 && cliente2 !=-1){
            Double a, b , c=vista.pedirTransferencia(), d=lista.get(cliente1).getSaldo(), e=lista.get(cliente2).getSaldo();
            if(c < 0){
                return false;
            } else {
                a = c+e; //Suma el valor a transferir a la cuenta que se quiere
                lista.get(cliente2).setSaldo(a);
                b = d-c; //Resta el valor que se le transfirio a la cuenta
                lista.get(cliente1).setSaldo(b);
                return true;
            }
        } else {
            return false;
        }
    }

    //Retirar Dinero
    public boolean retirarDinero(int cliente){
        if(cliente !=-1){  
            Double a, b=vista.pedirRetiro(), c=lista.get(cliente).getSaldo();
            if(b < 0){
                return false;
            } else {
                a=c-b;
                lista.get(cliente).setSaldo(a);
                return true;
            }
        } else {
            return false;
        }
    }




}
