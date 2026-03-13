package mapped_dependencyI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class kit {
    private String name;
    private HashMap<String , Integer> map;
    @Override
    public String toString(){
        return name + map;
    }
}
