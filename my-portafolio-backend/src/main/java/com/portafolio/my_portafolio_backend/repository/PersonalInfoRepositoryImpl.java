package com.portafolio.my_portafolio_backend.repository;

import com.portafolio.my_portafolio_backend.model.PersonalInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonalInfoRepositoryImpl implements IPersonalInfoRepository{

    @Override
    public PersonalInfo save(PersonalInfo personalInfo) {
        return null;
    }

    @Override
    public Optional<PersonalInfo> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PersonalInfo> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }
}
