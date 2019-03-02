/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Gerardo
 */
public class HojaDeTrabajo6 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Set set;
        Iterator iterator;
        Scanner scan = new Scanner(System.in);
        
        int x = 0;
        
        try
        {
            while(x >= 4 || x <= 0)
            {
                System.out.println("");
                System.out.println("PRESIONA 1 utilizar la implementacion de Hash Maps");
                System.out.println("PRESIONA 2 utilizar la implementacion de Tree Maps");
                System.out.println("PRESIONA 3 utilizar la implementacion de Linked Hash Maps");
                System.out.println("");
                x = scan.nextInt();
            }
        } catch(InputMismatchException e){
            System.out.println("Ingrese solamente numeros por favor");
            System.exit(0);
        }
        
        MapFactory factory = new MapFactory();
        iMap mapitaDeck = factory.getMap(x);
        iMap mapitaBaraja = factory.getMap(x);
        
        mapitaDeck.put(1, "YOLO");
        mapitaDeck.put(2, "NANU");
        mapitaDeck.put(3, "PIP");
        mapitaDeck.put(4, "LOL");
        
        set = mapitaDeck.entrySet();
        iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
