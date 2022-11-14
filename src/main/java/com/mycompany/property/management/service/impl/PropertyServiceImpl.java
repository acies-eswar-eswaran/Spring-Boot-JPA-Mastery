package com.mycompany.property.management.service.impl;

import com.mycompany.property.management.dto.PropertyDTO;
import com.mycompany.property.management.entity.PropertyEntity;
import com.mycompany.property.management.repository.PropertyRepository;
import com.mycompany.property.management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setAddress(propertyDTO.getAddress());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setOwnerName(propertyDTO.getOwnerName());
        pe.setPrice(propertyDTO.getPrice());
        pe.setDescription(propertyDTO.getDescription());
        propertyRepository.save(pe);
        return propertyDTO;
    }
}
