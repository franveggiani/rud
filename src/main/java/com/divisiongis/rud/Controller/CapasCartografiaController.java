package com.divisiongis.rud.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divisiongis.rud.Entity.catastro.CapasCartografia;
import com.divisiongis.rud.Service.CapasCartografiaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/capasCartografia")

public class CapasCartografiaController extends BaseControllerImpl<CapasCartografia, CapasCartografiaServiceImpl>{

    @GetMapping("/getCapasCartografia")
    public ResponseEntity<?> getCapasCartografia(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getCapasCartografia());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage() + e.getCause());
        }
    }

}
