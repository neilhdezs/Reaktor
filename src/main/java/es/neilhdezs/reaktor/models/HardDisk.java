package es.neilhdezs.reaktor.models;

import es.neilhdezs.reaktor.models.Id.HardDiskId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 04/02/2023
 */
@Entity
@Table(name = "hard_disk")
@Getter
@Setter
public class HardDisk
{

    @EmbeddedId
    private HardDiskId id;

    @ManyToOne
    @JoinColumn
    private Motherboard motherboard;

    @Column(name = "size")
    private Double size;

    @Column(name = "occupied_space")
    private Double occupiedSpace;

    @Column(name = "model")
    private String model;

    public HardDisk()
    {
    }
}
