
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кто вы? (введите животное): ");
        String userAnimal = scanner.nextLine();

        try {
            GardenAccessValidator.checkAnimalAccess(userAnimal);
            System.out.println("Добро пожаловать в морковный сад!");
        } catch (NotAZaikaException e) {
            System.out.println("Ошибка доступа: " + e.getMessage());
        }
    }
}