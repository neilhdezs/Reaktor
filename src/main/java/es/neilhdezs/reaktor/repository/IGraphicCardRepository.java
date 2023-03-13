package es.neilhdezs.reaktor.repository;

import es.neilhdezs.reaktor.models.GraphicCard;
import es.neilhdezs.reaktor.models.Id.GraphicCardId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGraphicCardRepository extends JpaRepository<GraphicCard, GraphicCardId>
{
}
