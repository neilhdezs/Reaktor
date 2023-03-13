package es.neilhdezs.reaktor.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author Neil Hdez
 *
 * Class - Motherboard of computer
 */
@Entity
@Table(name = "motherboard")
@Getter
@Setter
public class Motherboard
{
    /**
     * Attribute - serial number ID
     */
    @Id
    @Column(name = "serial_number")
    private Long serialNumber;

    /**
     * Attribute - model of motherboard
     */
    @Column(nullable = false)
    private String model;

    /**
     * Attribute - location of motherboard
     */
    @Column(nullable = false)
    private String location;

    /**
     * Attribute - last connection of motherboard
     */
    @Column(nullable = false)
    private Date lastConnection;

    @ManyToMany(mappedBy = "motherboard")
    private List<Malware> malware;


    /**
     * Constructor by default
     */
    public Motherboard()
    {
    }

}
