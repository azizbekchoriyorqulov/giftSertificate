package com.example.giftsertificate.repository;

import com.example.giftsertificate.entity.Tag;
import org.hibernate.sql.ast.tree.from.TableGroupProducer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {

}
