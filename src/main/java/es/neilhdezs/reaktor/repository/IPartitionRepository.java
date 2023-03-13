package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.Id.PartitionId;
import es.neilhdezs.reaktor.models.Partition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPartitionRepository extends JpaRepository<Partition, PartitionId>
{
}
