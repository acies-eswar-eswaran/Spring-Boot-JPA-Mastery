package com.mycompany.property.management.service.impl;

import com.mycompany.property.management.converter.PropertyConverter;
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
    @Autowired
    private PropertyConverter propertyConvertor;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        PropertyEntity pe = PropertyConverter.convertDTOtoEntity(propertyDTO);
        pe = propertyRepository.save(pe);
        propertyDTO = propertyConvertor.convertEntityToDTO(pe);
        return propertyDTO;
    }
}
