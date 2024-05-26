package com.example.api.controllers;

import com.example.api.models.AllAreasModel;
import com.example.api.models.AllFactsModel;
import com.example.api.models.AllFrameworkModel;
import com.example.api.models.AllSubAreasModel;
import com.example.api.models.AreaResponseModel;
import com.example.api.models.AtecoToNaceResponse;
import com.example.api.models.FactResponseModel;
import com.example.api.models.FrameworkResponseModel;
import com.example.api.models.ScoreBodyModel;
import com.example.api.models.ScoreResponseModel;
import com.example.api.models.SubAreaResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/frameworks")
    public ResponseEntity<AllFrameworkModel> getAllFrameworks() {
        // Logic to get all frameworks
        return ResponseEntity.ok(new AllFrameworkModel());
    }

    @GetMapping("/framework/{id}")
    public ResponseEntity<FrameworkResponseModel> getFramework(@PathVariable Integer id) {
        // Logic to get a specific framework by ID
        return ResponseEntity.ok(new FrameworkResponseModel());
    }

    @GetMapping("/areas/{framework_id}")
    public ResponseEntity<AllAreasModel> getAllAreas(@PathVariable Integer framework_id) {
        // Logic to get all areas for a specific framework
        return ResponseEntity.ok(new AllAreasModel());
    }

    @GetMapping("/area/{id}")
    public ResponseEntity<AreaResponseModel> getArea(@PathVariable Integer id) {
        // Logic to get a specific area by ID
        return ResponseEntity.ok(new AreaResponseModel());
    }

    @GetMapping("/subareas/{area_id}")
    public ResponseEntity<AllSubAreasModel> getAllSubAreas(@PathVariable Integer area_id) {
        // Logic to get all subareas for a specific area
        return ResponseEntity.ok(new AllSubAreasModel());
    }

    @GetMapping("/subarea/{id}")
    public ResponseEntity<SubAreaResponseModel> getSubArea(@PathVariable Integer id) {
        // Logic to get a specific subarea by ID
        return ResponseEntity.ok(new SubAreaResponseModel());
    }

    @GetMapping("/facts/{subarea_id}/{nace}")
    public ResponseEntity<AllFactsModel> getAllFacts(@PathVariable String subarea_id, @PathVariable String nace) {
        // Logic to get all facts for a specific subarea and nace
        return ResponseEntity.ok(new AllFactsModel());
    }

    @GetMapping("/fact/{id}")
    public ResponseEntity<FactResponseModel> getFact(@PathVariable Integer id) {
        // Logic to get a specific fact by ID
        return ResponseEntity.ok(new FactResponseModel());
    }

    @GetMapping("/ateco2nace/{ateco}")
    public ResponseEntity<AtecoToNaceResponse> getNaceFromAteco(@PathVariable String ateco) {
        // Logic to get nace from ateco code
        return ResponseEntity.ok(new AtecoToNaceResponse());
    }

    @PostMapping("/score")
    public ResponseEntity<ScoreResponseModel> calculateScore(@RequestBody ScoreBodyModel scoreBody) {
        // Logic to calculate score
        return ResponseEntity.ok(new ScoreResponseModel());
    }
}
