import java.util.Scanner;

public class VistaCliente {
    private Scanner lectura;

    //Menu de opciones para el cliente
    public Integer Menu(){
        lectura = new Scanner(System.in);

        System.out.println("---MENÚ---");
        System.out.println("1-Agregar cliente");
        System.out.println("2-Realizar deposito");
        System.out.println("3-Realizar retiro");
        System.out.println("4-Realizar transferencia");
        System.out.println("5-Búsqueda de cliente por cuenta");
        System.out.println("6-Salir");
        System.out.println("Opción: ");

        return lectura.nextInt();
    }
    
    //Deposito 
    public Double pedirDeposito(){//pide la cantidad a depositar y la envia
       lectura = new Scanner(System.in); 
        System.out.println("Cantidad a depositar:");
        return lectura.nextDouble();
    }

    //Retiro
    public Double pedirRetiro(){//pide la cantidad a retirar y la envia
       lectura = new Scanner(System.in); 
        System.out.println("Cantidad a retirar:");
        return lectura.nextDouble();
    }
    
    //Transferencia
    public Double pedirTransferencia(){//pide la cantidad a transferir
        lectura = new Scanner(System.in); 
         System.out.println("Cantidad a transferir:");
         return lectura.nextDouble();
     }    

    //Pedir número de cuenta 
    public Integer pedirCuenta(){//envia un entero conocido como numero de cuenta.
        lectura = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta ");
        return lectura.nextInt();
    }

    //Pedir número de cuenta del que se va a transferir
    public Integer cuentaQueTransfiere(){//envia un entero conocido como numero de cuenta.
        lectura = new Scanner(System.in);
        System.out.println("Ingrese el número de cuenta que transferira a otra cuenta:");
        return lectura.nextInt();
    }    

    //Pedir número de cuenta que recibira la transferencia
    public Integer cuentaQueRecibeTransferecia(){//envia un entero conocido como numero de cuenta.
        lectura = new Scanner(System.in);
        System.out.println("Ingrese el número de cuenta que recibe la transferencia:");
        return lectura.nextInt();
    }    

    //Comprobar estado del deposito
    public void comprobacionDesposito(boolean estado){//recibe un booleano para comprobar el deposito
        if(estado == true){
            System.out.println("Deposito Exitoso");
        } else {
            System.out.println("Fallo en el deposito. Compruebe el número de cuenta o el valor que se intento depositar.");
        }
    }

    //Comprobar estado del retiro
    public void comprobacionRetiro(boolean estado){//recibe un boleano para comprobar el retiro
        if(estado == true){
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Fallo en el retiro. Compruebe el número de cuenta o el valor que se intento retirar.");
        }
    }

    //Comprobar estado de transferencia
    public void comprobacionTransferencia(boolean estado){//recibe un boleano para comprobar el retiro
        if(estado == true){
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("Fallo en la transferencia. Compruebe los números de cuenta utilizados  o el valor que se intento transferir.");
        }
    }    

    //Imprimir la informacion de un objeto tipo Cliente del Arraylist
    public void imprimirInfoEstudiante(Cliente objeto){ //Recibe un objeto tipo Cliente para imprimir sus atributos
        if(objeto != null){
            System.out.println("Nombre del cliente: " + objeto.getNombre() +" "+ objeto.getApellido()); 
            System.out.println("Número de cuenta: "+ objeto.getNumeroDeCuenta());
            System.out.println("Saldo: "+ objeto.getSaldo());
        } else{
            System.out.println("Cliente Inexistente");
        }
    }
}
