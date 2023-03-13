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
public class SoundCardId implements Serializable
{

    @Serial
    private static final long serialVersionUID = 3622702765595396409L;

    private Long idSoundCard;

    @OneToOne
    @JoinColumn(name = "serial_number_motherboard")
    private Motherboard motherboard;


    public SoundCardId()
    {

    }
}
