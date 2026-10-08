public class Main {

    public static void main(String[] args) {

        var male = new Person("João" , 30);
        male.incAge();
        var female = new Person("Maria" , 25);
        female.incAge();

    System.out.println("Nome do homem: " + male.getName() + " | Idade: " + male.getAge());
    System.out.println("Nome da mulher: " + female.getName() + " | Idade: " + female.getAge());

    }
}