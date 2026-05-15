package ht.fds.mbds.alfred.tp3restalfred.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Ressource REST pour le guide touristique.
 */
@Path("/guide")
public class GuideTouristiqueResource {

    /**
     * Retourne les principaux endroits à visiter pour un lieu.
     *
     * @param villeOuPays nom du lieu
     * @return tableau JSON contenant les endroits
     */
    @GET
    @Path("/lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] endroitsDeVisite(
            @PathParam("ville_ou_pays") String villeOuPays) {

        return new String[]{villeOuPays};
    }
}