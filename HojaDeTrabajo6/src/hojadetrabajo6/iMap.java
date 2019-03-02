package hojadetrabajo6;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Gerardo
 * @param <K>
 * @param <V>
 */
public interface iMap<K,V>
{
    /**
     * @return 
     * @post returns the number of entries in the map
     */
    public int size();

    /**
     * @return 
     * @post returns true iff this map does not contain any entries
     */
    public boolean isEmpty();

    /**
     * @param k
     * @return 
     * @pre k is non-null
     * @post returns true iff k is in the domain of the map
     */
    public boolean containsKey(K k);

    /**
     * @param v
     * @return 
     * @pre v is non-null
     * @post returns true iff v is the target of at least one map entry;
     * that is, v is in the range of the map
     */
    public boolean containsValue(V v);

    /**
     * @param k
     * @return 
     * @pre k is a key, possibly in the map
     * @post returns the value mapped to from k, or null
     */
    public V get(K k);

    /**
     * @param k
     * @param v
     * @return 
     * @pre k and v are non-null
     * @post inserts a mapping from k to v in the map
     */
    public V put(K k, V v);
    
    /**
     * @param k
     * @return 
     * @pre k is non-null
     * @post removes any mapping from k to a value, from the mapping
     */
    public V remove(K k);

    /**
     * @param other
     * @pre other is non-null
     * @post all the mappings of other are installed in this map,
     * overriding any conflicting maps
     */
    public void putAll(Map<K,V> other);

    /**
     * @post removes all map entries associated with this map
     */
    public void clear();

    /**
     * @return 
     * @post returns a set of all keys associated with this map
     */
    public Set<K> keySet();
    
    /**
     *
     * @return
     * @post returns a set of all keys and entries associated with this map
     */
    public Set<Entry<K,V>> entrySet();

    /**
     * @param other
     * @return 
     * @pre other is non-null
     * @post returns true iff maps this and other are entry-wise equal
     */
    @Override
    public boolean equals(Object other);
    
    /**
     * @return 
     * @post returns a hash code associated with this structure
     */
    @Override
    public int hashCode();
}
