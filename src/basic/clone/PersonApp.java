package basic.clone;

import java.util.concurrent.ConcurrentHashMap;

public class PersonApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 初始化一个对象
        Person person = new Person("liup",20,"123456@qq.com","I'm liupeng");
        // 复制对象
        Person person1 = person;
        // 改变 person1 的属性值
        person1.setName("lp");
        System.out.println("person:"+person);
        System.out.println("person1:"+person1);

        Person person2 = (Person)person.clone();
        person2.setName("clone object");
        System.out.println("person:"+person);
        System.out.println("person2:"+person2);
        ConcurrentHashMap map = new ConcurrentHashMap();

    }
}
