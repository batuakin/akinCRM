package com.batuakin.akinCRM.dto;

import com.batuakin.akinCRM.enums.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateRequest {
    @NotBlank(message = "Ad boş geçilemez")
    private String firstName;

    @NotBlank(message = "Soyad boş geçilemez")
    private String lastName;

    private String phone;

    private Role role;
}
