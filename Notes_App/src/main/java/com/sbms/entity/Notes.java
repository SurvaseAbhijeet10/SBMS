package com.sbms.entity;

import java.time.LocalDateTime;
import java.util.Optional;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Notes {

	@Id
	@GeneratedValue
	private int id;

	private String text;

	@CreationTimestamp // Auto-sets the date when a note is created
	private LocalDateTime createdAt;

	@UpdateTimestamp // Auto-updates the date when a note is modified
	private LocalDateTime updatedAt;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public Notes() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Notes(int id, String text, LocalDateTime createdAt, LocalDateTime updatedAt, User user) {
		super();
		this.id = id;
		this.text = text;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", text=" + text + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", user=" + user + "]";
	}

}
