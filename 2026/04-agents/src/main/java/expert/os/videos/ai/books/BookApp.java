package expert.os.videos.ai.books;

import jakarta.enterprise.context.control.RequestContextController;
import jakarta.enterprise.inject.se.SeContainer;

public class BookApp {

    public static void main(String[] args) {

        try(SeContainer container = jakarta.enterprise.inject.se.SeContainerInitializer.newInstance().initialize()) {
            RequestContextController requestContextController = container.select(RequestContextController.class).get();
            requestContextController.activate();
            var bookService = container.select(NextReadBookService.class).get();
            BookRequest request = new BookRequest("The Great Gatsby", "F. Scott Fitzgerald");
            var recommendations = bookService.nextReadBooks(request);
            for (var recommendation : recommendations.recommendations()) {
                System.out.println("Recommended book: " + recommendation.book().title() + " by " + recommendation.book().author());
                System.out.println("Reason: " + recommendation.reason());
            }
            requestContextController.deactivate();
        }
    }
}
