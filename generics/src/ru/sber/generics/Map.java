package ru.sber.generics;

public interface Map<K, V> {
    int size();
    boolean isEmpty();
    boolean containsKey(K key);
    boolean containsValue(V value);
    V get(K key);
    V put(K key, V value);
    V remove(K key);
    void clear();
    Collection<V> values();
    Collection<K> keySet();
    Collection<KeyValue<K, V>> entrySet();
}