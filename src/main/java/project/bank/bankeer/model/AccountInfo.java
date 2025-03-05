package project.bank.bankeer.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Description;

@Description("DTO, stores information about user accounts.")
@Table(name = "cards_info")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class AccountInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String accountNumber;

    @NotNull
    @Min(0)
    private Long balance;


}
