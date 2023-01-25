package expert.os.singleton;

import java.util.Objects;

public enum TextAnalysis {

    INSTANCE;

    public String prepare(String text) {
        Objects.requireNonNull(text, "text is required");
        return text.toUpperCase();
    }
}
