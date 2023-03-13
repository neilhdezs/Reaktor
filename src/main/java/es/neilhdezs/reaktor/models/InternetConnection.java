package es.neilhdezs.reaktor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Neil Hdez
 *
 * Class - Internet connection
 */
@Entity
@Table(name = "internet_connection")
@Getter
@Setter
public class InternetConnection
{
    /**
     * Attribute - id
     */
    @Id
    private Long id;

    /**
     * Attribute - name of network
     */
    @Column(nullable = false)
    private String networkName;

    /**
     * Constructor by default
     */
    public InternetConnection()
    {

    }
}
