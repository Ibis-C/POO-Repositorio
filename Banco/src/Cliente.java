import java.util.Scanner;

public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private Integer numeroDeCuenta;
    private Double saldo;

    //Setter y Getter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
       return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }

    public void setNumeroDeCuenta(Integer numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    public Double getSaldo(){
        return this.saldo;
    }

    //Metodos
    public void pedirDatos(){
      
        Scanner lectura;
        lectura = new Scanner(System.in);
        System.out.println("Proporciona los sigueintes datos del cliente");

        System.out.println("Nombre:");
        setNombre(lectura.nextLine());
  
        System.out.println("Apellido:");
        setApellido(lectura.nextLine());
  
        System.out.println("Número de cuenta:");
        setNumeroDeCuenta(lectura.nextInt());
  
        System.out.println("Saldo:");
        setSaldo(lectura.nextDouble());
    }

}  
