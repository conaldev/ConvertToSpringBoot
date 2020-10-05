package com.minh.demo.repository;

import com.minh.demo.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProvinceRepository extends CrudRepository<Province, Long> {
}
