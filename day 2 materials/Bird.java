public class Bird {
    private String name;

    private int age;

    // this constructs the object! whem you call this object, you will be able to add these as arguments!
    public Bird(String name, int age) {
        this.name = name;

        // what's wrong here
        age = age;

    }

    /* Getters and setters are very important in java
     * It is not good practice to make variables public, unless you have a really good reason to do so
     */

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int get() {
        return age;
    }

    // why doesn't this work?
    private void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("chirp");
    }
}
