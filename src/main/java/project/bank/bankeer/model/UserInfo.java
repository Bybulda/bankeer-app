package project.bank.bankeer.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Description;

@Description("DTO for information about specific user.")
@Table(name = "user_info")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String surname;

    @NotNull
    private String patronymic;

    @NotNull
    @NotBlank
    private String dateOfBirth;

    @NotNull
    @NotBlank
    private String password;

    @NotNull
    @NotBlank
    private String telephoneNumber;


    @NotNull
    @NotBlank
    private String role;


}

