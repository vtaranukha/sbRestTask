package sb.restTask;

public class Member {
    private final String name;
    private final Integer age;
    public Member(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}