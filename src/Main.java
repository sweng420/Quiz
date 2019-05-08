import Data.Flashcard;
import Data.Deck;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int QUESTIONS = 3;

    private static ArrayList<Flashcard> testStrings = new ArrayList<>();
    private static Deck cards = new Deck();


    public static void main(String[] args) throws IOException {

        // create flashcards
        addCards();

        // create questions
        testStrings = cards.createQuestions(QUESTIONS);

        // ask questions and check answers
        for (int i = 0; i < QUESTIONS; i++) {

            // write answer for user to copy
            System.out.println( testStrings.get(i).getInteger() );

            // Read answer in from user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String answer = reader.readLine();

            // check if user answer was right
            if (testStrings.get(i).checkStringAnswer(answer)) {
                System.out.println("RIGHT");
            } else {
                System.out.println("WRONG");
            }
        }

        testStrings.clear();

    }

    public static void addCards(){
        // create flashcards
        cards.getFlashcards().add(new Flashcard("zero", 0, 3));
        cards.getFlashcards().add(new Flashcard("one", 1, 3));
        cards.getFlashcards().add(new Flashcard("two", 2, 1));
        cards.getFlashcards().add(new Flashcard("three", 3, 3));
        cards.getFlashcards().add(new Flashcard("four", 4, 3));
        cards.getFlashcards().add(new Flashcard("five", 5, 3));
        cards.getFlashcards().add(new Flashcard("six", 6, 3));
        cards.getFlashcards().add(new Flashcard("seven", 7, 3));
        cards.getFlashcards().add(new Flashcard("eight", 8, 3));
        cards.getFlashcards().add(new Flashcard("nine", 9, 3));
        cards.getFlashcards().add(new Flashcard("ten", 10, 3));
        cards.getFlashcards().add(new Flashcard("eleven", 11, 3));
    }    

}
