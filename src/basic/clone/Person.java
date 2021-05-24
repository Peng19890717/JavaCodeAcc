package basic.clone;

public class Person implements Cloneable{

    public Person(String name, int age, String email, String desc) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.desc = desc;
    }

    // 姓名
    private String name;
    // 年龄
    private int age;
    // 邮件
    private String email;
    // 描述
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

