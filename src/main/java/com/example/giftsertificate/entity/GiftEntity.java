package com.example.giftsertificate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "certificate")
public class GiftEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;
    public  String description;
    public int price;
    int duration;
    LocalDateTime createDate;
    LocalDateTime update_date;
    @ManyToMany
    private List<Tag> tag;

}
