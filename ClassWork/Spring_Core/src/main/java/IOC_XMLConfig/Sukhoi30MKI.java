package IOC_XMLConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Sukhoi30MKI {
    private Integer jetId;
    private String SqnName;

    @Override
    public String toString() {
        return jetId + " " + SqnName;
    }


}
