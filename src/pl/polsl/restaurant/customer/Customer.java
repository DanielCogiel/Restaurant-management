package pl.polsl.restaurant.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import pl.polsl.restaurant.order.Order;

@Entity
@Table(name="CUSTOMERS")
public class Customer implements Serializable {
	int id;
	String name;
	String surname;
	int table_number;
	List<Order> orders = new ArrayList<Order>();
	
	@OneToMany(mappedBy="customer", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getTable_number() {
		return table_number;
	}
	public void setTable_number(int table_number) {
		this.table_number = table_number;
	}
}
