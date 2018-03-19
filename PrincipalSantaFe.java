 import java.util.*;

public class PrincipalSantaFe {

	public static void main(String[] args) {
	    Scanner enter=new Scanner(System.in);
	    	    
	   ArrayList<Empleado> Empleados=new ArrayList<Empleado>();
	    int opcion=0;
	       
	       System.out.println("Supermercado Santa Fe:\n Bienvenido al gestor de usuarios.");
	    do{ 
	        
	        System.out.println("Menu");
	        System.out.println("1. Ingresar nuevo Empleado");
	        System.out.println("2. Cantidad de empleados actualmente registrados");
	        System.out.println("0. Salir");
	        opcion=enter.nextInt();
	        
	       
	       switch (opcion){
	           case 1:
	           Empleado Nuevo=new Empleado();
		Nuevo.asignarNombre("");
		Nuevo.asignarDepartamento("");
		Nuevo.asignarPosición("");
		Nuevo.asignarSalario("");
	           Nuevo.imprimir();
	           
	           Empleados.add(Nuevo);
	           break;
	           
	           case 2:
	           
	           System.out.println("El numero de empleados es :" + Empleados.size());
	            break;

		     
	       	       } 
	       	   }while (opcion !=0);


	}

}
