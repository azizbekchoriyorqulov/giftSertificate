package com.example.giftsertificate.repository;

import com.example.giftsertificate.entity.GiftEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiftRepository extends JpaRepository<GiftEntity, Long> {

}
