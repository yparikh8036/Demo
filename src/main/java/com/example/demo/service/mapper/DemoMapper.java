package com.example.demo.service.mapper;

import com.example.demo.domain.Demo;
import com.example.demo.service.dto.DemoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {})
public interface DemoMapper extends EntityMapper<DemoDTO, Demo> {


    Demo toEntity(DemoDTO demoDTO);



    DemoDTO toDto(Demo demo);

    default Demo fromId(Long id) {
        if (id == null) {
            return null;
        }
        Demo leave = new Demo();
        leave.setId(id);
        return leave;
    }
}
