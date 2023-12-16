package com.example.MedTech.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "ClientProfile")
public class ClientProfile {
    @Id
    @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "ФИО не может быть пустым")
    private String credentials;
    @NotBlank(message = "Телефон не может быть пустым")
    private String telephone;
    @OneToOne(optional = false, cascade=CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn (name="account_id")
    private Account account;
    @ManyToOne(optional = false, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name="company_id")
    private Company company;
    @OneToMany (orphanRemoval = false, mappedBy = "clientProfile", fetch = FetchType.LAZY)
    private List<Request> requests;
}
