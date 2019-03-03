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
        iMap mapita = factory.getMap(x);
        iMap mapitaBaraja = factory.getMap(x);
        
        
    }
}
