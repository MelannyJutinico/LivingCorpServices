package co.edu.unbosque.LivingCorpServices.controller;

import co.edu.unbosque.LivingCorpServices.model.dto.ServiceProviderDTO;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceRFQDTO;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/livingcorp/api/v1")
public interface ILivingCorpAPI {

    @Operation(summary = "Obtener todos los proveedores", description = "Obtiene una lista de todos los proveedores registrados")
    @GetMapping("/provider")
    ResponseEntity<List<ServiceProviderDTO>> getAllProviders();

    @Operation(summary = "Obtener proveedores por tipo de servicio", description = "Obtiene una lista de todos los proveedores relacionados a un tipo de servicio")
    @GetMapping("/provider/type/{serviceType}")
    ResponseEntity<List<ServiceProviderDTO>> getServiceProvidersByServiceType(@PathVariable String serviceType);

    @Operation(summary = "Crear un nuevo proveedor", description = "Crea un nuevo proveedor")
    @PostMapping("/provider")
    ResponseEntity<ServiceProviderDTO> createProvider(@RequestBody ServiceProviderDTO serviceProviderDTO);

    @Operation(summary = "Obtener un proveedor por id", description = "Obtiene un proveedor por su id")
    @GetMapping("/provider/{providerId}")
    ResponseEntity<ServiceProviderDTO> getServiceProvidersById(@PathVariable int providerId);


    @Operation( summary = "Obtener todas las solicitudes", description = "Obtiene una lista de solicitudes registradas")
    @GetMapping("/request")
    ResponseEntity<List<ServiceRequestDTO>> getAllRequests();

    @Operation( summary = "Obtener una solicitud  de servicio  por id", description = "Obtiene una solicitud de servicio por su id")
    @GetMapping("/request/{requestId}")
    ResponseEntity<ServiceRequestDTO> getRequestsById(@PathVariable int requestId);

    @Operation(summary = "Obtener solicitudes de servicio por usuario", description = "Obtiene una lista de solicitudes de servicio asociadas con un usuario")
    @GetMapping("/request/by-user/{userName}")
    ResponseEntity<List<ServiceRequestDTO>> getServiceRequestsByUser(@PathVariable String userName);

    @Operation(summary = "Guardar solcitud de servicio", description = "Crear una solicitud de servicio")
    @PostMapping("/request")
    ResponseEntity<ServiceRequestDTO> createServiceRequest(@RequestBody ServiceRequestDTO serviceRequestDTO);

    @Operation( summary = "Obtener todas las cotizaciones", description = "Obtiene una lista de solicitudes cotizaciones")
    @GetMapping("/rfq")
    ResponseEntity<List<ServiceRFQDTO>> getAllRFQ();

    @Operation( summary = "Obtener una cotizacion  de servicio  por id", description = "Obtiene una cotizacion de servicio por su id")
    @GetMapping("/rfq/{rfqId}")
    ResponseEntity<ServiceRFQDTO> getServiceRFQById(@PathVariable int rfqId);

    @Operation(summary = "Obtener cotizaciones de servicio por usuario", description = "Obtiene una lista de cotizaciones de servicio asociadas con un usuario")
    @GetMapping("/rfq/by-user/{userName}")
    ResponseEntity<List<ServiceRFQDTO>> getServiceRFQByUser(@PathVariable String userName);


    @Operation(summary = "Guardar cotizacion de servicio", description = "Crear una cotizacion de servicio")
    @PostMapping("/rfq")
    ResponseEntity<ServiceRFQDTO> createServiceRFQ(@RequestBody ServiceRFQDTO serviceRFQ);



}
