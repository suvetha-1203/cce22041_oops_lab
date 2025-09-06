import java.util.Scanner;

// Base class
class Question {
    protected String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    // Method to calculate marks (default)
    public int calculateMarks(boolean correct) {
        return correct ? 1 : 0; // default 1 mark
    }

    public void displayResult(boolean correct) {
        System.out.println("\nQuestion: " + questionText);
        System.out.println("Correct? " + correct);
        System.out.println("Marks Awarded: " + calculateMarks(correct));
    }
}

// Derived class - Multiple Choice Question
class MCQ extends Question {
    public MCQ(String questionText) {
        super(questionText);
    }

    @Override
    public int calculateMarks(boolean correct) {
        return correct ? 2 : 0; // MCQ = 2 marks
    }
}

// Derived class - True/False Question
class TrueFalse extends Question {
    public TrueFalse(String questionText) {
        super(questionText);
    }

    @Override
    public int calculateMarks(boolean correct) {
        return correct ? 1 : 0; // True/False = 1 mark
    }
}

// Derived class - Short Answer Question
class ShortAnswer extends Question {
    public ShortAnswer(String questionText) {
        super(questionText);
    }

    @Override
    public int calculateMarks(boolean correct) {
        return correct ? 5 : 0; // Short Answer = 5 marks
    }
}

// Main class with roll number included
public class CCE22041_OnlineExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Roll Number: CCE22041");
        System.out.println("Welcome to Online Exam System!\n");

        // Input question type
        System.out.print("Enter question type (MCQ/TrueFalse/ShortAnswer): ");
        String type = scanner.nextLine();

        // Input question text
        System.out.print("Enter question text: ");
        String text = scanner.nextLine();

        // Input if student answered correctly
        System.out.print("Did the student answer correctly? (true/false): ");
        boolean correct = scanner.nextBoolean();

        Question q;

        // Polymorphism in action
        if (type.equalsIgnoreCase("MCQ")) {
            q = new MCQ(text);
        } else if (type.equalsIgnoreCase("TrueFalse")) {
            q = new TrueFalse(text);
        } else if (type.equalsIgnoreCase("ShortAnswer")) {
            q = new ShortAnswer(text);
        } else {
            q = new Question(text);
        }

        // Display result
        q.displayResult(correct);

        scanner.close();
    }
}
