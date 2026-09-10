package com.portafolio.my_portafolio_backend.repository;

import com.portafolio.my_portafolio_backend.model.PersonalInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonalInfoRepositoryImpl implements IPersonalInfoRepository{

    private final JdbcTemplate jdbcTemplate;

    private final RowMapper<PersonalInfo> personalInfoRowMapper = (rs, numRow) -> {
        PersonalInfo info = new PersonalInfo();
        info.setId(rs.getLong("id"));
        info.setFirstName(rs.getString("first_name"));
        info.setLastName(rs.getString("last_name"));
        info.setTitle(rs.getString("title"));
        info.setProfileDescription(rs.getString("profile_description"));
        info.setProfileImageUrl(rs.getString("profile_image_url"));
        info.setYearsOfExperience(rs.getObject("year_of_experience", Integer.class)); // Usar getObject para nulos
        info.setEmail(rs.getString("email"));
        info.setPhone(rs.getString("phone"));
        info.setLikedinUrl(rs.getString("linkedin_url"));
        info.setGithubUrl(rs.getString("github_url"));
        return info;
    };

    public PersonalInfoRepositoryImpl(){
        this.jdbcTemplate = new JdbcTemplate();
    }

    @Override
    public PersonalInfo save(PersonalInfo personalInfo) {
        return null;
    }

    @Override
    public Optional<PersonalInfo> findById(Long id) {
        String sql = "";
        return Optional.empty();
    }

    @Override
    public List<PersonalInfo> findAll() {
        String sql = "SELECT * FROM personal_info";
        return jdbcTemplate.query(sql, personalInfoRowMapper);
    }

    @Override
    public void deleteById(Long id) {

    }
}
