class Author {
    private String name;
    private String surname;
    private int age;
    private String country;

    public Author(String name, String surname, int age, String country) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + age + ", " + country + ")";
    }
}