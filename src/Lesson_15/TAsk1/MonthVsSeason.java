package Lesson_15.TAsk1;

public enum MonthVsSeason {
    JANUARY(){
        @Override
        void showInfo() {
            System.out.println("Siz Kish fasliga oyit oy ni tanladingiz");
        }
    },
    FEBRUARY() {
        @Override
        void showInfo() {
            System.out.println("Siz Kish fasliga oyit oy ni tanladingiz");
        }
    },MARCH() {
        @Override
        void showInfo() {
            System.out.println("Siz Bahor fasliga oyit oy ni tanladingiz");
        }
    },APRIL() {
        @Override
        void showInfo() {
            System.out.println("Siz Bahor fasliga oyit oy ni tanladingiz");
        }
    },MAY() {
        @Override
        void showInfo() {
            System.out.println("Siz Bahor fasliga oyit oy ni tanladingiz");
        }
    },JUNE() {
        @Override
        void showInfo() {
            System.out.println("Siz Yoz fasliga oyit oy ni tanladingiz");
        }
    },JULY() {
        @Override
        void showInfo() {
            System.out.println("Siz Yoz fasliga oyit oy ni tanladingiz");
        }
    },AUGUST() {
        @Override
        void showInfo() {
            System.out.println("Siz Yoz fasliga oyit oy ni tanladingiz");
        }
    },SEPTEMBER() {
        @Override
        void showInfo() {
            System.out.println("Siz Kuz fasliga oyit oy ni tanladingiz");
        }
    },OCTOBER() {
        @Override
        void showInfo() {
            System.out.println("Siz Kuz fasliga oyit oy ni tanladingiz");
        }
    },NOVEMBER() {
        @Override
        void showInfo() {
            System.out.println("Siz Kuz fasliga oyit oy ni tanladingiz");
        }
    },DECEMBER() {
        @Override
        void showInfo() {
            System.out.println("Siz Kish fasliga oyit oy ni tanladingiz");
        }
    };

    abstract void showInfo();
}
