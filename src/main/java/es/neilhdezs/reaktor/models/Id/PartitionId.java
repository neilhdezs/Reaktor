package es.neilhdezs.reaktor.models.Id;

import es.neilhdezs.reaktor.models.HardDisk;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/02/2023
 */
@Embeddable
@Getter
@Setter
public class PartitionId implements Serializable
{

    @Serial
    private static final long serialVersionUID = 2841246474444094495L;

    private Long idPartition;

    @ManyToOne
    private HardDisk hardDisk;


    public PartitionId()
    {

    }
}
