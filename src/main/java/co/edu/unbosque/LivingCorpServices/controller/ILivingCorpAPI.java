package co.edu.unbosque.LivingCorpServices.controller;

import co.edu.unbosque.LivingCorpServices.model.dto.ServiceProviderDTO;
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

    @Operation(summary = "Eliminar un proveedor por id", description = "Elimina un proveedor con su id")
    @DeleteMapping("/provider/{providerId}")
    ResponseEntity<Void> deleteServiceProvidersById(@PathVariable int providerId);
}
