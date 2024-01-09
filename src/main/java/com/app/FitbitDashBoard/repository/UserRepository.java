package com.app.FitbitDashBoard.repository;

import com.app.FitbitDashBoard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
