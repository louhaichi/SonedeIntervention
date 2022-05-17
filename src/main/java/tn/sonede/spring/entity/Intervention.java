package tn.sonede.spring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Intervention {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;


    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String type;
    private String status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="intervention")
    private Set<Calendar> calendars;
}
