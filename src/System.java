import java.awt.desktop.SystemSleepEvent;
import java.util.Date;
import java.util.Objects;

public class System implements Cloneable {
    private String name;
    private int age;
    private String gender;


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        System system = (System) o;
        return age == system.age && gender == system.gender && Objects.equals(name, system.name);
    }

    @Override
    public int hashCode() {
        return (int) (19 * name.hashCode() * gender.hashCode() * (new Date().getTime()));
    }

    @Override
    public String toString() {
        return "System{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}