package com.JustinThyme.justinthymer.models.data;

import com.JustinThyme.justinthymer.models.forms.Packet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface PacketDao extends CrudRepository<Packet, Integer> {
}