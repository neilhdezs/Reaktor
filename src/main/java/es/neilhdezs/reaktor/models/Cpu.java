package es.neilhdezs.reaktor.models;

import es.neilhdezs.reaktor.models.Id.CpuId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Neil Hdez
 *
 * Class - CPU of computer
 */
@Entity
@Table(name = "cpu")
@Getter
@Setter
public class Cpu
{
    @EmbeddedId
    private CpuId id;

    @Column(name = "cores")
    private Integer cores;

    @Column(name = "frequency")
    private Integer frequency;

    @Column(name = "threads")
    private Integer threads;


    public Cpu()
    {
    }
}
