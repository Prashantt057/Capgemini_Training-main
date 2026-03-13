package dependency_injection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int pId;
    private String pName;
    private Aadhar aadhar;

    @Override
    public String toString(){
        return pId + " " + pName +" " + aadhar.toString();
    }
}
