package by.vyun.ishoot.service;


import by.vyun.ishoot.entity.Client;
import by.vyun.ishoot.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import java.net.http.HttpRequest;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepo clientRepo;

    public void addClient(String name) throws IOException {
        Client client = new Client();
        client.setName(name);
        URL url = new URL("http://board-games-service.herokuapp.com");
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
//            reader.lines()
//                    .reduce(String::concat)
//                    .ifPresent(System.out::println);
            //System.out.println(html);
            System.out.println("++++++++++++++++++");
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                builder.append(line).append("\n");
            }
        } catch (IOException ex) {
            System.out.println("!!!_IOException_!!!");
        }
        String html = builder.toString();
        System.out.println(html);
        client.setTerm(html);
        client.setPermission(html);
        client.setCreated(new Date());

        clientRepo.save(client);
    }
}
