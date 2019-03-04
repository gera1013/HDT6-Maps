package hojadetrabajo6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
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
        String salto;
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
            String[] parts = line.split("[|]", 2);
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
        
        while(y != 7)
        {
            try
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
                salto = scan.nextLine();
                    
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
                    salto = scan.nextLine();
                }
            } catch(InputMismatchException e)
            {
                System.out.println("Ingrese solamente numeros por favor");
                System.exit(0);
            }
            
            switch(y)
            {
                case 1:
                    System.out.println("Ingrese el nombre de la carta que desea agregar ");
                    String carta = scan.nextLine();
                    if(mapitaBaraja.containsKey(carta))
                    {
                        mapita.put(carta, mapitaBaraja.get(carta));
                        System.out.println("La carta " + carta + " se ha agregado con exito ");
                    }
                    else
                    {
                        System.out.println("La carta " + carta + " no se encuentra en la coleccion");
                    }
                break;
                
                case 2:
                    System.out.println("Ingrese el nombre de la carta ");
                    carta = scan.nextLine();
                    if(mapitaBaraja.containsKey(carta))
                        System.out.println("La carta " + carta + " es de tipo " + mapitaBaraja.get(carta));
                    else
                    {
                        System.out.println("La carta " + carta + " no se encuentra en la coleccion");
                    }
                break;
                
                case 3:
                    int contMonstruo = 0;
                    int contHechizo = 0;
                    int contTrampa = 0;
                    Set<String> set = mapita.keySet();
                    System.out.println("Estas son las cartas que hay en tu coleccion: ");
                    System.out.println("");
                    for(String name : set){
                        String value = mapita.get(name).toString();
                        if(value.equals("Monstruo"))
                            contMonstruo += 1;
                        if(value.equals("Hechizo"))
                            contHechizo += 1;
                        if(value.equals("Trampa"))
                            contTrampa += 1;
                    }
                    String cont1 = String.valueOf(contMonstruo);
                    String cont2 = String.valueOf(contHechizo);
                    String cont3 = String.valueOf(contTrampa);
                    mapita.display();
                    System.out.println("Hay un total de " + cont1 + " cartas de tipo Monstruo");
                    System.out.println("Hay un total de " + cont2 + " cartas de tipo Hechizo");
                    System.out.println("Hay un total de " + cont3 + " cartas de tipo Trampa");
                    System.out.println("");
                break;
                
                case 4:
                    contMonstruo = 0;
                    contHechizo = 0;
                    contTrampa = 0;
                    set = mapita.keySet();
                    System.out.println("Estas son las cartas que hay en tu coleccion: ");
                    System.out.println("");
                    for(String name : set){
                        String value = mapita.get(name).toString();
                        if(value.equals("Monstruo"))
                            contMonstruo += 1;
                        if(value.equals("Hechizo"))
                            contHechizo += 1;
                        if(value.equals("Trampa"))
                            contTrampa += 1;
                    }
                    cont1 = String.valueOf(contMonstruo);
                    cont2 = String.valueOf(contHechizo);
                    cont3 = String.valueOf(contTrampa);
                    mapita.display();
                    System.out.println("Hay un total de " + cont1 + " cartas de tipo Monstruo");
                    System.out.println("Hay un total de " + cont2 + " cartas de tipo Hechizo");
                    System.out.println("Hay un total de " + cont3 + " cartas de tipo Trampa");
                    System.out.println("");
                break;
                
                case 5:
                    System.out.println("Estas son las cartas que se encuentran almacenadas en la coleccion: ");
                    System.out.println("");
                    mapitaBaraja.display();
                break;
                
                case 6:
                    System.out.println("Estas son las cartas que se encuentran almacenadas en la coleccion: ");
                    System.out.println("");
                    mapitaBaraja.displayOrdenado();
                break;
                
                case 7:
                    System.out.println("Cerrando sistema...");
                    System.out.close();
                break;
                
                default:
                    System.out.println("");
                break;
            }  
        }
    }
}
