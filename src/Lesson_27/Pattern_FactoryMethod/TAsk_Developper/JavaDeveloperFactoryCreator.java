package Lesson_27.Pattern_FactoryMethod.TAsk_Developper;

public class JavaDeveloperFactoryCreator implements DeveloperFactory{
    @Override
    public Developer createDevelopper() {
        return new JavaDeveloper();
    }
}
