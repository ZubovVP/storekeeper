package ru.zubov.storekeeper.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Table(name = "socks")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Socks {
    @Id
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "color")
    private Color color;

    @Id
    @Column(name = "cotton_part")
    private int cottonPart;

    @NotNull
    @Column(name = "quantity")
    private int quantity;
}
