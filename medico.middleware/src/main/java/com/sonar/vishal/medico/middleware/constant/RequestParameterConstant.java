package com.sonar.vishal.medico.middleware.constant;

import com.google.gson.annotations.SerializedName;
import com.sonar.vishal.medico.data.Header;
import com.sonar.vishal.medico.data.annotation.Default;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestParameterConstant {

    public static List<RequestParameter> listRequestParameter() {
        List<RequestParameter> requestParameters = new ArrayList<>();
        Arrays.stream(Header.class.getDeclaredFields()).forEach(field -> {
            String value = field.getAnnotation(SerializedName.class).value();
            Default defaultAnnotation = field.getAnnotation(Default.class);
            if (!defaultAnnotation.isServerParameter()) {
                requestParameters.add(getHeaderRequestParameter(value, defaultAnnotation.value()));
            }
        });
        return requestParameters;
    }

    public static RequestParameter getHeaderRequestParameter(String name, String defaultValue) {
        return new RequestParameterBuilder()
                .required(true)
                .name(name)
                .query(query -> query.defaultValue(defaultValue).model(model -> model.scalarModel(ScalarType.STRING)))
                .in(ParameterType.HEADER)
                .build();
    }
}
