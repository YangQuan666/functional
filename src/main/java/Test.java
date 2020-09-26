import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: yangquan6
 * @create: 2020-09-23 14:22
 */
class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}

public class Test {


    public static void main(String[] args) {
        List<User> list = Arrays.asList(new User("yang",24),new User("quan",25),new User("java",15));
        doChange(list);
        list.forEach(System.out::println);
    }

    private static void doChange(List<User> list) {
        list.forEach(user -> {
            user.setName("hello");
            user.setAge(10);
        });
    }
}
