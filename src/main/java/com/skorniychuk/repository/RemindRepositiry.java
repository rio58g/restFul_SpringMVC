package com.skorniychuk.repository;

import com.skorniychuk.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepositiry extends JpaRepository<Remind, Long> {
}
