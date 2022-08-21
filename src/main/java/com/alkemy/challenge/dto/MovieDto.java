package com.alkemy.challenge.dto;

import com.alkemy.challenge.entity.Genre;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
public class MovieDto{
    private Long id;
    private String name;
    private String image;
    private LocalDate creationDate;
    private Integer rating;
    private Long genreId;
    private List<CharacterDto> characters;

}
