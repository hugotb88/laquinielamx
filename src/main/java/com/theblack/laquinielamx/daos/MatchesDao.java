package com.theblack.laquinielamx.daos;

import com.theblack.laquinielamx.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Victor Hugo Olvera Cruz
 */
@Repository
public interface MatchesDao extends JpaRepository<Match,Long> {
}
