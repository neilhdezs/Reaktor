package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.Cpu;
import es.neilhdezs.reaktor.models.Id.CpuId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICpuRepository extends JpaRepository<Cpu, CpuId>
{
}
