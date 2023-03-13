package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.InternetConnection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IinternetConnectionRepository extends JpaRepository<InternetConnection, Long>
{
}
