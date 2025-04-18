package cars.carbon.printService.model.WorkOrders;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="Plates")
public class Plates {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long workorderid;
    private long plate_sequence;
}
