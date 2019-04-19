package com.verinon.lbm.jpa;

import com.verinon.lbm.pojos.MemberPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<MemberPojo, Integer>
{
    //List<MemberPojo> findByMember_name(String name);
}
