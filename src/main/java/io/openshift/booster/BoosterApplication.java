/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.openshift.booster;

import java.util.ArrayList;
import java.util.List;

import com.cloudant.client.api.CloudantClient;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration
@SpringBootApplication
@RestController
//@EnableJpaRepositories(basePackages = "io.openshift.booster")
public class BoosterApplication {

    @Autowired
    private CloudantClient client;

    public static void main(String[] args) {
        SpringApplication.run(BoosterApplication.class, args);
    }

    @Bean
    public JacksonJsonProvider jsonProvider() {
        return new JacksonJsonProvider();
    }

    @GetMapping("cloudant")
    String Cloudant() {        
        List<String> list = new ArrayList<>();
        try {
            list = client.getAllDbs();
        } catch (NullPointerException ex) {
            return "Server Error:" + ex.getMessage();
        }
        return "Cloudent is running and available databases are:" + list.toString();
    }
}
