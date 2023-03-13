package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.Id.NetworkCardId;
import es.neilhdezs.reaktor.models.NetworkCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INetworkCardRepository extends JpaRepository<NetworkCard, NetworkCardId>
{
}
