package com.batuakin.akinCRM.dto;

import com.batuakin.akinCRM.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSaveRequest {

    @NotBlank(message = "Kullanıcı adı boş geçilemez")
    @Size(min = 3, max = 50, message = "Kullanıcı adı 3-50 karakter arasında olmalıdır")
    private String username;

    @NotBlank(message = "Ad boş geçilemez")
    private String firstName;

    @NotBlank(message = "Soyad boş geçilemez")
    private String lastName;

    @NotBlank(message = "Email boş geçilemez")
    @Email(message = "Geçerli bir email adresi giriniz")
    private String email;

    private String phone; // Zorunlu değil

    @NotBlank(message = "Şifre boş geçilemez")
    @Size(min = 6, message = "Şifre en az 6 karakter olmalıdır")
    private String password;

    @NotNull(message = "Rol seçimi zorunludur")
    private Role role;
}