package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.Id.InternetConnectionNetworkCardId;
import es.neilhdezs.reaktor.models.InternetConnectionNetworkCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IinternetConnectionNetworkCardRepository extends JpaRepository<InternetConnectionNetworkCard, InternetConnectionNetworkCardId>
{
}
