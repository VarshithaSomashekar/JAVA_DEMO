public class Person {      //POJO
    final static int minAge = 18;   //FINAL
    final static int maxAge = 60; 
    int age;
    String name;
    public int getAge() {
        return age;
    }
    public Person(int age, String name) {
        setAge(age);
        setName(name);
    }
    public void setAge(int age) {
        if( age < minAge || age > maxAge){
            throw new IllegalArgumentException("Enter correct age");
        }
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}