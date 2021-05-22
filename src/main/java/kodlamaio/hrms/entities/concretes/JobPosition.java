package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_positions")
public class JobPosition {
	@Id
	@GeneratedValue // Id 1,2,3 otomatik artıcak belirtmeliyiz.
	@Column(name="id") // hangi kolona denk geliyor
	private int id;
	@Column(name="position")
	private String position;
	
	public JobPosition() {
		
	}
	
	public JobPosition(int id, String position) {
		super();
		this.id = id;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
