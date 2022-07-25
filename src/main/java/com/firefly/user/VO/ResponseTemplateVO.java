package com.firefly.user.VO;

import com.firefly.user.entity.Usere;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Usere usere;
    private Department department;
}
