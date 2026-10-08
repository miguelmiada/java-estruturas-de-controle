import java.time.OffsetDateTime;

public class Person {

    private final String name; // final para garantir que o nome não seja alterado após a criação do objeto
    private int age;
    private int lastYearAgeInc = OffsetDateTime.now().getYear() - 1;


    // o -1 no lastYearAgeInc é para garantir que a primeira vez que incAge() for chamado, ele permita incrementar a idade (aumentar), já que o ano atual será maior que lastYearAgeInc.

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    

    public int getAge() {
        return this.age;
    }

    public void incAge() {
        int currentYear = OffsetDateTime.now().getYear();
        if (this.lastYearAgeInc >= currentYear) return;

        this.age += 1;
        this.lastYearAgeInc = currentYear;
    }
}