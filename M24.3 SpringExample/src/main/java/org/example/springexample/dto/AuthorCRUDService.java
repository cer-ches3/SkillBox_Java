package org.example.springexample.dto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.springexample.entity.Author;
import org.example.springexample.repository.AuthorRepository;
import org.example.springexample.services.CRUDService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthorCRUDService implements CRUDService <AuthorDto>{
    private final AuthorRepository authorRepository;

    @Override
    public AuthorDto getByID(Integer id) {
        log.info("Get by id " + id);
        return mapToDto(authorRepository.findById(id).orElseThrow());
    }

    @Override
    public Collection<AuthorDto> getAll() {
        log.info("Get all");
        return authorRepository.findAll().stream()
                .map(AuthorCRUDService::mapToDto)
                .toList();
    }

    @Override
    public void create(AuthorDto authorDto) {
        log.info("Create");
        authorRepository.save(mapToEntity(authorDto));
    }

    @Override
    public void update(AuthorDto authorDto) {
        log.info("Update");
        authorRepository.save(mapToEntity(authorDto));
    }

    @Override
    public void delete(Integer id) {
        log.info("Delete id " + id);
        authorRepository.deleteById(id);
    }

    public static Author mapToEntity(AuthorDto authorDto) {
        Author author = new Author();
        author.setId(authorDto.getId());
        author.setFirstName(authorDto.getFirstName());
        author.setLastName(authorDto.getLastName());
        author.setRating(authorDto.getRating());
        author.setComments(
                authorDto.getComments()
                        .stream()
                        .map(CommentCRUDService::mapToEntity)
                        .toList());
        return  author;
    }

    public static AuthorDto mapToDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setFirstName(author.getFirstName());
        authorDto.setLastName(author.getLastName());
        authorDto.setRating(author.getRating());
        authorDto.setComments(
                author.getComments()
                        .stream()
                        .map(CommentCRUDService::mapToDto)
                        .toList()
        );
        return authorDto;
    }
}
