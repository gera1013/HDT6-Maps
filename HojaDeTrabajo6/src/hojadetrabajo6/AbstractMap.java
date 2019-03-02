package hojadetrabajo6;

import java.util.*;

/**
 *
 * @author Gerardo
 * @param <K>
 * @param <V>
 */
public abstract class AbstractMap<K,V> implements iMap<K,V>
{
    /**
     * @return 
     * @post returns the number of entries in the map
     */
    @Override
    abstract public int size();

    /**
     * @return 
     * @post returns true iff this map does not contain any entries
     */
    @Override
    abstract public boolean isEmpty();

    /**
     * @param k
     * @return 
     * @pre k is non-null
     * @post returns true iff k is in the domain of the map
     */
    @Override
    abstract public boolean containsKey(K k);

    /**
     * @param v
     * @return 
     * @pre v is non-null
     * @post returns true iff v is the target of at least one map entry;
     * that is, v is in the range of the map
     */
    @Override
    abstract public boolean containsValue(V v);

    /**
     * @param k
     * @return 
     * @pre k is a key, possibly in the map
     * @post returns the value mapped to from k, or null
     */
    @Override
    abstract public V get(K k);

    /**
     * @param k
     * @param v
     * @return 
     * @pre k and v are non-null
     * @post inserts a mapping from k to v in the map
     */
    @Override
    abstract public V put(K k, V v);
    
    /**
     * @param k
     * @return 
     * @pre k is non-null
     * @post removes any mapping from k to a value, from the mapping
     */
    @Override
    abstract public V remove(K k);

    /**
     * @param other
     * @pre other is non-null
     * @post all the mappings of other are installed in this map,
     * overriding any conflicting maps
     */
    @Override
    abstract public void putAll(Map<K,V> other);

    /**
     * @post removes all map entries associated with this map
     */
    @Override
    abstract public void clear();

    /**
     * @return 
     * @post returns a set of all keys associated with this map
     */
    @Override
    abstract public Set<K> keySet();

    /**
     * @param other
     * @return 
     * @pre other is non-null
     * @post returns true iff maps this and other are entry-wise equal
     */
    @Override
    abstract public boolean equals(Object other);
    
    /**
     * @return 
     * @post returns a hash code associated with this structure
     */
    @Override
    abstract public int hashCode();
}
