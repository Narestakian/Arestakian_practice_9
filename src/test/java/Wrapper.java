public class Wrapper<T> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>("Hello World");
        System.out.println("String value: " + stringWrapper.getValue());
        Wrapper<Double> doubleWrapper = new Wrapper<>(3.14);
        System.out.println("Double value: " + doubleWrapper.getValue());
        stringWrapper.setValue("Goodbye");
        System.out.println("Updated String value: " + stringWrapper.getValue());
    }

}






