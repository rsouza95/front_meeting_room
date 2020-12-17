package si.rodrigosouza.crud.saladereuniao.saladereuniao.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "meetingroom")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "startHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;
    
    @Override
    public String toString() {
        return "Room [id=" + id + ",name=" + name + ",startHour=" + startHour + ",endHour=" + endHour + " ]";
    }
}
