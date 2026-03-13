package dependency_injection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person1 {
    private int id;
    private String name;
    private List<Aadhar> aadharList;

    @Override
    public String toString() {
        return id + " " + name + " " + aadharList;
    }

}
