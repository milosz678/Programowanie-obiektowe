package hello;

public class Greeting {
    private final long id;
    private final String name;
    private final String age;
    private final String sex;

    public Greeting(long id, String age, String name, String sex) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}