package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.Id.RamId;
import es.neilhdezs.reaktor.models.Ram;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRamRepository extends JpaRepository <Ram, RamId>
{
}
