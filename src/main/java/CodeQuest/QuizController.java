
package CodeQuest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    private final List<Map<String, Object>> questions = new ArrayList<>();

    public QuizController() {
        questions.add(Map.of(
            "id", 1,
            "question", "What is the output of int x = 5; System.out.println(x + 2);?",
            "options", List.of("5", "7", "52", "Error"),
            "answer", 1,
            "explanation", "5 + 2 equals 7."
        ));

        questions.add(Map.of(
            "id", 2,
            "question", "Which keyword creates an object in Java?",
            "options", List.of("class", "static", "new", "void"),
            "answer", 2,
            "explanation", "The new keyword creates an object."
        ));

        questions.add(Map.of(
            "id", 3,
            "question", "Which type stores true or false?",
            "options", List.of("int", "boolean", "String", "double"),
            "answer", 1,
            "explanation", "A boolean variable stores true or false."
        ));
    }

    @GetMapping("/questions")
    public List<Map<String, Object>> getQuestions() {
        List<Map<String, Object>> quiz = new ArrayList<>(questions);
        Collections.shuffle(quiz);
        return quiz;
    }
}

