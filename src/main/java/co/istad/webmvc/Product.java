package co.istad.webmvc;

import lombok.Builder;

@Builder
public record Product(
        String uuid,
        String name,
        Double price
) {
}