package ht.fds.mbds.alfred.tp3restalfred.llm;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.request.ResponseFormat;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import dev.langchain4j.service.AiServices;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LlmClient {

    private final GuideTouristique guide;

    public LlmClient() {

        String apiKey = System.getenv("GEMINI_KEY");

        ChatModel model = GoogleAiGeminiChatModel.builder()
                .apiKey(apiKey)
                .modelName("gemini-2.5-flash")
                .responseFormat(ResponseFormat.JSON)
                .build();

        this.guide = AiServices.create(GuideTouristique.class, model);
    }

    public String demanderInfos(String lieu, int nb) {

        return guide.chat(
                "Lieu : " + lieu +
                        ". Donne " + nb +
                        " endroits à visiter.");
    }
}