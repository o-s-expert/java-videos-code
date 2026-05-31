package expert.os.videos.ai.books;

import dev.langchain4j.cdi.spi.RegisterAIService;
import dev.langchain4j.service.SystemMessage;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RegisterAIService
public interface NextReadBookService {

    @SystemMessage("""
                   Recommend up to 3 books that should naturally follow
                    the provided book in a learning journey.
            
                    Recommendations should prioritize:
                    - conceptual progression
                    - complementary knowledge
                    - technical depth
                    - thematic similarity
            
                    For each recommendation provide:
                    - title
                    - author
                    - concise description
                    - relevant keywords
                    - a short recommendation reason
            
                    Keep recommendations concise, technically relevant,
                    and focused on software engineering and architecture learning.
            """)
    NextReadBooks nextReadBooks(BookRequest bookRequest);
}
