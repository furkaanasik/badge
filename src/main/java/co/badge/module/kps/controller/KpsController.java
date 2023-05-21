package co.badge.module.kps.controller;

import co.badge.module.kps.controller.dtos.KpsDTO;
import co.badge.module.kps.service.KpsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Map;

@RestController
@RequestMapping("/kps")
@RequiredArgsConstructor
public class KpsController {

    private final KpsService kpsService;

    @GetMapping
    public ResponseEntity<Map<String, Serializable>> isValid(@RequestBody KpsDTO kpsDTO) {
        return ResponseEntity.ok(Map.of("success", kpsService.isValid(kpsDTO)));
    }
}
