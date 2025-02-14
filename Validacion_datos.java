
package com.sysbrorm.validacion_datos;

import java.util.*;

public class Validacion_datos {

    public static void main(String[] args)
    {
        /* Create new object type Scanner for red data for the user to enter */
        Scanner leer= new Scanner(System.in);
        /*Create variables to use in the program */
        int intentos=3;
        String name,apellidopat,apellidomat;
       /* Create method do while for use a valid data in login the program*/
        do {
        /* Variables  type string, the variable pass contain the password valid */
        String pass="SysBro-RM";
        /*Variable user wait customer insert data*/
        String user;
         
         String texto=" ";
        System.out.println("Ingresa el usuario");
        user=leer.next();
        if(user==texto)
        {System.out.println("Debe de ingresar el usuario no se puede queda en blanco fin de programa.");
        texto=texto+user;
        break;
        }
        
        if(user.equals(pass))
        {
            System.out.println("Usuario correcto.");
            break;
 }
        else 
        {
            System.out.println("Contraseña incorrecta");
            intentos--;
            System.out.println("Tienes solo "+intentos+" para volver a intentar");
                        
        }
        }while(intentos!=0);
        if(intentos==0)
                                        {
                                         System.out.println("Agotaste tus intentos espera 30 segundos para volver a intentar");
                                         }
        
        
        
        }
        
    }



                






         
   
        
  
