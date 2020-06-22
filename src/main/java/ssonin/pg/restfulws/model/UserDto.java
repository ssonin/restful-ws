package ssonin.pg.restfulws.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    @JsonIgnore
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    @JsonIgnore
    private String password;

    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }
}
