package es.neilhdezs.reaktor.models.Id;

import es.neilhdezs.reaktor.models.Motherboard;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Neil Hdez
 */
@Embeddable
@Getter
@Setter
public class CpuId implements Serializable
{

    @Serial
    private static final long serialVersionUID = -8958993707778577542L;

    private Long idCpu;

    @OneToOne
    @JoinColumn(name = "serial_number_motherboard")
    private Motherboard motherboard;

    public CpuId()
    {

    }
}
