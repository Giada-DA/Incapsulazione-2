import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println("Inserisci i tuoi dati");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci nome: ");
        String name = scanner.nextLine();
        System.out.println("Inserisci cognome: ");
        String surname = scanner.nextLine();
        System.out.println("Inserisci altezza (es. 1,60): ");
        double height = Math.floor(scanner.nextDouble()*100.0)/100.0;
        System.out.println("Inserisci età: ");
        int age = scanner.nextInt();

        Person persona = new Person();
        persona.setName(name);
        persona.setSurname(surname);
        persona.setHeight(height);
        persona.setAge(age);

        System.out.println("Nome: " + persona.getName() + ", cognome: " + persona.getSurname() + ", altezza: " + height + " e età: " + persona.getAge());
        //richiamando il metodo toString
        System.out.println(persona.toString());
    }
}
