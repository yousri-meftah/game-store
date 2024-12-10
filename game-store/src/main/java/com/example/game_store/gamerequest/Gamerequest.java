package com.example.game_store.gamerequest;

import com.example.game_store.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Gamerequest extends BaseEntity {
    private String title;
    @Enumerated(EnumType.STRING)
    private gameEnum status;
}
