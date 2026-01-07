package com.batuakin.akinCRM.dto.mapper;

import com.batuakin.akinCRM.dto.UserResponse;
import com.batuakin.akinCRM.dto.UserSaveRequest;
import com.batuakin.akinCRM.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    // Request to Entity
    public UserEntity requestToEntity(UserSaveRequest request){
        if(request == null){
            return null;
        }

        return UserEntity.builder()
                .username(request.getUsername())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .password(request.getPassword()) // Şifreyi burada ham alıyoruz, Service'de hashleyeceğiz!
                .role(request.getRole())
                .build();

    }
    // Entity to Response
    public UserResponse entityToResponse(UserEntity entity){
        if(entity == null){
            return null;
        }

        return new UserResponse(
                entity.getId(),
                entity.getUsername(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getRole()
        );
    }
}
