package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Set;

@Entity
@Table(schema = "movie" , name = "actor")
public class Actor {
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    @Column(name="first_name",length = 45,nullable=false)
    private String firstName;

    @Column(name="last_name",length = 45,nullable=false)
    private String lastName;

    @Column(name="last_update",nullable=false)
    private LocalDateTime lastUpdate;

    @ManyToMany
    @JoinTable(name = "film_actor" ,
            inverseJoinColumns = @JoinColumn(name = "film_id" , referencedColumnName = "film_id"),
            joinColumns = @JoinColumn(name = "actor_id" , referencedColumnName = "actor_id")
           )
    private Set<Film> films;

    public int getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
