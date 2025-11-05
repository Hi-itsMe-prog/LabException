public class GardenAccessValidator {
    private static final String ALLOWED_ANIMAL = "заяц";

    public static void checkAnimalAccess(String animalType) throws NotAZaikaException {
        if (!ALLOWED_ANIMAL.equalsIgnoreCase(animalType)) {
            throw new NotAZaikaException("В морковный сад пускают только зайцев! А вы - " + animalType);
        }
    }
}
