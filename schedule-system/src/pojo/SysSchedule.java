package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysSchedule {
    private Integer id;
    private Integer userId;
    private String title;
    private Integer completed;
}
