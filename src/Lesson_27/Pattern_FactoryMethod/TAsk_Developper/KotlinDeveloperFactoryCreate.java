package Lesson_27.Pattern_FactoryMethod.TAsk_Developper;

public class KotlinDeveloperFactoryCreate implements DeveloperFactory{
    @Override
    public Developer createDevelopper() {
        return new KotlinDeveloper();
    }
}
