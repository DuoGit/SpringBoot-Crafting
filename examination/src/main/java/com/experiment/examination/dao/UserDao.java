package com.experiment.examination.dao;

import com.experiment.examination.entity.Person;
import com.experiment.examination.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Person, Long> {

}
