package com.example.demo.web;

import com.example.demo.domain.Demo;
import com.example.demo.service.DemoService;
import com.example.demo.service.dto.DemoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping("create")
    public DemoDTO createDemo(@RequestBody DemoDTO demoDTO) {
        return demoService.save(demoDTO);
    }

    @GetMapping("demo")
    public List<Demo> getAllDemo() {
        return demoService.findAll();
    }

    @GetMapping("demo/{id}")
    public Optional<Demo> getDemo(@PathVariable("id") Long id) {
        return demoService.findOne(id);
    }

    @DeleteMapping("demo/{id}")
    public void deleteDemo(@PathVariable("id") Long id) {
        demoService.delete(id);
    }

    @PutMapping("update")
    public DemoDTO updatedemo(@RequestBody DemoDTO demoDTO) {
        return demoService.save(demoDTO);
    }
}
