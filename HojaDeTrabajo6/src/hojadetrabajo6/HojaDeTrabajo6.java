package hojadetrabajo6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Scanner scan = new Scanner(System.in);
        
        int x = 0;
        
        try
        {
            while(x >= 4 || x <= 0)
            {
                System.out.println("");
                System.out.println("PRESIONA 1 para utilizar la implementacion de Hash Maps");
                System.out.println("PRESIONA 2 para utilizar la implementacion de Tree Maps");
                System.out.println("PRESIONA 3 para utilizar la implementacion de Linked Hash Maps");
                System.out.println("");
                x = scan.nextInt();
            }
        } catch(InputMismatchException e)
        {
            System.out.println("Ingrese solamente numeros por favor");
            System.exit(0);
        }
        
        MapFactory factory = new MapFactory();
        iMap mapita = factory.getMap(x);
        iMap mapitaBaraja = factory.getMap(x);
        
        String filePath = "cartas.txt";

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                mapitaBaraja.put(key, value);
            } else 
            {
                System.out.println("ignoring line: " + line);
            }
        }
        
        reader.close();
        
        int y = 0;
        
        try
        {
            while(y >= 8 || y <= 0)
            {
                System.out.println("");
                System.out.println("PRESIONA 1 para AGREGAR UNA CARTA A TU COLECCION");
                System.out.println("PRESIONA 2 para MOSTRAR EL TIPO DE UNA CARTA");
                System.out.println("PRESIONA 3 para MOSTRAR NOMBRE, TIPO Y CANTIDAD");
                System.out.println("PRESIONA 4 para MOSTRAR NOMBRE, TIPO Y CANTIDAD (ORDENADO)");
                System.out.println("PRESIONA 5 para NOMBRE Y TIPO ");
                System.out.println("PRESIONA 6 para NOMBRE Y TIPO (ORDENADO)");
                System.out.println("PRESIONA 7 para SALIR");
                System.out.println("");
                y = scan.nextInt();
            }
        } catch(InputMismatchException e)
        {
            System.out.println("Ingrese solamente numeros por favor");
            System.exit(0);
        }
        
        switch(y)
        {
            case 1:
                //
            case 2:
                //
            case 3:
                //
            case 4:
                //
            case 5:
                //
            case 6:
                //
            case 7:
                //
            default:
                break;
        }
    }
}
