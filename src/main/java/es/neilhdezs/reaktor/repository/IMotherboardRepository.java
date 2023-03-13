package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMotherboardRepository extends JpaRepository<Motherboard, Long>
{
}
