public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Недопустимое значение возраста");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        String excText = "Для формирования объекта класса Person необходимо указать ";

        if (name == null) {
            throw new IllegalStateException(excText + "имя.");
        }
        if (surname == null) {
            throw new IllegalStateException(excText + "фамилию.");
        }
        return new Person(this);
    }
}
