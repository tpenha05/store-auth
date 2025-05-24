package store.auth;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true)
public record LoginIn(
    String email,
    String password
) {
}
