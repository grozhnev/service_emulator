package data.impl;

import data.DataEntity;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "location")
public class Location implements DataEntity {
    @NonNull
    @Column(name = "zipCode")
    Integer zipCode;

    @Column(name = "local_time")
    LocalTime localTime;
}
