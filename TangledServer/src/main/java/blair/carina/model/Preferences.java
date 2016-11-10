package blair.carina.model;

import javax.persistence.*;

@Entity
@Table(name="user_preferences")
public class Preferences {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long preferencesId;

    private Long systemID;


}
