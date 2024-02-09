package expert.os.examples;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }


    public String speakEnglish() {
        return "Hello, my name is " + name;
    }

    public String speakPortuguese() {
        return "Olá, me chamo " + name;
    }
}
