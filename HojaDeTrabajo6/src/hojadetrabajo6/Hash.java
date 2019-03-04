//package hojadetrabajo6;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author Gerardo
 * @param <K>
 * @param <V>
 */
public class Hash<K,V> extends AbstractMap<K,V>
{
    private HashMap<K,V> datos;
    
    public Hash()
    {
        this.datos = new HashMap();
    }
    /**
     * @return 
     * @post returns the number of entries in the map
     */
    @Override
    public int size(){
        return datos.size();
    }

    /**
     * @return 
     * @post returns true iff this map does not contain any entries
     */
    @Override
    public boolean isEmpty()
    {
        return datos.isEmpty();
    }

    /**
     * @param k
     * @return 
     * @pre k is non-null
     * @post returns true iff k is in the domain of the map
     */
    @Override
    public boolean containsKey(K k)
    {
        return datos.containsKey(k);
    }

    /**
     * @param v
     * @return 
     * @pre v is non-null
     * @post returns true iff v is the target of at least one map entry;
     * that is, v is in the range of the map
     */
    @Override
    public boolean containsValue(V v)
    {
        return datos.containsValue(v);
    }

    /**
     * @param k
     * @return 
     * @pre k is a key, possibly in the map
     * @post returns the value mapped to from k, or null
     */
    @Override
    public V get(K k)
    {
        return datos.get(k);
    }

    /**
     * @param k
     * @param v
     * @return 
     * @pre k and v are non-null
     * @post inserts a mapping from k to v in the map
     */
    @Override
    public V put(K k, V v)
    {
        V value = datos.put(k, v);
        return value;
    }
    
    /**
     * @param k
     * @return 
     * @pre k is non-null
     * @post removes any mapping from k to a value, from the mapping
     */
    @Override
    public V remove(K k)
    {
        V value = datos.remove(k);
        return value;
    }

    /**
     * @param other
     * @pre other is non-null
     * @post all the mappings of other are installed in this map,
     * overriding any conflicting maps
     */
    @Override
    
    public void putAll(Map<K,V> other)
    {
        datos.putAll(other);
    }

    /**
     * @post removes all map entries associated with this map
     */
    @Override
    public void clear()
    {
        datos.clear();
    }

    /**
     * @return 
     * @post returns a set of all keys associated with this map
     */
    @Override
    public Set<K> keySet()
    {
        return datos.keySet();
    }
    
    /**
     *
     * @return
     * @post returns a set of all keys and entries associated with this map
     */
    @Override
    public Set<Entry<K,V>> entrySet()
    {
        return datos.entrySet();
    }

    /**
     * @param other
     * @return 
     * @pre other is non-null
     * @post returns true iff maps this and other are entry-wise equal
     */
    @Override
    public boolean equals(Object other)
    {
        return datos.equals(other);
    }
    
    /**
     * @return 
     * @post returns a hash code associated with this structure
     */
    @Override
    public int hashCode()
    {
        return datos.hashCode();
    }
    
    /**
     * Muestra los elementos que existen dentro del map
     */
    @Override
    public void display()
    {
        Set<K> set = datos.keySet();
        set.forEach((name) -> {
            String key = name.toString();
            String value = datos.get(name).toString();
            System.out.println("Carta: " + key + " / Tipo: " + value);
        });
    }
    
    /**
     * Muestra los elementos que existen dentro del map de manera ordenada
     */
    @Override
    public void displayOrdenado() 
    {
        Set<K> set = datos.keySet();
        System.out.println("Las cartas tipo MONSTRUO son:");
        set.forEach((name) -> {
            String key = name.toString();
            String value = datos.get(name).toString();
            if(value.equals("Monstruo"))
                System.out.println("- " + key);
        });
        System.out.println("");
        System.out.println("");
        System.out.println("Las cartas tipo HECHIZO son:");
        set.forEach((name) -> {
            String key = name.toString();
            String value = datos.get(name).toString();
            if(value.equals("Hechizo"))
                System.out.println("- " + key);
        });
        System.out.println("");
        System.out.println("");
        System.out.println("Las cartas tipo TRAMPA son:");
        set.forEach((name) -> {
            String key = name.toString();
            String value = datos.get(name).toString();
            if(value.equals("Trampa"))
                System.out.println("- " + key);
        });
    }
}
