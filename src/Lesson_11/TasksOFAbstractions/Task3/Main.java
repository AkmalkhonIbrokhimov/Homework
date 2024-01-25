package Lesson_11.TasksOFAbstractions.Task3;

public class Main {
    public static void main(String[] args) {
    Computer computer = new Acer("Acer Aspire 7 Core i5 12th","(8GB/512GB SSD)");
    computer.showInfo();

    HP hp = new HP("CORE i5 - 1135G7","DDR4 8GB  256GB M.2 Nvme SSD ");
    hp.showInfo();
    }
}
