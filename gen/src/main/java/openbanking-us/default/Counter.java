public interface Counter<T> {
    void increment();
    
    void decrement();
    
    T getCount();
}

