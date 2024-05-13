package com.divisiongis.rud.Controller;

import com.divisiongis.rud.Entity.padrones_direcciones.DireccionVPD;
import com.divisiongis.rud.Service.DireccionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/direcciones")

public class DireccionController extends BaseControllerImpl<DireccionVPD, DireccionServiceImpl> {

    @GetMapping("/getAllDirecciones")
    public ResponseEntity<?> getAllDirecciones(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getAllDirecciones());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage() + e.getCause());
        }
    }
}
