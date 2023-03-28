package ru.sber.generics;

import java.util.Objects;
public class KeyValue<K,V> {
    public K key;
    public V value;
    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof KeyValue<?,?> other) {
            return false;
        }
        KeyValue other = (KeyValue) obj;
        return Objects.equals(this.key, other.key) && Objects.equals(this.value, other.value);
    }

    public int hashCode() {
        return Objects.hashCode(this.key);
    }
}