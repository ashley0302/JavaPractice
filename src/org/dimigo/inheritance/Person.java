package org.dimigo.inheritance;

public class Person {
    private String name;
    public Person(String name){
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("안녕하세요.");
    }
    public void sayBye() {
        System.out.println("안녕히 계세요.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}




