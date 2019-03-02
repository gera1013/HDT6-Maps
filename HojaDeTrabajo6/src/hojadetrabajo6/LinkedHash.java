/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Gerardo
 * @param <K>
 * @param <V>
 */
public class LinkedHash<K,V> extends AbstractMap<K,V> 
{
    private LinkedHashMap<K,V> datos;
    
    public LinkedHash()
    {
        this.datos = new LinkedHashMap();
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
}
