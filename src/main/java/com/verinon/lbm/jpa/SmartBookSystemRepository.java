package com.verinon.lbm.jpa;

import com.verinon.lbm.pojos.SmartBookSystem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SmartBookSystemRepository extends JpaRepository<SmartBookSystem, Integer>
{
    List<SmartBookSystem> findByMemberName(String memberName);
}
