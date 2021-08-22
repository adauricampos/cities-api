package com.github.adauricampos.cities_api.staties.resources;

import com.github.adauricampos.cities_api.countries.entities.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import javax.persistence.*;
import java.util.List;


@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class StateResource {

    @Id
    private Long id;

    @Column
    private String name;


    private String uf;

    private Integer ibge;



    @ManyToOne
    @JoinColumn
    private Country country;

    @Type(type = "jasonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;


}
