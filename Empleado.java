import java.util.*;
import javax.swing.*;


public class Empleado extends PrincipalSantaFe {
	
	private String nombre;
	private String departamento;
	private String posición;
	private String salario;
	
	Scanner ent=new Scanner(System.in);
public void imprimir(){ 
	System.out.println("Nombre "+ nombre);
	System.out.println("Departamento "+ departamento);
	System.out.println("Posición "+ posición);
	System.out.println("Salario "+ salario);
	
}

// asignar un nombre del empleado
public void asignarNombre (String nuevoNombre){
	nombre= JOptionPane.showInputDialog("Escriba nuevo Nombre :"+nuevoNombre);
}

public void asignarDepartamento(String nuevoDepartamento){
	departamento=JOptionPane.showInputDialog("Escriba el Departamento :"+nuevoDepartamento);
}

public void asignarPosición(String nuevaPosición){
	posición=JOptionPane.showInputDialog("Escriba la posición del empleado :"+nuevaPosición);
}
	
public void asignarSalario( String nuevoSalario){
	 salario=JOptionPane.showInputDialog("Ingrese el salario :"+nuevoSalario);
	 
}
}	
