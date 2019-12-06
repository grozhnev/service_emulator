package data.impl;

import data.DataEntity;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@Table(name = "weather")
public class Weather implements DataEntity {
    @NonNull
    @Column(name = "cityCode")
    String cityCode;

    @Column(name = "temperature")
    String temerature;
}
