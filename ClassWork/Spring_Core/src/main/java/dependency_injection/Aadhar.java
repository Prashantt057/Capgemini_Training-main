package dependency_injection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aadhar {
    private int aadharId;
    private String aadharName;
    private String DOB;

    @Override
    public String toString(){
        return aadharId + " " + aadharName +" " + DOB;
    }
}
