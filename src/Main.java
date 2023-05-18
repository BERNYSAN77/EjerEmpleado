import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = null;
        Empleado empleados[] = new Empleado[10];
        String nombre, apellido;
        int dia, mes, anio,genero;
        int opc, indice=0;
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
                    System.out.println("Ingreso del empleado "+indice+1);
                    System.out.print("Ingrese el nombre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese el apellido: ");
                    apellido = sc.next();
                    System.out.print("Ingrese el genero 1 Masculio, 2 Femenino: ");
                    genero = Integer.parseInt(sc.next());

                    System.out.print("Ingrese el dia de nacimiento: ");
                    dia = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el mes de nacimiento: ");
                    mes = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el anio de nacimiento: ");
                    anio = Integer.parseInt(sc.next());
                    Fecha fn = new Fecha(dia,mes,anio);

                    System.out.print("Ingrese el dia de ingreso: ");
                    dia = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el mes de ingreso: ");
                    mes = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el anio de ingreso: ");
                    anio = Integer.parseInt(sc.next());
                    Fecha fi = new Fecha(dia,mes,anio);

                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());

                    empleados[indice] = new Empleado(nombre,apellido,genero,fn,fi,salario);


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