package org.launchcode.javawebdevtechjobsauthentication.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.launchcode.javawebdevtechjobsauthentication.models.Job;
import org.launchcode.javawebdevtechjobsauthentication.models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
