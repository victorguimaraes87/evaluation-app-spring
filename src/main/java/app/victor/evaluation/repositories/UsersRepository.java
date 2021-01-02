package app.victor.evaluation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.victor.evaluation.entity.Users;


public interface UsersRepository extends JpaRepository <Users, Long> {

}
