package JsonExampleHW;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    private Integer id;
    @JsonProperty(value = "name")
    private String hhhhhhh;
    private String address;
    private String phoneNumber;
    private String inn;
    private String founded;
    private Securities[] securities;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class Securities {
    private String name;
    private CURRENCY[] currency;
    private String code;
    private String date;
}

enum CURRENCY {
    RUB,
    USD,
    EU
}
