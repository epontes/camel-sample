package br.com.apachecamel.camelsample;

import br.com.apachecamel.camelsample.application.TodosDTO;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:apiCall?period={{myPeriod}}")
                .setHeader("Content-Type", constant("application/json"))
                .to("{{url}}")
                .unmarshal().json(JsonLibrary.Jackson, TodosDTO.class)
                .process(exchange -> {
                    var title = exchange.getIn().getBody(TodosDTO.class).getTitle();
                    exchange.getIn().setBody(title.toUpperCase());
                })
                .log("${body}")
                .onException(Exception.class)
                .handled(true)
                .log("Error Calling API")
                .log("${body}");
    }
}
