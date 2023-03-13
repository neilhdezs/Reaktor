package es.neilhdezs.reaktor.models;

import es.neilhdezs.reaktor.models.Id.SoundCardId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 04/02/2023
 */
@Entity
@Table(name = "sound_card")
@Getter
@Setter
public class SoundCard
{

    @EmbeddedId
    private SoundCardId id;

    @Column(name = "model")
    private String model;

    @Column(name = "driver")
    private String driver;

    public SoundCard()
    {
    }

}
