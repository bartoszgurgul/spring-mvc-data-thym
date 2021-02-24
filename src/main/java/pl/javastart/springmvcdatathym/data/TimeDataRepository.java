package pl.javastart.springmvcdatathym.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javastart.springmvcdatathym.model.TimeData;

@Repository
public interface TimeDataRepository extends JpaRepository<TimeData, Long> {
}
