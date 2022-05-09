import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;
    protected boolean hasAge;
    protected boolean hasCity;


    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.city = builder.city;
    }

    public void setCity(String city) {
        this.city = city;
        this.hasCity = true;
    }

    public void happyBirthday() {
        age++;
        this.hasAge = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder()
                .setSurname(surname)
                .setCity(city);
        return builder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", hasAge=" + hasAge +
                ", hasCity=" + hasCity +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean isHasAge() {
        return hasAge;
    }

    public boolean isHasCity() {
        return hasCity;
    }
}
