package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.Id.SoundCardId;
import es.neilhdezs.reaktor.models.SoundCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISoundCardRepository extends JpaRepository <SoundCard, SoundCardId>
{
}
