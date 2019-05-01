package com.example.demo.service;

import com.example.demo.domain.Demo;
import com.example.demo.domain.DemoRel;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.dto.DemoDTO;
import com.example.demo.service.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DemoService {

    private final DemoRepository demoRepository;

    private final DemoMapper demoMapper;

    public DemoService(DemoRepository demoRepository, DemoMapper demoMapper) {
        this.demoRepository = demoRepository;
        this.demoMapper = demoMapper;
    }

    public DemoDTO save(DemoDTO demoDTO) {
        Demo demo = demoMapper.toEntity(demoDTO);
        List<DemoRel> list = new ArrayList<>();
        list.add(new DemoRel("yash", demo));
        list.add(new DemoRel("parikh11111", demo));
        demo.setDemoRelList(list);
        return demoMapper.toDto(demoRepository.save(demo));
    }

    public List<Demo> findAll() {
        return demoRepository.findAll();
    }

    public Optional<Demo> findOne(Long id) {
        Optional<Demo> optionalDemo = demoRepository.findById(id);
        System.out.println("*******************" + optionalDemo);
        return optionalDemo;
    }

    public void delete(Long id) {
        demoRepository.deleteById(id);
    }
}
