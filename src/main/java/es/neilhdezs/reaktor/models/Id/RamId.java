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
 * @version 1.0.0
 * @since 04/02/2023
 */
@Embeddable
@Getter
@Setter
public class RamId implements Serializable
{

    @Serial
    private static final long serialVersionUID = 340775589535544668L;

    private Long serialNumberRam;

    @OneToOne
    @JoinColumn(name = "serial_number_motherboard")
    private Motherboard motherboard;


    public RamId()
    {

    }

}
