package expert.os.examples.mapping;


import java.util.Objects;

@Entity
public class Pet {

    @Column
    private String name;

    @Column
    private int age;

    @Deprecated
    public Pet() {
    }

    private Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Pet of(String name, int age) {
        return new Pet(name, age);
    }
}
