package org.example.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDateTime;

import static org.hibernate.sql.InFragment.NULL;

@Entity
@Table(schema = "movie" , name = "rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private Integer id;

    @Column(name="rental_date",nullable=false)
    private LocalDateTime rentalDate;

    @ManyToOne
    @JoinColumn(name="inventory_id",nullable=false)
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name="customer_id",nullable=false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="staff_id",nullable=false)
    private Staff staff;

    @Column(name="return_date",columnDefinition = NULL)
    private LocalDateTime returnDate;

    @Column(name="last_update",nullable=false)
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
