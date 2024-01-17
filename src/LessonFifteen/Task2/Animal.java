package LessonFifteen.Task2;

public enum Animal {
    DOG() {
        @Override
        void showInfo() {
            System.out.println("WOw- wow -wow");
        }
    }, CAT() {
        @Override
        void showInfo() {
            System.out.println("miau-miau-miau");
        }
    }, BIRD() {
        @Override
        void showInfo() {
            System.out.println("chik-chirik");
        }
    }, COW() {
        @Override
        void showInfo() {
            System.out.println("Mu-mu-mu");
        }
    }, ELEFANT() {
        @Override
        void showInfo() {
            System.out.println("Fuu-fuu");
        }
    };


    abstract void showInfo();
}
