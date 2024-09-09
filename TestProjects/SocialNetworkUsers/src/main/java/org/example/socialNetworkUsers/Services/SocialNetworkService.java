package org.example.socialNetworkUsers.Services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.socialNetworkUsers.Dto.SocialNetworkDto;
import org.example.socialNetworkUsers.Entity.SocialNetwork;
import org.example.socialNetworkUsers.Repositories.SocialNetworkRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
@RequiredArgsConstructor
public class SocialNetworkService implements CRUDService<SocialNetworkDto> {
    private final SocialNetworkRepository socialNetworkRepository;

    @Override
    public ResponseEntity getAll() {
        Collection<SocialNetwork> socialNetworkCollection = socialNetworkRepository.findAll();
        if(socialNetworkCollection.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(socialNetworkCollection, HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity getById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity create(SocialNetworkDto socialNetworkDto) {
        return null;
    }

    @Override
    public ResponseEntity update(Integer id, SocialNetworkDto socialNetworkDto) {
        return null;
    }

    @Override
    public ResponseEntity deleteById(int id) {
        return null;
    }

    @Override
    public ResponseEntity clear() {
        return null;
    }

    public static SocialNetworkDto mapToDto(SocialNetwork socialNetwork) {
        SocialNetworkDto socialNetworkDto = new SocialNetworkDto();
        socialNetworkDto.setId(socialNetwork.getId());
        socialNetworkDto.setName(socialNetwork.getName());
        return socialNetworkDto;
    }

    public static SocialNetwork mapToEntity(SocialNetworkDto socialNetworkDto) {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.setId(socialNetworkDto.getId());
        socialNetwork.setName(socialNetworkDto.getName());
        return socialNetwork;
    }
}
