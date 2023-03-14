package ru.sber.collection;

import java.util.Objects;

class KeyValue {

    public Object key;

    public Object value;

    public KeyValue(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object.getClass() != this.getClass()) {
            return false;
        }
        KeyValue other = (KeyValue) object;
        return Objects.equals(this.key, other.key) && Objects.equals(this.value, other.value);
    }

    public int hashCode() {
        return Objects.hashCode(this.key);
    }
}
