package br.com.carv.drugstore.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
public abstract class GenericEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = 0L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID uuid;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdAt; 
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime updatedAt;
	
	private Boolean isActive;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		return Objects.hash(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericEntity other = (GenericEntity) obj;
		return Objects.equals(uuid, other.uuid);
	}
	
	@PrePersist
	private void setupCreatedAt() {
		setCreatedAt(LocalDateTime.now());
	}
	
	@PreUpdate
	private void setupUpdatedAt() {
		setUpdatedAt(LocalDateTime.now());
	}
	
}
