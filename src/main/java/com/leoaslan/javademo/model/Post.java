package com.leoaslan.javademo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "post")
public class Post {
	@Id
    @GeneratedValue
    private Long id;

    private @NonNull String content;
}
