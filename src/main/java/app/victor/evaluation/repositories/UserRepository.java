package app.victor.evaluation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.victor.evaluation.entity.User;


public interface UserRepository extends JpaRepository <User, Long> {

}
