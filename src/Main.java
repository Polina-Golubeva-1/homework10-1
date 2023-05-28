public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System system = new System();
        System newSystem = (System) system.clone();
        system.setName("Sophie");
        system.setAge(15);
        system.setGender("Women");
        newSystem.setName("Alex");
        newSystem.setAge(46);
        newSystem.setGender("Men");


        java.lang.System.out.println(system);
        java.lang.System.out.println(newSystem);
        java.lang.System.out.println(newSystem.equals(system));
    }
}