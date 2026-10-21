package CodeQuest;

public record QuizResult(
        int level,
        int totalQuestions,
        int correctAnswers,
        int incorrectAnswers,
        int score,
        double percentage
) {
}
