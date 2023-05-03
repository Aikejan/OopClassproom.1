public class Programming {
    String name;
    String surName;
    int age;
    public Programming(){
    }

    public Programming(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    public int ageProramming(int a){
        return a;
    }

    @Override
    public String toString() {
        return "name: " + name + '\'' +
                " surName: " + surName + '\'' +
                " age: " + age;
    }

}
