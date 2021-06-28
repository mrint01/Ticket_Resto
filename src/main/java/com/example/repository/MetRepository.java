package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.models.MetEntity;


@NoRepositoryBean
public interface MetRepository extends JpaRepository<MetEntity, String>  {



}
