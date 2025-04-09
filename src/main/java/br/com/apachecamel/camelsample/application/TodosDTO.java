package br.com.apachecamel.camelsample.application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodosDTO {
    private Long id;
    private String userId;
    private String title;
    private boolean completed;
}
