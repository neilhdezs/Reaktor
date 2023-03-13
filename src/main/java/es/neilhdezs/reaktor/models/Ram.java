package es.neilhdezs.reaktor.models;

import es.neilhdezs.reaktor.models.Id.RamId;
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
@Table(name = "ram")
@Getter
@Setter
public class Ram
{
    @EmbeddedId
    private RamId id;

    @Column(name = "size")
    private Double size;

    @Column(name = "occupied_slots")
    private String occupiedSlots;

    @Column(name = "model")
    private String model;

    @Column(name = "type")
    private String type;


    public Ram()
    {
    }
}
