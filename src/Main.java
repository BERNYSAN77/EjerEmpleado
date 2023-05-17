import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = null;
        int opc;
        double salario;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.- Ingresar Empleado");
            System.out.println("2.- Cambiar salario");
            System.out.println("3.- Calcular edad");
            System.out.println("4.- Calcular antiguedad");
            System.out.println("5.- Calcular prestaciones");
            System.out.println("6.- Salir");
            opc = Integer.parseInt(sc.next());
            switch (opc){
                case 1:{
                    e1 = new Empleado();
                }break;
                case 2:{
                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());
                    e1.cambiarSalario(salario);
                }break;
                case 3:{
                    System.out.println("La edad de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularEdad());
                }break;
                case 4:{
                    System.out.println("La antiguedad de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularAntiguedad());
                }break;
                case 5:{
                    System.out.println("Las prestaciones de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularPrestaciones());
                }break;
                case 6:{
                    System.out.println("Gracias!");
                }break;
                default:
                    System.out.println("opción no válida");

            }


        }while(opc!=6);

        System.out.println("Hello world!");
    }
}