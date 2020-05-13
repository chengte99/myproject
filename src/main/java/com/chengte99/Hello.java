package com.chengte99;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();
        String name = "abcde";
        name = null;
        System.out.println(name.charAt(3));
        System.out.println(name.length());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));

        Person p = new Person("Kevin", 70.5f, 1.77f);
//        p.weight = 70.5f;
//        p.height = 1.77f;
        System.out.println(p.bmi());
        p.hello();

        int score = 88;
        System.out.println(score >= 80 && score < 85);
        char c = 'A';
        System.out.println(c > 'a');

        /*int age = 19;
        Integer age2 = 23;
        char c = 'A';
        Character c2 = 'B';
        float weight = 66.5f;
        Float height = 123.3f;
        byte b = 123;
        boolean isEnable = true;
        Boolean isOK = isEnable;
        String name = "kevin";*/
    }
}
