package HomeWork04;

import java.util.Arrays;

public class myCollection<T extends Comparable<T>> {
    private T[] collection;
    private int size;
    private int length;

    public myCollection(T[] collection) {
        this.length = collection.length;
        this.size = (this.length) / 8 * 8 + 8;
        this.collection = (T[]) new Comparable[this.size];
        for (int index = 0; index < this.length; index++) {
            this.collection[index] = collection[index];
        }
    }

    public myCollection() {
        this((T[]) new Comparable[0]);
    }

    public String toString() {
        T[] temp = (T[]) new Comparable[length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = this.collection[i];
        }
        return String.format("MyCollection: %s", Arrays.toString(temp));
    }

    public void add(T item) {
        collection[length++] = item;
        if (length == size) {
            this.size = (this.length) / 8 * 8 + 8;
            T[] tempCollection = (T[]) new Comparable[this.size];
            for (int index = 0; index < this.length; index++) {
                tempCollection[index] = this.collection[index];
            }
            this.collection = tempCollection;
        }
    }

    public T get(int i) {
        return (T) collection[i];
    }

    public void set(int index, T item) {
        this.collection[index] = item;
    }

    public void del(int index) {
        if (index >= 0 && index < length) {
            this.length--;
            for (int i = index; i < length; i++) {
                collection[i] = collection[i + 1];
            }
        }
        if ((size-length)/8>0){
            this.size = (this.length) / 8 * 8 + 8;
            T[] tempCollection = (T[]) new Comparable[this.size];
            for (int i= 0; i < this.length; i++) {
                tempCollection[i] = this.collection[i];
            }
            this.collection = tempCollection;
        }
    }

    public T remove(int index) {
        T item = null;
        if (index >= 0 && index < length) {
            item = collection[index];
            del(index);
        }
        return item;
    }

    public void delItemEqual(T item) {
        int index = 0;
        while (index < this.length) {
            if (this.collection[index].equals(item)) {
                del(index);
            } else {
                index++;
            }
        }
    }

    public T getMin() {
        if (length == 0) {
            return (T) null;
        } else {
            T min = collection[0];
            for (int i = 1; i < length; i++) {
                if (((Comparable<T>) (this.collection[i])).compareTo(min) < 0) {
                    min = (T) collection[i];
                }
            }
            return min;
        }
    }

    public T getMax() {
        if (length == 0) {
            return (T) null;
        } else {
            T max = collection[0];
            for (int i = 1; i < length; i++) {
                if (((Comparable<T>) (this.collection[i])).compareTo(max) > 0) {
                    max = (T) collection[i];
                }
            }
            return max;
        }
    }

    public T getSum() {
        if (collection[0] instanceof Integer) {
            Integer sum = 0;
            for (int i = 0; i < length; i++) {
                sum = sum + (Integer) collection[i];
            }
            return (T) sum;
        }
        if (collection[0] instanceof Double) {
            Double sum = 0.;
            for (int i = 0; i < length; i++) {
                sum = sum + (Double) collection[i];
            }
            return (T) sum;
        }
        return null;
    }

    public T getProd() {
        if (collection[0] instanceof Integer) {
            Integer prod = 1;
            for (int i = 0; i < length; i++) {
                prod = prod * (Integer) collection[i];
            }
            return (T) prod;
        }
        if (collection[0] instanceof Double) {
            Double prod = 1.;
            for (int i = 0; i < length; i++) {
                prod = prod * (Double) collection[i];
            }
            return (T) prod;
        }
        return null;
    }

    public int findIndexOfItem(T item) {
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (collection[i].equals(item)) {
                return i;
            }
        }
        return index;
    }

    public boolean containsItem(T item) {
        for (int i = 0; i < length; i++) {
            if (collection[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    private void toSwap(int index1, int index2) {
        T temp = collection[index1];
        collection[index1] = collection[index2];
        collection[index2] = temp;
    }

    public void bubbleSort() {
        for (int out = length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (collection[in].compareTo(collection[in + 1]) > 0)
                    toSwap(in, in + 1);
            }
        }
    }

    public void insertionSort() {
        int j;
        for (int i = 1; i < length; i++) {
            T temp = collection[i];
            for (j = i; j > 0 && temp.compareTo(collection[j - 1]) < 0; j--) {
                collection[j] = collection[j - 1];
            }
            collection[j] = temp;
        }
    }

    public void selectionSort() {
        for (int i = 0; i < length; i++) {
            int pos = i;
            T min = collection[i];
            for (int j = i + 1; j < length; j++) {
                if (collection[j].compareTo(min) < 0) {
                    pos = j;
                    min = collection[j];
                }
            }
            collection[pos] = collection[i];
            collection[i] = min;
        }
    }

    public int length() {
        return this.length;
    }

}