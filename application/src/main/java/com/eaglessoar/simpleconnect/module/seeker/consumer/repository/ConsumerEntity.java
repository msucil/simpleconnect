package com.eaglessoar.simpleconnect.module.seeker.consumer.repository;

import com.eaglessoar.simpleconnect.module.common.entity.BaseEntity;
import com.eaglessoar.simpleconnect.module.lookup.repository.entity.LookupEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class ConsumerEntity extends BaseEntity {

    private String name;
    private String address;
    @ManyToMany(cascade = CascadeType.MERGE)
    private List<LookupEntity> consumes;
    private String reference;

}
