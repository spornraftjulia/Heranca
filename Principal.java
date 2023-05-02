public class Principal {

    public static void main(String[] args) {
        Dog dog = new Dog("Pandora", 4);
        Cat cat = new Cat("Maya", 1);

        System.out.println(dog.getNome());
        System.out.println(dog.getIdade()); 

        System.out.println(cat.getNome());
        System.out.println(cat.getIdade());
    }
        
    }
