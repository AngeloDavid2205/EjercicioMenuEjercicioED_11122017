/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Ejercicios {
    public static void Ejercicio1(){
        JOptionPane.showMessageDialog(null,"Ejercicio 1");
        //1
        for(int i=1;i<=100;i++){
            if(i%5==0 && i%25==0)
                System.out.println(i+",");
        }
        //2
        int i;
        for( i=1;i<=100;i++){
            if(i%75==0)
                System.out.println(i+",");
        }
        JOptionPane.showMessageDialog(null,"Los valores  no son iguales");
    }
    
    public static void Ejercicio2(){
        JOptionPane.showMessageDialog(null," Ejercicio 3");
        int [] primes = {1,3,6};
        int sum=0;
        for(int t:primes){
            sum+=t; 
        System.out.println(sum++);
        }
    }
    public static void Ejercicio3(){
        JOptionPane.showMessageDialog(null,"Ejercicio 2");
        int total=0;
        for(int i=0;i<=5;i++){
            total+=2;
        }
        JOptionPane.showMessageDialog(null,"La salida de este codigo es: "+total);
    }
    
    public static void Ejercicio4(){
       JOptionPane.showMessageDialog(null,"Ejercicio 4");
        for(int i=1;i <6;i +=2){
            for(int j=0;j<3;j++){
                if(i+j>4)
                  break;
                System.out.println(i*j);
            }
        } 
    }
    
    public static void Ejercicio5(){
        JOptionPane.showMessageDialog(null,"Ejercicio 5");
        int x=0;
        do{
            System.out.print(x);
            x++;
            break;
        }
        while(x>0);          
        JOptionPane.showMessageDialog(null,"Es un ciclo infinito");
    }
    public static void Ejercicio6(){
        JOptionPane.showMessageDialog(null,"Ejercicio 6");
        int [] n={0,1,0,-1};
        for (int i=1;i<n.length;i++)
            if(n[i]==0&&n[i-1]!=0){
                int x=n[i-1];
                n[i-1]=n[i];
                n[i]=x;
            }
        JOptionPane.showMessageDialog(null,"El Valor  es: "+n[2]);
    }
    
    public static void opciones(){
       int op;
        do {   
            
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Mostrar Ejercicio 1\n"
                    + "2.- Mostrar Ejercicio 2\n"
                    + "3.- Mostrar Ejercicio 3\n"
                    + "4.- Mostrar Ejercicio 4\n"
                    + "5.- Mostrar Ejercicio 5\n"
                    + "6.- Mostrar Ejercicio 6\n"
                    + "7.- Salir\ningrese opcion"));
            switch(op){
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                    case 6:
                    Ejercicio6();
                    break;
            }
        } while (op!=7);
    }
}