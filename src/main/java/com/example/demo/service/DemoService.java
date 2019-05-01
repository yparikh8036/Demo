package com.example.demo.service;

import com.example.demo.domain.Demo;
import com.example.demo.domain.DemoRel;
import com.example.demo.domain.Student;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.dto.DemoDTO;
import com.example.demo.service.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DemoService {

    private final DemoRepository demoRepository;

    private final DemoMapper demoMapper;

    @Autowired(required = true)
    public DemoService(DemoRepository demoRepository, DemoMapper demoMapper) {
        this.demoRepository = demoRepository;
        this.demoMapper = demoMapper;
    }

    public DemoDTO save(DemoDTO demoDTO) {
        Demo demo = demoMapper.toEntity(demoDTO);
        DemoRel demoRel = new DemoRel();
        demoRel.setId(demoDTO.getDemorelId());
        demo.setDemoRel(demoRel);
        return demoMapper.toDto(demoRepository.save(demo));
    }

    public List<Demo> findAll() {
        return demoRepository.findAll();
    }

    public Optional<Demo> findOne(Long id) {
        return demoRepository.findById(id);
    }

    public void delete(Long id) {
        demoRepository.deleteById(id);
    }
}
