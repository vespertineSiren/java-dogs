package com.lambdaschool.javapuppies;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DogsRepository extends JpaRepository<Dog, Long> {

}
