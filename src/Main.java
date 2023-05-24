import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = null;
        Empleado empleados[] = new Empleado[10];
        List<Empleado> empleadosList = new ArrayList<Empleado>();
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
            System.out.println("6.- Imprimir empleados Lista");
            System.out.println("7.- Salir");
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
                    empleadosList.add(new Empleado(nombre,apellido,genero,fn,fi,salario));


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
                    imprimirLista((ArrayList<Empleado>) empleadosList );
                }break;
                case 7:{
                    System.out.println("Gracias!");
                }break;
                default:
                    System.out.println("opción no válida");

            }


        }while(opc!=6);

    }

    /**
     * busca un empleado por nombre en el arreglo y lo retorna
     * @param empleados arreglo de empleados
     * @param nombre un String diferente de null
     * @return el empleado si lo encuentra o null si no
     */
    public static Empleado buscarEmpleado(Empleado empleados[],String nombre){
        for(int i=0;i<empleados.length;i++){
            if(nombre.equalsIgnoreCase(empleados[i].darNombre()))
                return empleados[i];
        }
        return null;
    }

    /**
     * busca un empleado por nombre en la lista y la retorna
     * @param lista de empleados
     * @param nombre String diferente de null
     * @return el empleado si lo encuentra o null si no
     */

    public static Empleado buscarEmpleadoList(ArrayList<Empleado> lista,String nombre){
        for(Empleado e:lista){
            if(nombre.equalsIgnoreCase(e.darNombre()))
                return e;
        }
        return null;
    }

    public static void imprimirLista(ArrayList<Empleado> lista){
        Iterator<Empleado> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}