package ht.fds.mbds.alfred.tp3restalfred.resource;

import ht.fds.mbds.alfred.tp3restalfred.llm.LlmClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Ressource REST guide touristique.
 */
@Path("/guide")
public class GuideTouristiqueResource {

    @Inject
    private LlmClient llmClient;

    /**
     * Retourne des informations touristiques.
     *
     * @param villeOuPays lieu demandé
     * @return réponse JSON du LLM
     */
    @GET
    @Path("/lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String endroitsDeVisite(
            @PathParam("ville_ou_pays") String villeOuPays) {

        return llmClient.demanderInfos(villeOuPays);
    }
}