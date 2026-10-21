package CodeQuest;

public record QuizAnswerRequest(
        Integer questionId,
        Integer selectedAnswer
) {
}
