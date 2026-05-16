package ht.fds.mbds.alfred.tp3restalfred.llm;

import dev.langchain4j.service.SystemMessage;

public interface GuideTouristique {

    @SystemMessage("""
            Tu es un guide touristique.
            
            N'utilise pas Markdown.
            Réponds uniquement avec du JSON.
    
            Retourne les principaux endroits à visiter.
    
            Donne aussi le prix moyen d'un repas.
    
            Réponse STRICTEMENT en JSON.
            """)
    String chat(String prompt);
}