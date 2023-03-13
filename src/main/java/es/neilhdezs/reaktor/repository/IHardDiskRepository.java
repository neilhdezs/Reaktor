package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.HardDisk;
import es.neilhdezs.reaktor.models.Id.HardDiskId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHardDiskRepository extends JpaRepository<HardDisk, HardDiskId>
{
}
