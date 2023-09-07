package com.app.onlinebookstore.mapper;

import com.app.onlinebookstore.dto.BookDto;
import com.app.onlinebookstore.dto.CreateRequestDto;
import com.app.onlinebookstore.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    @Mapping(target = "id", ignore = true)
    Book toModel(CreateRequestDto requestDto);
}
