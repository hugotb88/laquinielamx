package com.theblack.laquinielamx.daos;

import com.theblack.laquinielamx.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Victor Hugo Olvera Cruz
 */
@Repository
public interface TeamDao extends JpaRepository<Team, Long> {
}
