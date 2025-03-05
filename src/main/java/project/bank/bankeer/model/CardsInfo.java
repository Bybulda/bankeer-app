package project.bank.bankeer.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Description;

@Description("DTO, stores information about cards for specific user.")
@Table(name = "cards_info")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class CardsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String cardNumber;

    @NotNull
    @NotBlank
    private String cardExpireDate;

    @NotNull
    private Integer cardCVC;

    @NotNull
    @NotBlank
    private String cardType;

    @NotNull
    @NotBlank
    private String cardHolderName;

    @NotNull
    @NotBlank
    private String cardBrand;

    @NotNull
    @NotBlank
    private String cardName;

    @NotNull
    @NotBlank
    private String accountNumber;

}
