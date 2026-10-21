package CodeQuest;

import java.util.List;

public record QuizSubmissionRequest(
        Integer level,
        List<QuizAnswerRequest> answers
) {
}
