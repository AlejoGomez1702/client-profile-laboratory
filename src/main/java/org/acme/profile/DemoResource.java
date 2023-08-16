package org.acme.profile;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemoResource 
{
	@Inject
	ClientProductSyncService service;
	
	@POST
    public ClientResponseDTO getClientProfile(
    		ClientRequestDTO request,
    		@HeaderParam("sessionId") String sessionId,
            @HeaderParam("transactionId") Long transactionId,
            @HeaderParam("consumerId") String consumerId,
            @HeaderParam("creationDateTime") String creationDateTime,
            @HeaderParam("country") String country,
            @HeaderParam("language") String language,
            @HeaderParam("ipAddress") String ipAddress
	) 
	{
		// Construir la Partition Key (Primary Key)
		String documentType = request.getClientInfo().getDocumentType();
		String documentNumber = request.getClientInfo().getDocumentNumber();		
		String primaryKey = "CLI#" + documentNumber + "-" + documentType;
		
		/**
		 * Buscar en la tabla clients_products de dynamo 
		 * un registro que haga match con la primary key
		 */
		ClientProductDTO clientProductData = service.getClientProduct(primaryKey);
		
		/**
		 * En base a la data que me retorna la consulta a dynamo
		 * debo evaluar si el cliente tiene: 
		 */
		
		// 1. hasProducts
		boolean hasProducts = clientProductData.getProduct_status() == 1;
		
		// 2. hasDebitCard
		boolean hasDebitCard = true; //****** falta implementar la lógica
		
		// 3. canOpenDigitalAccount
		boolean canOpenDigitalAccount = true; //****** falta implementar la lógica
		
		// 4. isDataUpdate
		boolean isDataUpdate = true; //****** falta implementar la lógica
		
		// 5. dataUpdateDays
		int dataUpdateDays = 1000;  //****** falta implementar la lógica
		
		// 6. familyGroupRole
		int familyGroupRole = 2;    //****** falta implementar la lógica
		
		// ***********************************
		// Falta también enviar los headers: sessionId, transactionId en el response
		// *************************************
		
		ClientResponseDTO response = new ClientResponseDTO();
		response.getClientInfo().setHasProducts(hasProducts);
		response.getClientInfo().setHasDebitCard(hasDebitCard);
		response.getClientInfo().setCanOpenDigitalAccount(canOpenDigitalAccount);
		response.getClientInfo().setDataUpdate(isDataUpdate);
		response.getClientInfo().setDataUpdateDays(dataUpdateDays);
		response.getClientInfo().setFamilyGroupRole(familyGroupRole);
				
		return response;
    }
	
}
