/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseñas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

/**
 *
 * @author USER
 */
public class Contraseñas {
public static String a_evaluar;
public static String verificador,eleccion;
private static BufferedReader ingreso;
private static Pattern pt;
private static Matcher sc;


     /**
     * @param args the command line arguments
     */
 
 
public static void main(String[] args) throws IOException{
 


System.out.println("Presiona exit para salir");
 do{
PedirContraseña();
Evaluacionyresultado(); 
 if(Evaluacionyresultado() == true && a_evaluar.length() >=8){
 System.out.println("Excelente");    
 }
 else if(Evaluacionyresultado() == true && a_evaluar.length() <= 7 && a_evaluar.length() >= 4){
     
     System.out.println("Regular");    
 }
 else if(Evaluacionyresultado() == true && a_evaluar.length() <= 3){
     System.out.println("Horrible");
 }
 System.out.print("QUIeRES SALIR");
 eleccion = ingreso.readLine();
 
 }while(eleccion.equalsIgnoreCase("no"));   
    
} 
  public static void PedirContraseña() throws IOException{
     ingreso = new BufferedReader(new InputStreamReader(System.in));
     
   System.out.print("Ingresa tu contraseña para saber si es buena o no");
   a_evaluar  = ingreso.readLine();  
 }
 public static boolean Evaluacionyresultado(){
  verificador = "\\d*\\w+\\@?\\.*\\#?\\-*|\\d+\\@*\\w*\\.?\\w*\\d*|\\w+\\.?\\w+|\\@?.\\#?|\\@*\\.+\\w*\\d*\\#?" ;   

     
  pt = Pattern.compile(verificador);
  sc = pt.matcher(a_evaluar);
     
  boolean tr = sc.matches();
  
  return tr;
 }
 
 
    
    
    
    
    
    
}
