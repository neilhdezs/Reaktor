package es.neilhdezs.reaktor.models.Id;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 04/02/2023
 */
@Embeddable
@Getter
@Setter
public class HardDiskId implements Serializable
{

    @Serial
    private static final long serialVersionUID = -5976371824092890181L;

    private Long serialNumberHardDisk;

    public HardDiskId()
    {

    }
}
