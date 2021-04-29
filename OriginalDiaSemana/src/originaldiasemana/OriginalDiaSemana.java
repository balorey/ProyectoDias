
package originaldiasemana;
import java.io.*; 
/**

 *
 * @author balor
 */
public class OriginalDiaSemana {

    public static void main(String[] arg){
        
        System.out.println(DecirDia(arg));
		/*int dia; 
		dia=Integer.parseInt(arg[0]); 
		
                
                /*
                
                if(dia==0){ 
			System.out.println("El dia de la semana es lunes"); 
		} 
		if(dia==1){ 
			System.out.println("El dia de la semana es martes"); 
		} 
		if(dia==2){ 
			System.out.println("El dia de la semana es miercoles"); 
		} 
		if(dia==3){ 
			System.out.println("El dia de la semana es jueves"); 
		} 
		if(dia==4){ 
			System.out.println("El dia de la semana es viernes"); 
		} 
		if(dia==5){ 
			System.out.println("El dia de la semana es sabado"); 
		} 
		if(dia==6){ 
			System.out.println("El dia de la semana es domingo"); 
		} */
	} 
    
    
    
    public static String DecirDia(String arg[]){ 
        System.out.println("hola");
  String oracion = null;      
  int dia; 
  dia=Integer.parseInt(arg[0]); 
        System.out.println(dia);
  
                if(dia==0){ 
			oracion = "El dia de la semana es lunes"; 
		} 
		if(dia==1){ 
			oracion = "El dia de la semana es martes"; 
		} 
		if(dia==2){ 
			oracion = "El dia de la semana es miercoles"; 
		} 
		if(dia==3){ 
			oracion = "El dia de la semana es jueves"; 
		} 
		if(dia==4){ 
			oracion = "El dia de la semana es viernes"; 
		} 
		if(dia==5){ 
			oracion = "El dia de la semana es sabado"; 
		} 
		if(dia==6){ 
			oracion = "El dia de la semana es domingo"; 
		} 
        return oracion;
}
}

